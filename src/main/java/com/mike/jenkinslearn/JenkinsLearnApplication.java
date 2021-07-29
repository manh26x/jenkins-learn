package com.mike.jenkinslearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class JenkinsLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsLearnApplication.class, args);
    }

    @GetMapping
    public String helloJenkins() {
        return "hello-jenkins.html";
    }

}
