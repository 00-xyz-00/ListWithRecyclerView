package com.bb.listwithrecyclerview.model;
import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String picUrl;
    private String description;

    public User(String name, String picUrl, String description) {
        this.name = name;
        this.picUrl = picUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}