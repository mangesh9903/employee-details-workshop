package com.bridgelabz.model;

import java.sql.Date;
import java.time.LocalDate;

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
    private LocalDate dateOfJoining;

    public Employee() {

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

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
