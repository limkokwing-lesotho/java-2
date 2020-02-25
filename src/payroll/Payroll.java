package payroll;

public class Payroll {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setFirstName("Thabo");
        emp1.setLastName("Lebese");
        emp1.setEmployeeNumber("EMP101");
        emp1.setSalary(20_000.00);
        
        Employee emp2 = new Employee();
        emp2.setFirstName("Nthabeleng");
        emp2.setLastName("Lebese");
        emp2.setEmployeeNumber("EMP102");
        emp2.setSalary(18_578.30);
        
        emp1.pay();
        emp2.pay();
    }
}
