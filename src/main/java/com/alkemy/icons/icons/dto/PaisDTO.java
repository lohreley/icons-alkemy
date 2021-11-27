package com.alkemy.icons.icons.dto;

import com.alkemy.icons.icons.entity.Continente;
import com.alkemy.icons.icons.entity.Icon;

import java.util.Set;

public class PaisDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private Long CantidadHabitantes;
    private Long superficie;
    private Continente continente;
    private Set<Icon> icons;
}