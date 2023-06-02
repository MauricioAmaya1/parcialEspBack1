package com.dh.catalog.service;


import com.dh.catalog.feignClient.MovieClient;
import com.dh.catalog.utils.MovieDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    private MovieClient movieClient;

    public CatalogService(MovieClient movieClient) {
        this.movieClient = movieClient;
    }

    public ResponseEntity<List<MovieDto>> getMovieByGenre(String genre) {
        return movieClient.getMovieByGenre(genre);
    }
}
