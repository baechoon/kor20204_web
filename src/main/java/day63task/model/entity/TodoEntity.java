package day63task.model.entity;

import day63task.model.dto.TodoDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "todolist")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoEntity extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tno; // 번호

    @Column(columnDefinition = "varchar(200)",nullable = false)
    private String tcontent;

    @Column(columnDefinition = "varchar(10)")
            private String tstate;

    public TodoDto toDto(){
        return TodoDto.builder()
                .tno(this.tno)
                .tcontent(this.tcontent)
                .tstate(this.tstate)
                .date(this.getDate().toString())
                .udate(this.getUdate().toString())
                .build();
    }
}
