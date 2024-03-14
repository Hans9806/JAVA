package collection.map.ex.Ex4;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    Map<String, Employee> employees = new HashMap<>();

    // 추가
    public void addEmployee(Employee employee) {
        employees.put(employee.id, employee);
    }
    // 조회
    public Employee getEmployee(String id) {
        return employees.get(id);
    }
    // 삭제
    public void removeEmployee(String id) {
        employees.remove(id);
    }
    // 출력
    public void printAllEmployee() {
        for (Employee employee : employees.values()) {
            System.out.println("ID: "+ employee.id+", 이름: "+ employee.name+", 부서: "+ employee.department);
        }
    }
}
