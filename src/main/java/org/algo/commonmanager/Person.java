package org.algo.commonmanager;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Person {

    private final List<Person> directReports = new ArrayList<>();
    private final String name;

    public Person(String name) {
        this.name=name;
    }


    public void addReport(final Person person) {
        directReports.add(person);
    }


    @Override
    public String toString() {
        return "Person{" +
                "directReports=" + directReports +
                ", name='" + name + '\'' +
                '}';
    }
}
