package com.joe.di.constructor;

public class Thing {

    private ThingOne thingOne;
    private ThingTwo thingTwo;

    public Thing(ThingOne thingOne, ThingTwo thingTwo) {
        this.thingOne = thingOne;
        this.thingTwo = thingTwo;
    }

    public ThingOne getThingOne() {
        return thingOne;
    }

    public void setThingOne(ThingOne thingOne) {
        this.thingOne = thingOne;
    }

    public ThingTwo getThingTwo() {
        return thingTwo;
    }

    public void setThingTwo(ThingTwo thingTwo) {
        this.thingTwo = thingTwo;
    }

    public String toString(){
        return "thingOne="+thingOne+" thingTwo="+thingTwo;
    }
}
