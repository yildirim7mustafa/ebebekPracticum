package entities;

public class Employee {

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public Employee() {
    }

    final int currentYear = 2021;
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public double tax(){
        if(this.salary < 1000.0)
            return 0;
        return (salary*3)/100;
    }

    public double bonus(){
        if(workHours > 40)
            return (workHours - 40)*30;
        return 0;
    }

    public double raiseSalary(){
        if(currentYear - hireYear < 10)
            return bonus() - tax() + ((salary*5)/100);
        if(currentYear - hireYear > 9 && currentYear - hireYear < 20)
            return (((salary + bonus()) - tax())*10)/100;
        if(currentYear - hireYear > 19)
            return bonus() -tax() + (salary*15)/100;
        return salary;
    }

    @Override
    public String toString() {
        return
                "currentYear=" + currentYear +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", tax=" + tax() +
                ", bonus=" + bonus() +
                ", raised salary=" + ((salary+bonus()-tax())+raiseSalary()) + //brütten hesaplanmıs
                ", salary with tax and bonus=" + (salary-tax()+bonus()) +
                ", total salary=" + (salary + bonus());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
