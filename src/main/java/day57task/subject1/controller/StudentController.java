package day57task.subject1.controller;

import day57task.subject1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @Autowired private StudentService studentService; //객체생성->싱글톤x
}
