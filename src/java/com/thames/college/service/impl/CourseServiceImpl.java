/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.service.impl;

import com.thames.college.dao.CourseDAO;
import com.thames.college.dao.impl.CourseDAOImpl;
import com.thames.college.entity.Course;
import com.thames.college.service.CourseService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Raju
 */
public class CourseServiceImpl  implements CourseService{
    CourseDAO courseDAO= new CourseDAOImpl();
    @Override
    public int insert(Course t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Course t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getById(int id) throws ClassNotFoundException, SQLException {
       return getById(id);
    }

    @Override
    public List<Course> getAll(boolean show) throws ClassNotFoundException, SQLException {
        return getAll(show);
    }

    @Override
    public int count() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
