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

public class IslandObeliskFragment extends Fragment {

    public IslandObeliskFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.island_fragment, container, false);

        List<IslandPlace> places = new ArrayList<>();
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_desert_name), R.drawable.obelisk_desert));
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_monastery_name), R.drawable.obelisk_monastery));
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_treehouse_name), R.drawable.obelisk_treehouse));
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_river_name), R.drawable.obelisk_river));
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_quarry_name), R.drawable.obelisk_quarry));
        places.add(new IslandPlace(getResources().getString(R.string.island_obelisk_town_name), R.drawable.obelisk_town));

        final IslandPlaceAdapter adapter = new IslandPlaceAdapter(getActivity(), 0, places);
        ListView listView = rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(adapter);

        ImageView imageView = rootView.findViewById(R.id.fragment_background);
        imageView.setImageResource(R.drawable.island4);

        return rootView;
    }

}
