/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.dao.impl;

import com.thames.college.constant.SQLConstant;
import com.thames.college.dao.EnquiryDAO;
import com.thames.college.dbutil.DbConnection;
import com.thames.college.entity.Enquiry;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Raju
 */
public class EnquiryDAOImpl implements EnquiryDAO{
     private DbConnection conn = new DbConnection();
    @Override
    public int insert(Enquiry e) throws ClassNotFoundException, SQLException {
        conn.open();
       
        PreparedStatement stmt = conn.initStatement(SQLConstant.ENQUIRY_INSERT);
        stmt.setString(1, e.getFirstName());
        stmt.setString(2, e.getLastName());
        stmt.setString(3, e.getEmail());
        stmt.setString(4, e.getContactNo());
        stmt.setInt(5,e.getCourse().getId());
        stmt.setString(6, e.getMessage());
        int result = conn.executeUpdate();
        
       conn.close();
        return result;
    }

    @Override
    public int update(Enquiry t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enquiry getById(int id) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Enquiry> getAll(boolean show) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int count() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
