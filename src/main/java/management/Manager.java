package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String niNumber, Double salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
