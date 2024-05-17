package com.joe.di.setter;

public class ExampleBean {

    private AnotherBean anotherBean;
    private YetAnotherBean yetAnotherBean;

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public YetAnotherBean getYetAnotherBean() {
        return yetAnotherBean;
    }

    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    public String toString(){
        return "anotherBean="+anotherBean+" yetAnotherBean="+yetAnotherBean;
    }
}
