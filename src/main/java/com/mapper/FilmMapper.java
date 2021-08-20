package com.mapper;

import com.model.Film;

import java.util.List;

public interface FilmMapper {
    List<Film> getFilms();
    Film detail(String filmId);
}
