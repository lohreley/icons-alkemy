package com.alkemy.icons.icons.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Icon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion;

    private Long altura;

    private String historia;

    @ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL)
    private List<Pais> paises = new ArrayList<>();

    public void addPais(Pais pais) {this.paises.add(pais);}

    public void removePais(Pais pais) {this.paises.remove(pais);}
}
