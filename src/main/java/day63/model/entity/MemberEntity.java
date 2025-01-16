package day63.model.entity;

import day63.model.dto.MemberDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "member")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;//회원번호

    @Column(columnDefinition = "varchar(30)",nullable = false,unique = true)
    private String mid;

    @Column(columnDefinition = "varchar(30)",nullable = false)
    private String mpwd;

    @Column(columnDefinition = "varchar(10)",nullable = false)
    private String mname;

    @Column(columnDefinition = "varchar(30)",nullable = false,unique = true)
    private String mphone;

    // entity --> Dto 변환 메소드 ( 롬복 제공 하지 않음 )
    public MemberDto toDto(){
        // + 빌더패턴 이용한 인스턴스 생성
        // 클래스명.builder().멤버변수명(새로운값).build();
        return MemberDto.builder() // .builder() 빌더패턴의 시작점.
                .mno( this.mno )
                .mid( this.mid )
                // 패스워드는 보안상 생략
                .mname( this.mname )
                .mphone( this.mphone )
                .cdate( this.getCdate().toString() ) // 엔티티 생성날짜 , 가입날짜
                .udate( this.getUdate().toString() ) // 엔티티 수정날짜 , 회원정보수정 날짜.
                .build(); // .build() 빌더패턴의 끝마침.
    } // f end



}
