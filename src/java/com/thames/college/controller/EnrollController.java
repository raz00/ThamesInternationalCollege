/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.controller;

import com.thames.college.entity.Course;
import com.thames.college.entity.Enquiry;
import com.thames.college.service.CourseService;
import com.thames.college.service.EnquiryService;
import com.thames.college.service.impl.CourseServiceImpl;
import com.thames.college.service.impl.EnquiryServiceImpl;
import com.thames.college.system.Controller;
import com.thames.college.system.Email;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Raju
 */
@WebServlet(name = "enroll",urlPatterns = {"/enroll/*"})
public class EnrollController extends Controller{
    private CourseService courseService=new CourseServiceImpl();
    private EnquiryService enquiryService=new EnquiryServiceImpl();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setAttribute("courses", courseService.getAll(false));
            request.getRequestDispatcher("/WEB-INF/Views/front/enroll/index.jsp").forward(request, response);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            Enquiry enquiry=new Enquiry();
            enquiry.setFirstName(request.getParameter("first_name"));
            enquiry.setLastName(request.getParameter("last_name"));
            enquiry.setEmail(request.getParameter("email"));
            enquiry.setContactNo(request.getParameter("contact_no"));
            Course c=new Course();
            c.setId(Integer.parseInt(request.getParameter("course")));
             enquiry.setCourse(c);
            enquiry.setMessage(request.getParameter("message"));
            if(enquiryService.insert(enquiry)>=1){
                sendEmail(enquiry);
                response.getWriter().println("<h1> Thank you </h1>");
            }
            
            
        }catch(Exception e){ 
            System.out.println(e.getMessage());
        }        
    }
    
    private void sendEmail(Enquiry enquiry)
    {
        Email email=new Email();
        email.setTo("raju.kunwar08@gmail.com");
        email.setFrom(enquiry.getEmail());
        email.setHost("smtp.wlink.com.np");
        email.setSubject("Enrollment Request");
        email.setBodyText(enquiry.getMessage());
        email.send();
    }
} 