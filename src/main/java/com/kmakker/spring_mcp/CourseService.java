package com.kmakker.spring_mcp;

import com.kmakker.spring_mcp.domain.Course;
import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class CourseService {
    private List<Course> courses = new ArrayList<>();

    @Tool(name = "get_all_courses", description = "Get all courses")
    public List<Course> getCourses() {
        log.info("Fetching all courses");
        return courses;
    }

    @Tool(name = "get_course", description = "Get a single course")
    public Course getCourse(String title) {
        log.info("Fetching course with title: {}", title);
        return courses.stream()
                .filter(course -> course.title().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    };

    @PostConstruct
    public void init() {
        courses.addAll(List.of(
                new Course("Java", "https://www.javatpoint.com/java-tutorial"),
                new Course("Spring Boot", "https://www.javatpoint.com/spring-boot-tutorial"),
                new Course("Java Design Patterns", "https://www.javatpoint.com/design-patterns-in-java")
        ));
    }
}