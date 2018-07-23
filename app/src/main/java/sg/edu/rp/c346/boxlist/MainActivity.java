package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvColour;
    ArrayList<ColourItem> alColourList;
    CustomAdapter caColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvColour = findViewById(R.id.listViewColours);
        alColourList = new ArrayList<>();

        ColourItem colour1 = new ColourItem("blue");
        ColourItem colour2 = new ColourItem("brown");
        ColourItem colour3 = new ColourItem("orange");

        alColourList.add(colour1);
        alColourList.add(colour2);
        alColourList.add(colour3);

        caColour = new CustomAdapter(this, R.layout.colour, alColourList);
        lvColour.setAdapter(caColour);

    }

}
