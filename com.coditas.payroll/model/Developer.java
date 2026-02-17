package model;

public class Developer extends Employee {
    private int overTimeHours;

    public Developer(String name, double baseSalary, int attendanceDays, int performanceRating, int overTimeHours) {
        super(name, baseSalary, attendanceDays, performanceRating);
        this.overTimeHours = overTimeHours;
    }

    @Override
    public void calculateGrossSalary() {
        double grossSalary;
        grossSalary = getBaseSalary() + overTimeHours * 500;
        setGrossSalary(grossSalary);
    }
}