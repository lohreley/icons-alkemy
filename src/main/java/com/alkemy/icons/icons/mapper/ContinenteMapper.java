package com.alkemy.icons.icons.mapper;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.entity.Continente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinenteMapper {

    public Continente continenteDTO2Entity(ContinenteDTO dto){
        Continente continenteEntity = new Continente();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }

    public ContinenteDTO continenteEntity2DTO(Continente entity){
        ContinenteDTO continenteDTO = new ContinenteDTO();
        continenteDTO.setId(entity.getId());
        continenteDTO.setImagen(entity.getImagen());
        continenteDTO.setDenominacion(entity.getDenominacion());
        return continenteDTO;
    }

    public List<ContinenteDTO> continenteEntityList2DTOList(List<Continente> entities){
        List<ContinenteDTO> dtos = new ArrayList<>();
        for(Continente entity: entities){
            dtos.add(this.continenteEntity2DTO(entity));
        }
        return dtos;
    }
}
