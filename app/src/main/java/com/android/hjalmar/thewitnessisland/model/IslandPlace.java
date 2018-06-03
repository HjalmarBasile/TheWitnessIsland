package com.android.hjalmar.thewitnessisland.model;

/**
 * Created by hjalmar
 * On 27/05/2018.
 */
public class IslandPlace {

    private final String mName;
    private final int mImageResourceId;

    public IslandPlace(String name, int imageResourceId) {
        this.mName = name;
        this.mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @Override
    public String toString() {
        return "IslandPlace{" +
                "name='" + mName + '\'' +
                ", imageResourceId=" + mImageResourceId +
                '}';
    }

}
