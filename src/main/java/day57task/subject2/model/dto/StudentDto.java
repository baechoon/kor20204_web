package day57task.subject2.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder //생성자 대신 객체 만들어줌
public class StudentDto {
    private int sno;
    private String sname;
    private int skor;
    private int smath;
    private int seng;

}
