package car.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "CAR_IMAGE")
public class CarImages {
    @Id
    private Long carId;        // carImage의 기본 키 & 외래 키

    @OneToOne
    @MapsId
    @JoinColumn(name = "carId") // Car 엔티티의 기본 키를 참조하는 외래 키
    private Car car;        // Car 엔티티
    @Column
    private String image1;
    @Column
    private String image2;
    @Column
    private String image3;
    @Column
    private String image4;
}
