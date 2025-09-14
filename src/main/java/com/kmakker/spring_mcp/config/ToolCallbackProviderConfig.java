//// src/main/java/com/kmakker/spring_mcp/config/ToolCallbackProviderConfig.java
//package com.kmakker.spring_mcp.config;
//
//import com.kmakker.spring_mcp.controller.CourseEntityController;
//import com.kmakker.spring_mcp.service.CourseService;
//import org.springframework.ai.tool.ToolCallbackProvider;
//import org.springframework.ai.support.ToolCallbacks;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ToolCallbackProviderConfig {
//
////    @Bean
////    public ToolCallbackProvider toolCallbackProvider(CourseEntityController courseEntityController,
////                                                     CourseEntityService courseEntityService) {
////        return () -> ToolCallbacks.from(courseEntityController, courseEntityService);
////    }
//
////    @Bean
////    public ToolCallbackProvider toolCallbackProvider(CourseEntityController courseEntityController) {
////        return () -> ToolCallbacks.from(courseEntityController);
////    }
//
//    @Bean
//    public ToolCallbackProvider toolCallbackProvider(CourseService courseService) {
//        return () -> ToolCallbacks.from(courseService);
//    }
//}