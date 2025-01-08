package day57task.subject3.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class StudentDto {
    private int sno;
    private String sname;
    private int skor;
    private int smath;
    private int seng;
}
