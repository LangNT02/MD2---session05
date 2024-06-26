package Excersice;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    public Employee() {
        this.employeeId = 0;
        this.employName = "";
        this.age = 0;
        this.gen = "";
        this.rate = 0.0;
        this.salary = 0.0;
    }

    public Employee(int employeeId,String employName,int age,String gen,double rate) {
        this.employeeId = employeeId;
        this.employName = employName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = 0.0;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployName() {
        return employName;
    }
    public void setEmployName(String employName) {
        this.employName = employName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGen() {
        return gen;
    }
    public void setGen(String gen) {
        this.gen = gen;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        this.employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        this.employName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        this.gen = scanner.nextLine();
        System.out.println("Nhập hệ số lương: ");
        this.rate = scanner.nextDouble();
    }
    public void displayData() {
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Tên nhân viên: " + employName);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: "+ gen);
        System.out.println("Hệ số lương: " + rate);
        System.out.println("Lương: " + salary);
    }
    public void calSalary() {
        this.salary = this.rate * 1300000;
    }
}
