package com.android.hjalmar.thewitnessisland.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.hjalmar.thewitnessisland.R;
import com.android.hjalmar.thewitnessisland.model.IslandPlace;
import com.android.hjalmar.thewitnessisland.model.IslandPlaceAdapter;

import java.util.ArrayList;
import java.util.List;

public class IslandArtFragment extends Fragment {

    public IslandArtFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.island_fragment, container, false);

        List<IslandPlace> places = new ArrayList<>();
        places.add(new IslandPlace(getResources().getString(R.string.island_art_prayer), R.drawable.art_prayer));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_island_lady), R.drawable.art_island_lady));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_firestarter), R.drawable.art_firestarter));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_drowning_man), R.drawable.art_drowning_man));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_the_grail), R.drawable.art_the_grail));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_juggler), R.drawable.art_juggler));
        places.add(new IslandPlace(getResources().getString(R.string.island_art_mountain_top), R.drawable.art_mountain_top));

        final IslandPlaceAdapter adapter = new IslandPlaceAdapter(getActivity(), 0, places);
        ListView listView = rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(adapter);

        ImageView imageView = rootView.findViewById(R.id.fragment_background);
        imageView.setImageResource(R.drawable.island3);

        return rootView;
    }

}
