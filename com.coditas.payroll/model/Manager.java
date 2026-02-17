package model;

public class Manager extends Employee{
    private int teamSize;

    public Manager(String name, double baseSalary, int attendanceDays, int performanceRating, int teamSize) {
        super(name, baseSalary, attendanceDays, performanceRating);
        this.teamSize = teamSize;
    }

    @Override
    public void calculateGrossSalary() {
        double grossSalary;
        grossSalary = getBaseSalary() + teamSize * 1000;
        setGrossSalary(grossSalary);
    }
}
