import java.util.*;

public class CompanyList implements CompanyManager{
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

    public void addEmployee(String name, String surname, Date birthday, double salary, String companyName){
        this.getCompanyList().get(companyName).getEmployeeList().add(new Employee(name,surname,birthday,salary,companyName));
    }
    public List<Employee> findAllEmployeesOrderedByName(String companyName){
        List<Employee> a = this.getCompanyList().get(companyName).getEmployeeList();
        a.sort(new NameComparator());
        return a;

    }
    public List<Employee> findAllEmployeesOrderedBySalary(String companyName){
        List<Employee> a = this.getCompanyList().get(companyName).getEmployeeList();
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
