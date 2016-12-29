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
@WebServlet(name = "default",urlPatterns = {"/"})
public class DefaultController extends Controller {
    private CourseService courseService=new CourseServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            request.setAttribute("courses", courseService.getAll(false));
            request.getRequestDispatcher("/WEB-INF/Views/front/index.jsp").forward(request, response);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

