package day63.model.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@Getter
@MappedSuperclass //현재 클래스는 데이터베이스의 매핑하지 않고 상속받은 엔티티에 속성을 매핑한다
                  // 해당 클래스는 매핑하지 않는다 . 해당 클래스를 상속받은 클래스가 헤당 클래스 엔티티의 속성을 매핑한다
                  //슈퍼 클래스 목적으로 사용할 클래스 (자체적인 매핑없음)
@EntityListeners(AuditingEntityListener.class)//
public class BaseTime {
    @CreatedDate
    private LocalDateTime cdate;// 엔티티 생성날짜 시간

    @LastModifiedDate
    private LocalDateTime udate;//엔티티 수정된 날짜 시간
}
