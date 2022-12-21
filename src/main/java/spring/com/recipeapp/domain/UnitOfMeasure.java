package spring.com.recipeapp.domain;

import jakarta.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String unitOfMeasure;
}
