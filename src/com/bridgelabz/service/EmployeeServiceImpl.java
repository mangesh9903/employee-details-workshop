package com.bridgelabz.service;

import com.bridgelabz.model.Employee;
import com.bridgelabz.repository.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*********************************************************************
 * Purpose: Class for Implementation Of Employee Service.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 21-04-2022
 *
 **********************************************************************/
public class EmployeeServiceImpl implements EmployeeService {
    public static Connection connection = DbConnection.getConnection();
    public static Statement statement = null;

    /**
     * Method :- Method For Insert Values in Employee Table.
     *
     * @param employee Passing Employee Object as a input parameter.
     * @throws SQLException
     */
    @Override
    public void insertValues(Employee employee) throws SQLException {
        String sqlQuery = "insert into Employee values(" + employee.getId() + ",'"
                + employee.getName() + "','"
                + employee.getDateOfJoining() + "')";
        statement = connection.createStatement();
        statement.executeUpdate(sqlQuery);
    }

    /**
     * Method For Show All Records Present in Employee Table.
     *
     * @throws SQLException
     */
    @Override
    public void showRecords() throws SQLException {
        String sqlQuery = "select * from Employee";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(" ID :- " + resultSet.getInt("id") + "     Name :- "
                    + resultSet.getString("name") + "     DateOfJoining :- " + resultSet.getString("dateOfJoining"));
        }
    }
}
