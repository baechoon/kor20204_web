package day63task.model.dto;

import day63task.model.entity.TodoEntity;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoDto {
    private int tno;
    private String tcontent;
    private String tstate;
    private String date;
    private String udate;


    public TodoEntity toEntity(){
        return TodoEntity.builder()
                .tno(this.tno)
                .tcontent(this.tcontent)
                .tstate(this.tstate)
                .build();
    }
}
