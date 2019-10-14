

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

}
