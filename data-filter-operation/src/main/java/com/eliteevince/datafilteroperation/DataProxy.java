package com.eliteevince.datafilteroperation;

public class DataProxy {

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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public DataProxy(Integer id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public DataProxy() {
    }

    private Integer id;
    private String name;
    private String designation;
}
