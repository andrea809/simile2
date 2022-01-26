/* Copyright 2021 freecodeformat.com */
package domain;

import com.opencsv.bean.CsvRecurse;

import java.util.Date;
import java.util.List;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Data {

    private String _id;
    private List<String> photos;
    @CsvRecurse
    private Position position;
    @CsvRecurse
    private Weather weather;
    @CsvRecurse
    private Details details;
    private Date createdAt;
    private Date updatedAt;
    private int __v;
    private Date date;

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_id() {
        return _id;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Details getDetails() {
        return details;
    }

    public void setCreatedAt(Date createdat) {
        this.createdAt = createdat;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setUpdatedAt(Date updatedat) {
        this.updatedAt = updatedat;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void set_v(int _v) {
        this.__v = _v;
    }

    public int get_v() {
        return __v;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return _id + " - lat:= " + position.getCoordinates().get(1)
                + " lon:= " + position.getCoordinates().get(0)
                + " - data = " + createdAt;
    }

}