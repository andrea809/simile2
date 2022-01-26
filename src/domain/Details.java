/* Copyright 2021 freecodeformat.com */
package domain;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Details {

    private boolean empty;
    private Fauna fauna;


    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public boolean getEmpty() {
        return empty;
    }

    public void setFauna(Fauna fauna) {
        this.fauna = fauna;
    }

    public Fauna getFauna() {
        return fauna;
    }

}