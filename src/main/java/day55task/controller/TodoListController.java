package day55task.controller;


import day55task.model.TodoListDao;
import day55task.model.TodoListDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {

    @PostMapping("/write")
    public boolean write(@RequestBody TodoListDto todoListDto){
        System.out.println("todoListController.write");
        System.out.println("todoListDto = " + todoListDto);
        boolean result= TodoListDao.getInstance().write(todoListDto);
        return result;

    }

   @GetMapping("/print")
    public ArrayList<TodoListDto>list(){
       System.out.println("TodoListController.list");
       ArrayList<TodoListDto>result=TodoListDao.getInstance().print();
       return result;
   }

   @PutMapping("/update")
    public boolean update(@RequestBody TodoListDto todoListDto){
       System.out.println("TodoListController.update");
       System.out.println("todoListDto = " + todoListDto);
       boolean result=TodoListDao.getInstance().update(todoListDto);
       return result;
   }
   @DeleteMapping("/delete")
    public boolean delete(@RequestParam int code){
       System.out.println("TodoListController.delete");
       System.out.println("code = " + code);
       boolean result=TodoListDao.getInstance().delete(code);
       return result;
   }
}
