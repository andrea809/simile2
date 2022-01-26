/* Copyright 2021 freecodeformat.com */
package domain;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Weather {

    private Sky sky;
    private double temperature;
    private double wind;

    public void setSky(Sky sky) {
        this.sky = sky;
    }

    public Sky getSky() {
        return sky;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setWind(double wind) {
        this.wind = wind;
    }

    public double getWind() {
        return wind;
    }

}
