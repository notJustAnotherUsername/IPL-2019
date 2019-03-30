package com.santanu.customarrayadapter;

import android.content.Intent;

public class MatchDetails {

    private String mHomeTeam;

    private String mRivaleTeam;

    private String mDate;

    private String mStadium;

    private Integer mHomeTeamLogoResourceId;


    public MatchDetails(String vHomeTeam, String vRivaleTeam, String vDate, String vStadium, Integer vHomeTeamLogoResourceId) {

        mHomeTeam = vHomeTeam;
        mRivaleTeam = vRivaleTeam;
        mDate = vDate;
        mStadium = vStadium;
        mHomeTeamLogoResourceId = vHomeTeamLogoResourceId;
    }


    public String getHomeTeam() {

        return mHomeTeam;
    }

    public String getRivaleTeam() {

        return mRivaleTeam;
    }

    public Integer getHomeTeamLogoResourceId() {

        return mHomeTeamLogoResourceId;
    }

    public String getDate() {

        return mDate;
    }

    public String getStadium() {

        return mStadium;
    }
}
