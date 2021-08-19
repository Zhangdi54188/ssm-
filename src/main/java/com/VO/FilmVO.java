package com.VO;
//视图对象，用来展示的对象，数据库中的信息不爆露
public class FilmVO {
    private String name;
    private String filmId;
    private String imgPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public FilmVO(String name, String filmId, String imgPath) {
        this.name = name;
        this.filmId = filmId;
        this.imgPath = imgPath;
    }

    public FilmVO() {
    }
}
