package sg.edu.rp.c346.boxlist;

/**
 * Created by 16020267 on 23/7/2018.
 */

public class ColourItem {
    private String Colour;

    public ColourItem(String colour) {
        Colour = colour;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    @Override
    public String toString() {
        return "ColourItem{" +
                "Colour='" + Colour + '\'' +
                '}';
    }
}
