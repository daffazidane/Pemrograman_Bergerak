package com.example.myviewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class WeatherItems {

    private int id;
    private String name;
    private String currentWeather;
    private String description;
    private String temperature;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCurrentWeather(){
        return currentWeather;
    }

    public void setCurrentWeather(String currentWeather){
        this.currentWeather = currentWeather;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getTemperature(){
        return temperature;
    }

    public void setTemperature(String temperature){
        this.temperature = temperature;
    }
}
