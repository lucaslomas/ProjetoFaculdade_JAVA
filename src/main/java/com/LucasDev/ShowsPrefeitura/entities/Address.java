package com.LucasDev.ShowsPrefeitura.entities;

public class Address {

    private String state;
    private String city;

    private String road;

    private Long number;

    private Long cep;

    public Address(){

    }

    public Address(String state, String city, String road, Long number, Long cep) {
        this.state = state;
        this.city = city;
        this.road = road;
        this.number = number;
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }
}
