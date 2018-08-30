package com.john.java.tool.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.john.java.tool.model.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T1ToString {

    ObjectMapper objectMapper = new ObjectMapper();



    @Test
    public void toString10() throws Exception {
        System.out.println(objectMapper.writeValueAsString(Person.getPerson()));
        //{"id":1,"count":200,"name":"john","birthdate":1533360379431,"nick":["rod","john"]}
    }

    @Test
    public void toString11() throws Exception {
        System.out.println(objectMapper.writeValueAsString(Person.getPersons()));
        //[{"id":1,"name":"john","birthdate":1533279769192,"nick":["rod","john"]},
        // {"id":1,"name":"john","birthdate":1533279769192,"nick":["rod","john"]}]
    }



    /**
     * 常用注解
     * @JsonIgnore
     *      序列化时忽略此字段
     *      @JsonIgnoreProperties({"id", "created", "steps", "copy", "stepList"})  批量注解
     * @JsonProperty(value = "user_name")
     *      指定序列化时的字段名，默认使用属性名
     * @JsonInclude(Include.NON_EMPTY)
     *      仅在属性不为空时序列化此字段，对于字符串，即null或空字符串
     *      @JsonInclude(value= JsonInclude.Include.NON_NULL)  null不转换
     */



    @Test
    /**
     * objectMapper 设置
     */
    public void toString2() throws Exception {

        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        objectMapper.registerModule(simpleModule);

        System.out.println(objectMapper.writeValueAsString(Person.getPerson()));
        //{"id":1,"count":"200","name":"john","birthdate":1535612334831,"nick":["rod","john"]}
    }

}
