/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.controller;

import com.thames.college.service.CourseService;
import com.thames.college.service.impl.CourseServiceImpl;
import com.thames.college.system.Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Raju
 */
@WebServlet(name = "course", urlPatterns = {"/course/*"})
public class CourseController extends Controller {

    private CourseService courseService = new CourseServiceImpl();
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String uri = request.getRequestURI().toLowerCase();
            if (uri.contains("/details")) {
                if (request.getParameter("id") != null && !request.getParameter("id").isEmpty()) {
                    int id = Integer.parseInt(request.getParameter("id"));
                    request.setAttribute("course", courseService.getById(id));
                    request.getRequestDispatcher("/WEB-INF/Views/front/course/detail.jsp").forward(request, response);
                } else {
                    response.sendRedirect(request.getContextPath());
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            response.sendRedirect(request.getContextPath());
         }
    }
}

