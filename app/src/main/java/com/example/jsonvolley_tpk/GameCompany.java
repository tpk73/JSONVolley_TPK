package com.example.jsonvolley_tpk;

import com.google.gson.annotations.SerializedName;

public class GameCompany {

    @SerializedName("name")
    public String gameCompanyName;

    @SerializedName("year")
    public int getGameYearFounded;

    @SerializedName("recentGame")
    public String gameCompanyLatestGame;

    public int gameCompanyYear;

    public String getGameCompanyName(){return gameCompanyName;}

    public int getGetGameYearFounded(){return getGameYearFounded;}

    public String getGameCompanyLatestGame(){return gameCompanyLatestGame;}



    public GameCompany(String name, int year, String game){
        gameCompanyName = name;
        getGameYearFounded = year;
        gameCompanyLatestGame = game;
    }
}