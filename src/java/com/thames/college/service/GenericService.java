/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thames.college.service;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Raju
 */
public interface GenericService<T> {
    int insert (T t) throws ClassNotFoundException ,SQLException;
    int update(T t)  throws ClassNotFoundException ,SQLException; 
    int delete(int id)  throws ClassNotFoundException ,SQLException;
    T getById(int id)  throws ClassNotFoundException ,SQLException;
    List<T> getAll( boolean show)  throws ClassNotFoundException ,SQLException;
    int count()  throws ClassNotFoundException ,SQLException;
    
}
