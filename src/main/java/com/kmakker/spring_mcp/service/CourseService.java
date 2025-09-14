package com.kmakker.spring_mcp.service;

import com.kmakker.spring_mcp.domain.Course;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class CourseService {

    //private static final Logger log = LoggerFactory.getLogger(CourseService.class);
    private List<Course> courses = new ArrayList<>();

    @Tool(name = "get_courses", description = "Get a list of courses from Kartik Makker")
    public List<Course> getCourses() {
        return courses;
    }

    @Tool(name = "get_course", description = "Get a single course from Kartik Makker by title")
    public Course getCourse(String title) {
        return courses.stream()
                .filter(course -> course.title().equals(title))
                .findFirst()
                .orElse(null);
    }

    @PostConstruct
    public void init() {
        courses.addAll(List.of(
                new Course("Building Web Applications with Spring Boot (FreeCodeCamp)",
                        "https://youtu.be/31KTdfRH6nY"),
                new Course("Spring Boot Tutorial for Beginners - 2023 Crash Course using Spring Boot 3",
                        "https://youtu.be/UgX5lgv4uVM"),
                new Course("Learn React",
                        "https://youtu.be/UgX5lgv4uVM")
        ));
    }
}
