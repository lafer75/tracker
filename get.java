import java.util.Scanner;

public class get {
    private final String name;
    private final int day;
    private final int month;
    private final int years;
    private final String email;
    private final int number;
    private String surname;
    private int weight;
    private int pressure;
    private int steps;
    private final int age;


    public get(String name, int day, int month,
               int years,int age, String email, int number,
               String surname, int weight, int pressure, int steps) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.years = years;
        this.age = 2022 - years;
        this.email = email;
        this.number = number;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;


    }
    //get
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYears() {
        return years;
    }

    public String getEmail() {
        return email;
    }

    public int getNumber() {
        return number;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public int getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    //set
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    //printAccountInfo
    public void printAccountInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "InfoAccount:\n" + "Name: " + this.name + "| Day: "
                + this.day + "| Month: " + this.month + "| Year: "
                + this.years+"| Years Old : "+ this.age + "| Email: "
                + this.email + "| Number: " + this.number + "| Surname: "
                + this.surname + "| Weight: " + this.weight + "| Pressure: "
                + this.pressure + "| Steps: " + this.steps;
    }
}



