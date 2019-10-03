package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyList {
    private Map<String,Company> CompanyList=new HashMap<>();

    public void addCompany(String companyName, String description) {
        this.CompanyList.put(companyName, new Company(companyName, description));
    }

    public Map<String, Company> getCompanyList() {
        return CompanyList;
    }
    public List<Company> findAllCompanies(){
        return new ArrayList<Company>(this.CompanyList.values());
    }
    public List<Employee> employees(String company){
        return this.CompanyList.get(company).getEmployeeList();
    }
}
