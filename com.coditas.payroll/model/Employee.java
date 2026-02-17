package model;

public abstract class Employee {
    private static int noOfEmployees;
    private String name;
    private double baseSalary;
    private int attendanceDays;
    private int performanceRating;
    static final float PFpercent = 0.12f;
    private double grossSalary;
    private double attendanceDeduction;
    private double bonus;
    private double pfDeduction;
    private double tax;
    private double netSalary;

    public Employee(String name, double baseSalary, int attendanceDays, int performanceRating) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.attendanceDays = attendanceDays;
        this.performanceRating = performanceRating;
    }

    public void calculateAttendanceDeduction() {
        double dailySalary = getBaseSalary() / 30;
        int absentDays = 30 - getAttendanceDays();
        double attendanceDeduction = absentDays * dailySalary;
        setAttendanceDeduction(attendanceDeduction);
    }

    public void calculatePerformanceBonus() {
        double bonus;
        bonus = (100 + (getPerformanceRating() - 1) * 5) / 100;
        setBonus(bonus);
    }

    public void calculatePFDeduction() {
        double pf = getBaseSalary() * Employee.PFpercent;
        setPfDeduction(pf);
    }

    public void calculateTaxSlab() {
        double taxableIncome = getGrossSalary() + getBonus();
        double taxPercent = 0;
        if (taxableIncome <= 50000) taxPercent = 0.05;
        else if (taxableIncome > 50000 && taxableIncome <= 100000) taxPercent = 0.10;
        else if (taxableIncome > 100000 && taxableIncome <= 150000) taxPercent = 0.15;
        else if (taxableIncome > 150000) taxPercent = 0.20;
        double tax;
        tax = taxableIncome * taxPercent;
        setTax(tax);
    }

    public void netSalaryCalculation() {
        double netSalary;
        calculateGrossSalary();
        calculatePerformanceBonus();
        calculateTaxSlab();
        calculatePFDeduction();
        calculateAttendanceDeduction();
        netSalary = getGrossSalary() + getBonus() - getTax() - getPfDeduction() - getAttendanceDeduction();
        setNetSalary(netSalary);
    }

    public abstract void calculateGrossSalary();

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

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getAttendanceDeduction() {
        return attendanceDeduction;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPfDeduction() {
        return pfDeduction;
    }

    public double getTax() {
        return tax;
    }

    public double getNetSalary() {
        netSalaryCalculation();
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setPfDeduction(double pfDeduction) {
        this.pfDeduction = pfDeduction;
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

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setAttendanceDeduction(double attendanceDeduction) {
        this.attendanceDeduction = attendanceDeduction;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}