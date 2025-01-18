package day65task.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;

    @Column(columnDefinition = "varchar(10)",nullable = false)
    private String mname;

    @Column(columnDefinition = "varchar(20)",unique = true,nullable = false)
    private String mid;

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String mpwd;

    @Column(columnDefinition = "varchar(13)",nullable = false)
    private String mphone;

    @Column(columnDefinition = "varchar(30)",nullable = false)
    private String madress;



    @OneToMany(mappedBy = "memberEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    List<ProductEntity>productEntityList=new ArrayList<>();

    @OneToMany(mappedBy = "memberEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    List<OderEntity>oderEntityList=new ArrayList<>();



}
