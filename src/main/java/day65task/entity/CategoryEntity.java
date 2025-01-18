package day65task.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category" )
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cno;

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String cname;



    @OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    List<ProductEntity>productEntityList=new ArrayList<>();

    @OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    List<OderEntity>oderEntityList=new ArrayList<>();


}
