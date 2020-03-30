package management;

import staff.Employee;

public class Director extends Employee {
    private Double budget;

    public Director(String name, String niNumber, Double salary, Double budget){
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public Double payBonus(){
        return this.salary * 0.02;
    }
}
