/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.dao.impl;

import com.thames.college.constant.SQLConstant;
import com.thames.college.dao.CourseDAO;
import com.thames.college.dbutil.DbConnection;
import com.thames.college.entity.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raju
 */
public class CourseDAOImpl implements CourseDAO{
    private DbConnection conn = new DbConnection();
    
    
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
        Course course = null;
        conn.open();
      
        PreparedStatement stmt = conn.initStatement(SQLConstant.COURSE_GETBYID);
        stmt.setInt(1, id);
        
        ResultSet rs =conn.executeQuery();
        while(rs.next()){
          course = mapData(rs);
            }
        conn.close();  
        return course;
    }

    @Override
    public List<Course> getAll(boolean show) throws ClassNotFoundException, SQLException {
        List<Course> courseList= new ArrayList<>();
        conn.open();
        String sql =(show)?SQLConstant.COURSE_GETALL:SQLConstant.COURSE_GETALL +"WHERE Status =1";
        PreparedStatement stmt = conn.initStatement(sql);
        
        ResultSet rs =conn.executeQuery();
        while(rs.next()){
                 courseList.add(mapData(rs));
            }
        conn.close();
        return courseList;
    }
 private Course mapData(ResultSet rs) throws SQLException{
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setName(rs.getString("name"));
            course.setDescription(rs.getString("description"));
            course.setFees(rs.getDouble("fees"));
            course.setDuration(rs.getInt("duration"));
            course.setDurationType(rs.getString("duration_type"));
            course.setStatus(rs.getBoolean("status"));
           return course;
 }
    @Override
    public int count() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
