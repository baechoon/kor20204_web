package day64task.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CategoryEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cno;

    @Column(columnDefinition = "varchar(20)",nullable = false)
    private String cname;

    @OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    private List<ProductEntity>productEntity=new ArrayList<>();

    @OneToMany(mappedBy = "categoryEntity",cascade = CascadeType.ALL)
    @ToString.Exclude
    @Builder.Default
    private List<OderEntity>oderEntity=new ArrayList<>();

}
