package day65task.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product" )
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pno;

    @Column(columnDefinition = "varchar(50)",nullable = false)
    private String pname;

    @Column(columnDefinition = "int",nullable = false)
    private int pprice;

    @ManyToOne
    @JoinColumn(name = "mno")
    private MemberEntity memberEntity;

    @ManyToOne
    @JoinColumn(name = "cno")
    private CategoryEntity categoryEntity;

    @OneToMany(mappedBy = "productEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    List<OderEntity>oderEntityList=new ArrayList<>();

}
