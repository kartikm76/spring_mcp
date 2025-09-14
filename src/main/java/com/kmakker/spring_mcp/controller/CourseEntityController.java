//package com.kmakker.spring_mcp.controller;
//
//import com.kmakker.spring_mcp.domain.Course;
//import com.kmakker.spring_mcp.domain.CourseEntity;
//import com.kmakker.spring_mcp.service.CourseEntityService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.ai.tool.annotation.Tool;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/courses")
//public class CourseEntityController {
//    private final CourseEntityService courseEntityService;
//
//    public CourseEntityController(CourseEntityService courseEntityService) {
//        this.courseEntityService = courseEntityService;
//    }
//
//    @GetMapping
//    @Tool(name = "get_all_courses", description = "Get all courses")
//    public List<Course> getAllCourses() {
//        return courseEntityService.getAllCourses();
//    }
//
//    @GetMapping("/{title}")
//    @Tool(name = "get_course", description = "Get a single course")
//    public ResponseEntity<Course> getCourseByTitle(@PathVariable String title) {
//        Course course = courseEntityService.getCourseByTitle(title);
//        if (course == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(course);
//    }
//
//    @PostMapping
//    public ResponseEntity<CourseEntity> saveCourseEntity(@RequestBody CourseEntity courseEntity) {
//        CourseEntity saved = courseEntityService.saveCourseEntity(courseEntity);
//        return ResponseEntity.ok(saved);
//    }
//}