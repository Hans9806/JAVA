package collection.map.ex.Ex4;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(new Employee("001", "Alice","개발"));
        manager.addEmployee(new Employee("002", "Bob","디자인"));
        manager.addEmployee(new Employee("003", "Charlie","마케팅"));

        manager.printAllEmployee();
    }
}
