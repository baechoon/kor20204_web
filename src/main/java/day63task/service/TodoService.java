package day63task.service;

import day63task.model.dto.TodoDto;
import day63task.model.entity.TodoEntity;
import day63task.model.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired private TodoRepository todoRepository;

    //1. 등록
    public boolean write(TodoDto todoDto) {
        TodoEntity todoEntity = todoDto.toEntity();
        TodoEntity saveEntity = todoRepository.save(todoEntity);

        if (saveEntity.getTno() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //2.조회

    public List<TodoDto>print(){
        List<TodoEntity>enntityList=todoRepository.findAll();
        List<TodoDto>list=new ArrayList<>();
        for(int index=0;index<=enntityList.size()-1;index++){
            TodoEntity entity=enntityList.get(index);
            list.add(entity.toDto());
        }return list;}

    //3.수정
    @Transactional
    public boolean update(TodoDto todoDto){
        TodoEntity todoEntity=todoDto.toEntity();

        TodoEntity updateEntity=todoRepository.findById(todoEntity.getTno()).get();
        updateEntity.setTcontent(todoEntity.getTcontent());
        updateEntity.setTstate(todoEntity.getTstate());

        return true;
    }

    //4. 삭제--> int tno를 entity로?
    public boolean delete(int tno){
     TodoEntity todoEntity=todoRepository.findById(tno).get();
      todoRepository.delete(todoEntity);
     return true;
    }
}
