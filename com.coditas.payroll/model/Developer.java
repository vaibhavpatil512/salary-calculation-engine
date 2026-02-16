package model;

public class Developer extends Employee{

    public Developer(String name, double baseSalary, int attendanceDays, int performanceRating) {
        super(name, baseSalary, attendanceDays, performanceRating);
    }

    @Override
    public void calculateGrossSalary() {

    }

    @Override
    public void calculatePerformanceBonus() {

    }

    @Override
    public void calculateTaxSlab() {

    }

    @Override
    public void calculatePFDeduction() {

    }

    @Override
    public void calculateAttendanceDeduction() {

    }

    @Override
    public void netSalaryCalculation() {

    }
}
