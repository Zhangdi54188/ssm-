package com.model;

public class Film {
    private long id;
    private String film_id;
    private String film_name;
    private String img_path;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public Film(long id, String film_id, String film_name, String img_path) {
        this.id = id;
        this.film_id = film_id;
        this.film_name = film_name;
        this.img_path = img_path;
    }

    public Film() {
    }
}
