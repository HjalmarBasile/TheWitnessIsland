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

public class IslandAreaFragment extends Fragment {

    public IslandAreaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.island_fragment, container, false);

        List<IslandPlace> places = new ArrayList<>();
        places.add(new IslandPlace(getResources().getString(R.string.island_area_shady_trees_name), R.drawable.area_shady_trees));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_symmetry_name), R.drawable.area_symmetry));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_desert_ruin_name), R.drawable.area_desert_ruin));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_treehouse_name), R.drawable.area_treehouse));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_keep_name), R.drawable.area_keep));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_quarry_name), R.drawable.area_quarry));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_marsh_name), R.drawable.area_marsh));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_jungle_name), R.drawable.area_jungle));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_monastery_name), R.drawable.area_monastery));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_bunker_name), R.drawable.area_bunker));
        places.add(new IslandPlace(getResources().getString(R.string.island_area_town_name), R.drawable.area_town));

        final IslandPlaceAdapter adapter = new IslandPlaceAdapter(getActivity(), 0, places);
        ListView listView = rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(adapter);

        ImageView imageView = rootView.findViewById(R.id.fragment_background);
        imageView.setImageResource(R.drawable.island1);

        return rootView;
    }

}
