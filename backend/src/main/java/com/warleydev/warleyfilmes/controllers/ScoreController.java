package com.warleydev.warleyfilmes.controllers;

import com.warleydev.warleyfilmes.dto.MovieDTO;
import com.warleydev.warleyfilmes.dto.ScoreDTO;
import com.warleydev.warleyfilmes.services.MovieService;
import com.warleydev.warleyfilmes.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;
    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){
        return service.saveScore(dto);
    }
}
