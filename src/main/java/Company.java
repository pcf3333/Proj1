package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Queue;

public class Company {

    private String companyName;
    private String description;
    private List<Employee> employeeList = new ArrayList<>();
    Company(String Name,String Description)
    {
        this.companyName =Name;
        this.description =Description;
        Double d=5.0;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public List<Employee> getEmployeeList()  {
        return employeeList;
    }

    public String getDescription() {
        return description;
    }
    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName){
        employeeList.add(new Employee(name,surname,birthday,salary,companyName));
    }
    public List<Employee> findAllEmployeesOrderedByName(){
        List<Employee> a = this.getEmployeeList();
        a.sort(new NameComparator());
        return a;

    }
    public List<Employee> findAllEmployeesOrderedBySalary(){
        List<Employee> a = this.getEmployeeList();
        a.sort(new SalaryComparator());
        return a;
    }

    class NameComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee employee, Employee t1) {
            return (employee.getName()+employee.getSurname()).compareTo((t1.getName()+t1.getSurname()));
        }

    }
    class SalaryComparator implements Comparator<Employee>{
        @Override
        public int compare(Employee employee, Employee t1) {
            return Double.compare(employee.getSalary(),t1.getSalary());
        }

    }
}
