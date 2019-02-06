package com._02.DI;

public class EmployeeConstructorInjection {
    private String name;
    private String surname;
    private long salary;
    private int birthYear;
    private char gender;

    public EmployeeConstructorInjection(String name, String surname, long salary, int birthYear, char gender) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    @Override
    public String  toString() {
        return "EmployeeConstructorInjection{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", birthYear=" + birthYear +
                ", gender=" + gender +
                '}';
    }
}
