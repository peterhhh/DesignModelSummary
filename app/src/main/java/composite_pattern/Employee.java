package composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dingbin
 * @date 2019/4/25 15:25
 */

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;


    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){

        return subordinates;
    }






}
