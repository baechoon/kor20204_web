package day65task.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "oder" )
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ono;

    @Column(columnDefinition = "int",nullable = false)
    private int oamount;

    @ManyToOne
    @JoinColumn(name = "mno")
    private MemberEntity memberEntity;

    @ManyToOne
    @JoinColumn(name = "cno")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "pno")
    private ProductEntity productEntity;
}
