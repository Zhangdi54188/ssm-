package com.VO;

import java.math.BigDecimal;
import java.util.Date;

public class PlayVo {
    private String playId;

    private String filmId;

    private Date playTime;

    private String lanType;

    private String roomId;

    private BigDecimal price;

    private String film_name;

    public PlayVo() {
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public String getLanType() {
        return lanType;
    }

    public void setLanType(String lanType) {
        this.lanType = lanType;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public PlayVo(String playId, String filmId, Date playTime, String lanType, String roomId, BigDecimal price, String film_name) {
        this.playId = playId;
        this.filmId = filmId;
        this.playTime = playTime;
        this.lanType = lanType;
        this.roomId = roomId;
        this.price = price;
        this.film_name = film_name;
    }
}
