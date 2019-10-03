package com.company;

import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    private Date birthday;
    private double salary;
    private String companyname;

    Employee(String name,String surname,Date birthday,double salary, String companyname){
        this.birthday=birthday;
        this.companyname=companyname;
        this.name=name;
        this.salary=salary;
        this.surname=surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getSalary() {
        return salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
