package com.john.java.tool.jackson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.john.java.tool.model.Person;
import org.junit.Test;

import java.util.Date;

public class T2Node {

    ObjectMapper objectMapper = new ObjectMapper();



    @Test
    public void toString1() throws Exception {
        JsonNode node = objectMapper.readValue(Person.personStr, JsonNode.class);
        System.out.println(node.get("name"));
    }


}
