package com.cydeo.bootstrap;

import com.cydeo.entity.*;
import com.cydeo.enums.Gender;
import com.cydeo.enums.State;
import com.cydeo.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    private final UserService userService;
    private final RoleService roleService;
    private final CourseService courseService;
    private final LessonService lessonService;
    private final StudentService studentService;

    public DataGenerator(UserService userService, RoleService roleService, CourseService courseService, LessonService lessonService, StudentService studentService) {
        this.userService = userService;
        this.roleService = roleService;
        this.courseService = courseService;
        this.lessonService = lessonService;
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) throws Exception {
        Role admin = new Role(1L, "Admin");
        Role manager = new Role(2L, "Manager");
        Role instructor = new Role(3L, "Instructor");

        roleService.save(admin);
        roleService.save(manager);
        roleService.save(instructor);

        Address address1 = new Address("123 Main Street Anytown 12345", State.CALIFORNIA, "+1 (555) 555-1234");
        Address address2 = new Address("456 Oak Avenue Smallville 67890", State.TEXAS, "+1 (555) 555-5678");
        Address address3 = new Address("789 Maple Drive Suburbia 45678", State.NEW_YORK, "+1 (555) 555-9012");
        Address address4 = new Address("321 Elm Street Springfield 23456", State.ILLINOIS, "+1 (555) 555-2456");
        Address address5 = new Address("567 Pine Road Lakeside 78901", State.FLORIDA, "+1 (555) 555-7890");
        Address address6 = new Address("789 Maple Drive Suburbia 45678", State.NEW_YORK, "+1 (555) 555-9012");
        Address address7 = new Address("321 Elm Street Springfield 23456", State.ILLINOIS, "+1 (555) 555-3456");
        Address address8 = new Address("890 Cedar Lane Mountainview 56789", State.COLORADO, "+1 (555) 555-2345");
        Address address9 = new Address("101 Pineapple Avenue Beachtown 98765", State.HAWAII, "+1 (555) 555-6789");

        User user1 = new User("Michael", "Jordan", "mick@gmail.com", "PassWord$1", "PassWord$1", admin, Gender.MALE, address1);
        User user2 = new User("Larry", "Bird", "larry@gmail.com", "PassWord$2", "PassWord$2", manager, Gender.MALE, address2);
        User user3 = new User("Angelina", "Sea", "star@yahoo.com", "PassWord$3", "PassWord$3", instructor, Gender.FEMALE, address3);
        User user4 = new User("Elizabeth", "Loren", "loren@hotmail.com", "PassWord$4", "PassWord$4", instructor, Gender.FEMALE, address4);
        User user5 = new User("Bill", "Wooden", "bill@gmail.com", "PassWord$5", "PassWord$5", instructor, Gender.MALE, address5);


        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);


        Course course1 = new Course(1L, "Spring Boot", "Spring Boot with MVC, ORM, REST", user2, LocalDate.of(2024, 4, 10), LocalDate.of(2024, 8, 18));
        Course course2 = new Course(2L, "Java Advanced", "Functional Programming, Streams, New Features", user2, LocalDate.of(2024, 2, 4), LocalDate.of(2024, 7, 18));
        Course course3 = new Course(3L, "React Spring Rest", "Create web app with React and Spring Rest", user2, LocalDate.of(2023, 12, 24), LocalDate.of(2024, 5, 8));

        courseService.save(course1);
        courseService.save(course2);
        courseService.save(course3);

        Student student1 = new Student("Igor", "Kotlin", "igor@yahoo.com", Gender.MALE, address6);
        Student student2 = new Student("Sue", "Jayden", "sue@gmail.com", Gender.FEMALE, address7);
        Student student3 = new Student("Tina", "Davis", "tina@gmail.com", Gender.FEMALE, address8);
        Student student4 = new Student("Jorge", "News", "news@gmail.com", Gender.MALE, address9);


        studentService.save(student1);
        studentService.save(student2);
        studentService.save(student3);
        studentService.save(student4);

        Lesson lesson1 = new Lesson(1L, "Dependency Injection", "In this lesson, you will learn the details of Injection", user3, course1);
        Lesson lesson2 = new Lesson(2L, "Bean Annotation and Component", "This lesson for how to create Bean", user3, course1);
        Lesson lesson3 = new Lesson(3L, "Lambda Expression", "How to use functional interfaces", user4, course2);
        Lesson lesson4 = new Lesson(4L, "Streams", "You will learn common methods of Stream interface", user4, course2);
        Lesson lesson5 = new Lesson(5L, "How to create API", "Basics of API creation", user5, course3);
        Lesson lesson6 = new Lesson(6L, "Single Page Application", "Introduction to front-end development", user5, course3);

        lessonService.save(lesson1);
        lessonService.save(lesson2);
        lessonService.save(lesson3);
        lessonService.save(lesson4);
        lessonService.save(lesson5);
        lessonService.save(lesson6);

    }
}
