package com.VO;

import java.util.Date;

public class FilmDetailm {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getPlay_time() {
        return play_time;
    }

    public void setPlay_time(Date play_time) {
        this.play_time = play_time;
    }

    public FilmDetailm(String film_id, String film_name, String img_path, String director, String player, String country, Integer length, String synopsis, Date play_time) {
        this.film_id = film_id;
        this.film_name = film_name;
        this.img_path = img_path;
        this.director = director;
        this.player = player;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.play_time = play_time;
    }

    public FilmDetailm() {
    }

    private String film_id;
    private String film_name;
    private String img_path;
    private String director;
    private String player;
    private String country;
    private Integer length;
    private String synopsis;
    private Date play_time;
}
