package com.santanu.customarrayadapter;

import android.content.Intent;

public class TodaysMatchDetails {


    private String mHomeTeam;
    private String mAwayTeam;
    private String mtimeAndStadium;
    private Integer mHomeTeamLogo;
    private Integer mAwayTeamLogo;

    public TodaysMatchDetails(String homeTeam, String awayTeam, String timeAndStadium, Integer homeTeamLogo, Integer awayTeamLogo){

        mHomeTeam = homeTeam;
        mAwayTeam = awayTeam;
        mtimeAndStadium = timeAndStadium;
        mHomeTeamLogo = homeTeamLogo;
        mAwayTeamLogo= awayTeamLogo;

    }

    public String getHomeTeam (){

        return mHomeTeam;
    }

    public String getAwayTeam (){

        return mAwayTeam;
    }

    public String getTimeAndStadium (){

        return mtimeAndStadium;
    }

    public Integer getHomeTeamLogo(){

        return mHomeTeamLogo;
    }

    public Integer getAwayTeamLogo (){

        return mAwayTeamLogo;
    }
}
