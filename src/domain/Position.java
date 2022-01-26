/* Copyright 2021 freecodeformat.com */
package domain;
import com.opencsv.bean.CsvRecurse;

import java.util.List;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Position {

    private double accuracy;
    private List<Double> coordinates;
    @CsvRecurse
    private Crs crs;
    private String roi;
    private String type;
    public void setAccuracy(double accuracy) {
         this.accuracy = accuracy;
     }
     public double getAccuracy() {
         return accuracy;
     }

    public void setCoordinates(List<Double> coordinates) {
         this.coordinates = coordinates;
     }
     public List<Double> getCoordinates() {
         return coordinates;
     }

    public void setCrs(Crs crs) {
         this.crs = crs;
     }
     public Crs getCrs() {
         return crs;
     }

    public void setRoi(String roi) {
         this.roi = roi;
     }
     public String getRoi() {
         return roi;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

}