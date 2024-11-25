package io.multi.multimodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.multi.multimodule", "io.multi.common"})
public class MultimoduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultimoduleApplication.class, args);
    }
}
