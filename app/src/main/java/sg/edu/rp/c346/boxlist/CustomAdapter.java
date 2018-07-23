package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020267 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ColourItem> colourList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ColourItem> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.colourList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivColour = rowView.findViewById(R.id.imageViewImg);
        ColourItem currentItem = colourList.get(position);
        if (currentItem.getColour() == "orange"){
            ivColour.setImageResource(R.drawable.orange_box);
        }
        else if (currentItem.getColour() == "blue"){
            ivColour.setImageResource(R.drawable.blue_box);

        }else{
            ivColour.setImageResource(R.drawable.brown_box);
        }
        return rowView;
    }
}
