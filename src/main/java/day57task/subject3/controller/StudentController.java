package day57task.subject3.controller;

import day57task.subject3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired private StudentService studentService;
}
