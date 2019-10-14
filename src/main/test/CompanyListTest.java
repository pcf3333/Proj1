import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CompanyListTest {
    CompanyList companyList=new CompanyList();
    Employee Pere = null;
    Employee Juanjo=null;
    Employee Andrea=null;

    @Before
    public void testAddCompanyTestEmployeeAndTestGetCompanyList() {
        companyList.addCompany("Boeing","Aircrafts");
        companyList.addCompany("Vueling","Aircrafts");
        companyList.addEmployee("Pere","Juanjo",null,1000000,"Boeing");
        companyList.addEmployee("Juanjo","Pere",null,100000,"Boeing");
        companyList.addEmployee("Andrea","Perez",null,2000000,"Boeing");
        Pere=companyList.getCompanyList().get("Boeing").getEmployeeList().get(0);
        Juanjo=companyList.getCompanyList().get("Boeing").getEmployeeList().get(1);
        Andrea=companyList.getCompanyList().get("Boeing").getEmployeeList().get(2);
        Assert.assertEquals("Pere",companyList.getCompanyList().get("Boeing").getEmployeeList().get(0).getName());
    }

    @Test
    public void findAllCompanies() {
        System.out.print(companyList.findAllCompanies().get(0).getCompanyName()+ " " +companyList.findAllCompanies().get(1).getCompanyName());
    }

    @Test
    public void employees() {

        assertEquals(Pere.getName(),companyList.employees("Boeing").get(0).getName());

    }


    @Test
    public void findAllEmployeesOrderedByName() {
        ArrayList<Employee> array=new ArrayList<>();
        array.add(Andrea);
        array.add(Juanjo);
        array.add(Pere);
        assertEquals(array,companyList.findAllEmployeesOrderedByName("Boeing"));

    }

    @Test
    public void findAllEmployeesOrderedBySalary() {
        ArrayList<Employee> array=new ArrayList<>();
        array.add(Juanjo);
        array.add(Pere);
        array.add(Andrea);
        assertEquals(array,companyList.findAllEmployeesOrderedBySalary("Boeing"));
    }
}