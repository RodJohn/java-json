package com.john.java.tool.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.john.java.tool.model.Person;
import org.junit.Test;

import java.util.List;

public class T2FromString {

    ObjectMapper objectMapper = new ObjectMapper();


    @Test
    /**
     * 反序列化  --
     */
    public void fromString10() throws Exception {
        Person person = objectMapper.readValue(Person.personStr, Person.class);
        System.out.println(person);
    }

    @Test
    /**
     * 反序列化数组
     */
    public void fromString11() throws Exception {
        Person person = objectMapper.readValue(Person.personStr, Person.class);
        System.out.println(person);
        List<Person> persons = objectMapper.readValue(Person.personsStr, new TypeReference<List<Person>>() {});
        System.out.println(persons);
    }



    @Test
    /**
     * 反序列化 -- 属性不完全对应
     * 1.类注解
     *      @JsonIgnoreProperties(ignoreUnknown = true)
     * 2.设置objectMapper
     *      objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
     */
    public void fromString3() throws Exception {
        String personStr = "{\"age\":1,\"name\":\"john\"}";
        Person person = objectMapper.readValue(personStr, Person.class);
        System.out.println(person);
    }






}
