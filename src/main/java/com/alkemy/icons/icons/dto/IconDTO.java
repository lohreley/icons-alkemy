package com.alkemy.icons.icons.dto;

import com.alkemy.icons.icons.entity.Pais;

import java.time.LocalDate;
import java.util.List;

public class IconDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
    private List<Pais> paises;
}

