package sda;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private String lastName;
    private String birthday;

    Person(String name, String lastName, String birthday) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public boolean isAdult(){
        LocalDate today = LocalDate.now();
        Period period = (Period) Period.between(LocalDate.parse(birthday), today);

        if (period.getYears()>=18){
            return true;
        }else {
            return false;
        }

        // return period.getYears()>=18
    }



}
