package com.john.java.tool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Person {

    private Integer id;
    private Long count;
    private String name;
    private Date birthdate;
    private List<String> nick;

    public static String personStr = "{\"id\":1,\"name\":\"john\",\"birthdate\":1533279263535,\"nick\":[\"rod\",\"john\"]}";
    public static String personsStr = "[{\"id\":1,\"name\":\"john\",\"birthdate\":1533279769192,\"nick\":[\"rod\",\"john\"]},{\"id\":1,\"name\":\"john\",\"birthdate\":1533279769192,\"nick\":[\"rod\",\"john\"]}]";

    public static Person getPerson() {
        Person person = new Person();
        person.setId(1);
        person.setCount(200L);
        person.setName("john");
        person.setBirthdate(new Date());
        List<String> nick = new ArrayList<>();
        nick.add("rod");
        nick.add("john");
        return person;
    }

    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person());
        persons.add(new Person());
        return persons;
    }

    public Person() {
    }

    public Person(Integer id, String name, Date birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public List<String> getNick() {
        return nick;
    }

    public void setNick(List<String> nick) {
        this.nick = nick;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
