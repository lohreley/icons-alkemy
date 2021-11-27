package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.IconDTO;
import org.springframework.stereotype.Service;

@Service
public class IconService {

    public IconDTO save(IconDTO dto){

        System.out.println("GUARDAR ICON");
        return dto;

    }
}
