package com.xiangyuwenhua.school.entity;

import java.io.Serializable;

public class Thermometer implements Serializable {
    private static final long serialVersionUID = 7778L;
    private int id;
    private String t;
    private String h;
    private String time;

    public Thermometer(int id, String t, String h, String time) {
        this.id = id;
        this.t = t;
        this.h = h;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

