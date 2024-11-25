package io.multi.multimodule.presentation;

import io.multi.multimodule.UserEntity;
import io.multi.multimodule.UserMapper;
import io.multi.common.TestJava;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {

    private final UserMapper userMapper;
    private final TestJava testJava;

    public HelloController(UserMapper userMapper, TestJava testJava) {
        this.userMapper = userMapper;
        this.testJava = testJava;
    }

    @GetMapping("/users")
    public List<UserEntity> helloUsers() {
        testJava.hello();
        return userMapper.findAll(); // JSON 형식으로 반환
    }
}
