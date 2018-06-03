package com.android.hjalmar.thewitnessisland.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.hjalmar.thewitnessisland.R;

import java.util.List;

/**
 * Created by hjalmar
 * On 27/05/2018.
 */
public class IslandPlaceAdapter extends ArrayAdapter<IslandPlace> {

    private final LayoutInflater mInflater = LayoutInflater.from(getContext());

    private static class ViewHolder {
        TextView placeName;
        ImageView placeImage;
    }

    public IslandPlaceAdapter(@NonNull Context context, int resource, @NonNull List<IslandPlace> places) {
        super(context, resource, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.place_item, parent, false);

            holder = new ViewHolder();
            holder.placeName = convertView.findViewById(R.id.place_name);
            holder.placeImage = convertView.findViewById(R.id.place_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        IslandPlace place = getItem(position);
        holder.placeName.setText(place.getName());
        holder.placeImage.setImageResource(place.getImageResourceId());

        return convertView;
    }

}
