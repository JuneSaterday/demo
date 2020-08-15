package com.lff.demo;

import com.lff.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.math.BigInteger;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisTemplate<String, String> strRedisTemplate;


    @Autowired
    private RedisTemplate<String, Serializable> serializableRedisTemplate;

    @Test
    public void testString() {
        strRedisTemplate.opsForValue().set("strKey", "zwqh");
        System.out.println(strRedisTemplate.opsForValue().get("strKey"));
    }

    @Test
    public void testSerializable() {

/*        Student student = new Student();
        student.setStuId(1);
        student.setStuName("zhangsansan");
        student.setStuNo(new BigInteger("1001"));


        serializableRedisTemplate.opsForValue().set("student", student);
        Student student1 = (Student) serializableRedisTemplate.opsForValue().get("student");
        System.out.println(student1);*/
    }

}
