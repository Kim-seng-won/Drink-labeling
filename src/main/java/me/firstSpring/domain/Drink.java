package me.firstSpring.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 20)
    private String name;

    @Column(name = "cal", nullable = false)
    private float cal;

    @Column(name = "car", nullable = false)
    private float car;

    @Column(name = "pro", nullable = false)
    private float pro;

    @Column(name = "fat", nullable = false)
    private float fat;

    @Column(name = "gro", nullable = true, length = 20)
    private String gro;

    @Column(name = "other", nullable = true, length = 255)
    private String other;

    @Builder
    public Drink(String name, float cal, float car, float pro, float fat, String gro, String other) {
        this.name = name;
        this.cal = cal;
        this.car = car;
        this.pro = pro;
        this.fat = fat;
        this.gro = gro;
        this.other = other;
    }
    public void update(String name, float cal, float car, float pro, float fat, String gro, String other) {
        this.name = name;
        this.cal = cal;
        this.car = car;
        this.pro = pro;
        this.fat = fat;
        this.gro = gro;
        this.other = other;
    }
}
