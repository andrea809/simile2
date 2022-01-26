/* Copyright 2021 freecodeformat.com */
package domain;

/* Time: 2021-11-23 12:43:16 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Fauna {

    private Birds birds;
    private boolean checked;

    public void setBirds(Birds birds) {
        this.birds = birds;
    }

    public Birds getBirds() {
        return birds;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean getChecked() {
        return checked;
    }

}
