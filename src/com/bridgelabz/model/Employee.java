package com.bridgelabz.model;

import java.sql.Date;
/*********************************************************************
 * Purpose: POJO Class.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 21-03-2022
 *
 **********************************************************************/
public class Employee {
    private int id;
    private String name;
    private Date dateOfJoining;

    public Employee(int id, String name, Date dateOfJoining) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
