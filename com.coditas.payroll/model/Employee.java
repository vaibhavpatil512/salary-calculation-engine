package model;

public abstract class Employee {
    private static int noOfEmployees;
    private String name;
    private double baseSalary;
    private int attendanceDays;
    private int performanceRating;
    private final float PFpercent = 0.12f;

    public abstract void calculateGrossSalary();
    public abstract void calculatePerformanceBonus();
    public abstract void calculateTaxSlab();
    public abstract void calculatePFDeduction();
    public abstract void calculateAttendanceDeduction();
    public abstract void netSalaryCalculation();

    public Employee(String name, double baseSalary, int attendanceDays, int performanceRating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.attendanceDays = attendanceDays;
        this.performanceRating = performanceRating;
    }

    public static int getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getAttendanceDays() {
        return attendanceDays;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public float getPFpercent() {
        return PFpercent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttendanceDays(int attendanceDays) {
        this.attendanceDays = attendanceDays;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }
}