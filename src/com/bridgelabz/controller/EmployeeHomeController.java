package com.bridgelabz.controller;

import com.bridgelabz.model.Employee;
import com.bridgelabz.service.EmployeeService;
import com.bridgelabz.service.EmployeeServiceImpl;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*********************************************************************
 * Purpose: Class Home Controller.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 21-04-2022
 *
 **********************************************************************/
public class EmployeeHomeController {
    public static void main(String[] args) throws ParseException, SQLException {
        System.out.println("Welcome to Employee Details Workshop.");
        EmployeeService employeeService = new EmployeeServiceImpl();
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Insert Data in Employee Table.");
            System.out.println("2. Show All Records Of Employee Table.");
            System.out.println("3. Exit From Employee Table.");

            int ch = scanner.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Insert New Data.");
                    System.out.println("Enter ID: ");
                    employee.setId(scanner.nextInt());
                    System.out.println("Enter Name: ");
                    employee.setName(scanner.next());
                    System.out.println("Enter Date Of Joining: ");
                    String date = scanner.next();
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
                    LocalDate dateOfJoining = LocalDate.parse(date, dateFormat);
                    employee.setDateOfJoining(dateOfJoining);
                    employeeService.insertValues(employee);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Data Inserted Successfully.");
                    System.out.println("----------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------  Employee Payroll Database Records ----------------------");
                    employeeService.showRecords();
                    System.out.println("===============================================================================");
                    break;
                case 3:
                    System.out.println("You Exit From Employee Details Application");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input!!!");
                    break;
            }
        }
    }
}
