package com.LucasDev.ShowsPrefeitura.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Document
public class Events {
    @Id
    private String id;

    private String name;

    private String Address;

    private Time date;

    List<Users> users = new ArrayList<>();

    public Events(){

    }

    public Events(String id, String name, String address, Time date, List<Users> users) {
        this.id = id;
        this.name = name;
        Address = address;
        this.date = date;
        this.users = users;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Events events = (Events) o;
        return Objects.equals(id, events.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
