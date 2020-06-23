package br.veni.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private String password;

    private boolean active;

}