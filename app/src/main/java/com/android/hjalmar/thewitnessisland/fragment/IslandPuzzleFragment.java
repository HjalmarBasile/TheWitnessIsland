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

public class IslandPuzzleFragment extends Fragment {

    public IslandPuzzleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.island_fragment, container, false);

        List<IslandPlace> places = new ArrayList<>();
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_dots), R.drawable.puzzle_dots));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_simmetry), R.drawable.puzzle_simmetry));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_trees), R.drawable.puzzle_trees));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_treehouse), R.drawable.puzzle_treehouse));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_maze), R.drawable.puzzle_maze));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_sound), R.drawable.puzzle_sound));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_secret), R.drawable.puzzle_secret));
        places.add(new IslandPlace(getResources().getString(R.string.island_puzzle_challenge), R.drawable.puzzle_challenge));

        final IslandPlaceAdapter adapter = new IslandPlaceAdapter(getActivity(), 0, places);
        ListView listView = rootView.findViewById(R.id.place_list_view);
        listView.setAdapter(adapter);

        ImageView imageView = rootView.findViewById(R.id.fragment_background);
        imageView.setImageResource(R.drawable.island2);

        return rootView;
    }

}
