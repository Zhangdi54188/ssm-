package com.model;

import java.util.Date;

public class Film {
    private Long id;
    private String film_id;
    private String film_name;
    private String img_path;
    private String director;
    private String player;
    private String country;
    private Integer length;
    private String synopsis;
    private Date play_time;

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", film_id='" + film_id + '\'' +
                ", film_name='" + film_name + '\'' +
                ", img_path='" + img_path + '\'' +
                ", director='" + director + '\'' +
                ", player='" + player + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", synopsis='" + synopsis + '\'' +
                ", play_time=" + play_time +
                '}';
    }

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

    public int getLength() {
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

    public Film() {
    }

    public Film(long id, String film_id, String film_name, String img_path, String director, String player, String country, int length, String synopsis, Date play_time) {
        this.id = id;
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
}
