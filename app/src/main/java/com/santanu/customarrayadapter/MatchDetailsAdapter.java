package com.santanu.customarrayadapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MatchDetailsAdapter extends ArrayAdapter<MatchDetails> {

//    private static final String LOG_TAG = MatchDetailsAdapter.class.getSimpleName();


    public MatchDetailsAdapter(Activity context, ArrayList<MatchDetails> matchDetails) {

        super(context, 0, matchDetails);
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        MatchDetails currentMatchDetails = getItem(position);

        TextView homeTeamTextView = listItemView.findViewById(R.id.home_team_text_view);
        homeTeamTextView.setText(currentMatchDetails.getHomeTeam());


        TextView rivalTeamTextView = listItemView.findViewById(R.id.rival_team_text_view);

        rivalTeamTextView.setText(currentMatchDetails.getRivaleTeam());


        ImageView homeTeamLogo = listItemView.findViewById(R.id.home_team_logo_image_view);

        homeTeamLogo.setImageResource(currentMatchDetails.getHomeTeamLogoResourceId());

        TextView dateTextView = listItemView.findViewById(R.id.date_text_view);

        dateTextView.setText(currentMatchDetails.getDate());


        TextView stadiumTextView = listItemView.findViewById(R.id.stadium_text_view);

        stadiumTextView.setText(currentMatchDetails.getStadium());

        return listItemView;

    }

}
