/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.service.impl;

import com.thames.college.dao.EnquiryDAO;
import com.thames.college.dao.impl.EnquiryDAOImpl;
import com.thames.college.entity.Enquiry;
import com.thames.college.service.EnquiryService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Raju
 */
public class EnquiryServiceImpl implements EnquiryService {
    EnquiryDAO enquiryDAO=new EnquiryDAOImpl();
    @Override
    public int insert(Enquiry e) throws ClassNotFoundException, SQLException {
        return enquiryDAO.insert(e);
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
