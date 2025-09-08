package com.kmakker.spring_mcp.service;

import com.kmakker.spring_mcp.domain.Course;
import com.kmakker.spring_mcp.domain.CourseEntity;
import com.kmakker.spring_mcp.repository.CourseEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseEntityService {
    private final CourseEntityRepository courseEntityRepository;

    public CourseEntityService(CourseEntityRepository courseEntityRepository) {
        this.courseEntityRepository = courseEntityRepository;
    }

    public List<Course> getAllCourses() {
        return courseEntityRepository.findAll()
                .stream()
                .map(entity -> new Course(entity.getTitle(), entity.getUrl()))
                .collect(Collectors.toList());
    }

    public Course getCourseByTitle(String title) {
        return courseEntityRepository.findByTitle(title)
                .map(entity -> new Course(entity.getTitle(), entity.getUrl()))
                .orElse(null);
    }

    public CourseEntity saveCourseEntity(CourseEntity courseEntity) {
        return courseEntityRepository.save(courseEntity);
    }
}
