package FinalChatGpt;

import java.util.ArrayList;

public class EmployeeTest {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<>();
        skills.add("abc");
        skills.add("java");
        skills.add("git");
        System.out.println(skills.size());
        System.out.println(skills);
        for(int i = 0; i<skills.size(); i++){
            System.out.println(skills.get(i));

        }

        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee = new Employee(101,"John Doe",50000);
        Employee employee1 = new Employee(102,"Jane Smith",60000);
        employees.add(employee);
        employees.add(employee1);
        System.out.println(employees.size());
        for (int i = 0; i<employees.size();i++) {
            Employee emp = employees.get(i);
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        }

    }
}
