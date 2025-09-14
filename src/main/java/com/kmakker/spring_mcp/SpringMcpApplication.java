package com.kmakker.spring_mcp;

import com.kmakker.spring_mcp.service.CourseService;
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
    public List<ToolCallback> danTools(CourseService courseService) {
        return List.of(ToolCallbacks.from(courseService));
    }
}


//    @Bean
//    public List<ToolCallback> toolCallback(CourseEntityController courseEntityController,
//                                           CourseEntityService courseEntityService) {
//        List<ToolCallback> tools = new ArrayList<>();
//        tools.addAll(List.of(ToolCallbacks.from(courseEntityController)));
//        tools.addAll(List.of(ToolCallbacks.from(courseEntityService)));
//        return tools;
//    }

//    private void handleClient(Socket clientSocket) {
//        try (InputStream in = clientSocket.getInputStream();
//             OutputStream out = clientSocket.getOutputStream()) {
//            // MCP protocol logic here
//        } catch (Exception e) {
//            System.err.println("Error handling client: " + e.getMessage());
//            e.printStackTrace(System.err);
//        }