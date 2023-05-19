package com.warleydev.warleyfilmes.services;

import com.warleydev.warleyfilmes.dto.MovieDTO;
import com.warleydev.warleyfilmes.entities.Movie;
import com.warleydev.warleyfilmes.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable){
        Page<Movie> result = repository.findAll(pageable);
        return result.map(MovieDTO::new);
    }

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id){
        Movie movie = repository.findById(id).get();
        return new MovieDTO(movie);
    }


}
