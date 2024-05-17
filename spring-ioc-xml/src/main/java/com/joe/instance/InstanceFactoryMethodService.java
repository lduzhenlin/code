package com.joe.instance;

public class InstanceFactoryMethodService {

    public ObjService ObjService=new ObjService();

    public ObjService createInstance(){
        return ObjService;
    }


}
