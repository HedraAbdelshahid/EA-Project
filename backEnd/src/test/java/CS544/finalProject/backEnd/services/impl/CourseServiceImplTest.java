package CS544.finalProject.backEnd.services.impl;

import CS544.finalProject.backEnd.controllers.CourseController;
import CS544.finalProject.backEnd.models.Course;
import CS544.finalProject.backEnd.repository.CourseRepository;
import CS544.finalProject.backEnd.services.CourseService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class CourseServiceImplTest {

    @InjectMocks
    CourseController courseController;

    MockMvc mockMvc;

    @Mock
    CourseServiceImpl courseService;

    Course course = new Course();
    Course course1 = new Course();
    List<Course> courseList = new ArrayList<>();


    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(courseController).build();
        course.setId(1L);
        course.setCode("August-2020");
        course.setCourseName("EA");
        course.setDescription("Description");
        courseList.add(course);
    }

    @Test
    void save() {
        when(courseService.save(course)).thenReturn(course);
        assertEquals(course, courseService.save(course));
    }

    @Test
    void update() {

        try {
            when(courseService.update(course)).thenReturn(course);
            assertEquals(course, courseService.update(course));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    void findAll() {

        when(courseService.findAll()).thenReturn(courseList);
        assertEquals(1, courseService.findAll().size());

    }

    @Test
    void findById() {
        try {
            when(courseService.findById(1L).get()).thenReturn(course);
            assertEquals(course, courseService.findById(1L).get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}