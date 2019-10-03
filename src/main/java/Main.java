package com.company;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        CompanyList List=new CompanyList();
        List.addCompany("Hola", "Que guay");
        List.getCompanyList().get("Hola").addEmployee("Pepo", "Martínez", null, 10000, "Hola");
        List.getCompanyList().get("Hola").addEmployee("Antonio", "Martínez", null, 200, "Hola");
        List.getCompanyList().get("Hola").addEmployee("Antonio", "Aron", null, 700, "Hola");
        List<Company> check = List.findAllCompanies();
        List<Employee>a=List.getCompanyList().get("Hola").findAllEmployeesOrderedByName();
        System.out.println("Done");
    }
}
