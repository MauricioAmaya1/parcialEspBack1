package com.dh.catalog.feignClient;

import com.dh.catalog.utils.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="movie-service", url = "http://localhost:8082")
public interface MovieClient {

    @GetMapping("/api/v1/movies/{genre}")
    ResponseEntity<List<MovieDto>> getMovieByGenre(@PathVariable String genre);

}
