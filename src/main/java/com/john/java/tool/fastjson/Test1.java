package com.john.java.tool.fastjson;


import com.alibaba.fastjson.JSONObject;
import com.john.java.tool.model.Person;
import org.junit.Test;

import java.util.Date;

public class Test1 {

    private Person person = new Person(1,"john",new Date());

    @Test
    public void toString1(){
        System.out.println( JSONObject.toJSONString(person));
    }



}
