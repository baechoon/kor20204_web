package day64task.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "oder")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OderEntity extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ono;

    @Column(columnDefinition = "int",nullable = false)
    private int oamount;

    @ManyToOne
    @JoinColumn(name = "cno")
    private CategoryEntity categoryEntity;

    @ManyToOne
    @JoinColumn(name = "pno")
    private ProductEntity productEntity;
}
