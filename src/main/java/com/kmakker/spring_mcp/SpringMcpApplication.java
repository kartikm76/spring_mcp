package com.kmakker.spring_mcp;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
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

    private void handleClient(Socket clientSocket) {
        try (InputStream in = clientSocket.getInputStream();
             OutputStream out = clientSocket.getOutputStream()) {
            // MCP protocol logic here
        } catch (Exception e) {
            System.err.println("Error handling client: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }

}
