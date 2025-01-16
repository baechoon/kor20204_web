package day63task.controller;

import day63task.model.dto.TodoDto;
import day63task.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired private TodoService todoService;
    //http://localhost:8080/write
    // {"tcontent":"춘배랑 낮잠자기" "tstate":" 예정"}
    @PostMapping("/write")
    public boolean write(@RequestBody TodoDto todoDto){
       boolean result=  todoService.write(todoDto);
        return result;
    }
//http://localhost:8080/print
//{"tno": 1,"tcontent": "춘식이랑 카페가기","tstate": " 예정",
// "date": "2025-01-16T12:28:31.655727","udate": "2025-01-16T12:28:31.655727"}
    @GetMapping("/print")
    public List<TodoDto>print(){
        return todoService.print();
    }
//http://localhost:8080/update
//{ "tno":"1","tcontent":"수정 춘배랑 낮잠자기","tstate":" 예정"}
    @PutMapping("/update")
    public boolean update(@RequestBody TodoDto todoDto){
        boolean result=todoService.update(todoDto);
        return result;
    }

 //http://localhost:8080/delete?tno=1
    @DeleteMapping("/delete")
    public boolean delete(@RequestParam int tno){
        boolean result=todoService.delete(tno);
        return result;
    }

}
