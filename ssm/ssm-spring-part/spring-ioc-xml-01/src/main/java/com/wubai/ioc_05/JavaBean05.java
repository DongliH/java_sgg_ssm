package com.wubai.ioc_05;

public class JavaBean05 {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaBean05{" +
                "name='" + name + '\'' +
                '}';
    }
}
