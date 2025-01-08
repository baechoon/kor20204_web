package day57task.subject2.controller;

import day57task.subject2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired private StudentService studentService; // 싱글톤 필요 없음 , 객체생성
}
