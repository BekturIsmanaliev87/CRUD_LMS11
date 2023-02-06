package com.peaksoft.dao;

import com.peaksoft.entity.Course;
import com.peaksoft.entity.Group;
import com.peaksoft.entity.Teacher;

import java.util.List;

public interface CourseDao {
    List<Course> getAllCourses();

    void addCourse(Course course);

    void updateCourse(Long id, Course course);

    Course getById(Long id);

    void deleteCourse(Course course);
    List<Group> getGroupByCourseId(Long id);
    Teacher getTeacherById(Long id);

}
