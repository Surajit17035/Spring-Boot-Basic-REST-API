package com.luv2code.demo.entity;

public class Home {

    private String apiName;
    private String desc;

    public Home() {

    }
    public Home(String apiName, String desc) {
        this.apiName = apiName;
        this.desc = desc;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
