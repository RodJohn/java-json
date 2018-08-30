package com.john.java.tool.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.john.java.tool.model.Person;
import org.junit.Test;

import java.util.Date;

public class T2Node {

    ObjectMapper objectMapper = new ObjectMapper();
    /**
     * 1.JSON字符串-->简单对象(推荐)        ObjectMapper.readTree(studentSimStr)
     * 2.简单对象-->JSON字符串(推荐)        new JSONObject().put()
     */

    @Test
    public void toString1() throws Exception {
        JsonNode node = objectMapper.readValue(Person.personStr, JsonNode.class);
        System.out.println(node.get("name"));
    }


}
