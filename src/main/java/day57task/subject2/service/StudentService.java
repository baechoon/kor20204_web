package day57task.subject2.service;

import day57task.subject2.model.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired private StudentDao studentDao;
}
