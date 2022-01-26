/* Copyright 2021 freecodeformat.com */
package domain;
import com.opencsv.bean.CsvRecurse;

import java.util.List;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Osservazione {
    @CsvRecurse
    private Meta meta;
    @CsvRecurse
    private List<Data> data;
    public void setMeta(Meta meta) {
         this.meta = meta;
     }
     public Meta getMeta() {
         return meta;
     }

    public void setData(List<Data> data) {
         this.data = data;
     }
     public List<Data> getData() {
         return data;
     }

}