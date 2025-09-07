package com.kmakker.spring_mcp;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringMcpApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMcpApplication.class, args);
    }

    @Bean
    public List<ToolCallback> toolCallback(CourseService courseService) {
        return List.of(ToolCallbacks.from(courseService));
    }
}
