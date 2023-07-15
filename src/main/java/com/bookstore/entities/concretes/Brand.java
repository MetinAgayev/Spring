package com.bookstore.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="brands")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Brand {
    @Column(name="name")
    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

}
