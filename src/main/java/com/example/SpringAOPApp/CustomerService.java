package com.example.SpringAOPApp;

public class CustomerService{

    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Name is "+name);
    }

    public void printUrl() {
        System.out.println("URL is "+url);
    }

    public void printThrowException(){
        throw new IllegalArgumentException();
    }


}