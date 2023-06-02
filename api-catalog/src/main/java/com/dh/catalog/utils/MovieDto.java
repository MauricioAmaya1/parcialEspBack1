package com.dh.catalog.utils;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovieDto{
    private Long id;

    private String name;

    private String genre;

    private String urlStream;
}
