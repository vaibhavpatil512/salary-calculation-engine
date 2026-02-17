package model;

public class Intern extends Employee{

    public Intern(String name, double baseSalary, int attendanceDays, int performanceRating) {
        super(name, baseSalary, attendanceDays, performanceRating);
    }

    @Override
    public void calculateGrossSalary() {
        double attendancePercent = (double)(getAttendanceDays() / 30) * 100;
        double grossSalary=0;
        if(attendancePercent<70){
            grossSalary = getBaseSalary() - (getBaseSalary() * 0.20);
        }else{
            grossSalary = getBaseSalary();
        }
        setGrossSalary(grossSalary);
    }
}
