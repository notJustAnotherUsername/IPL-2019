package com.santanu.customarrayadapter;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class TodaysMatchDetailsAdapter extends ArrayAdapter {

    public TodaysMatchDetailsAdapter(Activity context, ArrayList<TodaysMatchDetails> todaysMatchDetails) {

        super(context,0,todaysMatchDetails);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.today_match_list_item,parent,false);

        }

        TodaysMatchDetails currentMatchDetails = (TodaysMatchDetails) getItem(position);

        TextView homeTeamToday = listItemView.findViewById(R.id.home_team_today_textView);
        homeTeamToday.setText(currentMatchDetails.getHomeTeam());

        TextView awayTeamToday = listItemView.findViewById(R.id.away_team_today_textView);
        awayTeamToday.setText(currentMatchDetails.getAwayTeam());

        TextView timeStadium = listItemView.findViewById(R.id.time_stadium_textView);
        timeStadium.setText(currentMatchDetails.getTimeAndStadium());

        ImageView homeTeamTOdayLogo = listItemView.findViewById(R.id.hometeam_today_imageView);
        homeTeamTOdayLogo.setImageResource(currentMatchDetails.getHomeTeamLogo());

        ImageView awayTeamTodayLogo = listItemView.findViewById(R.id.awayteam_today_imageView);
        awayTeamTodayLogo.setImageResource(currentMatchDetails.getAwayTeamLogo());

        return listItemView;
    }
}
