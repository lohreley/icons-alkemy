package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.dto.PaisDTO;
import org.springframework.stereotype.Service;

@Service
public class PaisService {

    public PaisDTO save(PaisDTO dto){

        System.out.println("GUARDAR PAIS");
        return dto;
    }
}
