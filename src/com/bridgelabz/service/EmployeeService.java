package com.bridgelabz.service;

import com.bridgelabz.model.Employee;

import java.sql.SQLException;

/*********************************************************************
 * Purpose: Interface for Employee Service
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 21-04-2022
 *
 **********************************************************************/
public interface EmployeeService {
    void insertValues(Employee employee) throws SQLException;

    void showRecords() throws SQLException;

    void deleteValues(int id) throws SQLException;
}
