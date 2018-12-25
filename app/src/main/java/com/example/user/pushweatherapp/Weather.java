package com.example.user.pushweatherapp;

public class Weather {
    String Selsius;
    String City;
    String Cloud;
    String Country;
    String Description;
    String Humidity;
    String LastUpdate;
    String WeatherIcon;
    String Wild;

    public Weather() {
    }

    public Weather(String selsius, String city, String cloud, String country, String description, String humidity, String lastUpdate, String weatherIcon, String wild) {
        Selsius = selsius;
        City = city;
        Cloud = cloud;
        Country = country;
        Description = description;
        Humidity = humidity;
        LastUpdate = lastUpdate;
        WeatherIcon = weatherIcon;
        Wild = wild;
    }

    public String getSelsius() {
        return Selsius;
    }

    public void setSelsius(String selsius) {
        Selsius = selsius;
    }

    public String getCloud() {
        return Cloud;
    }

    public void setCloud(String cloud) {
        Cloud = cloud;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public String getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public String getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(String weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getWild() {
        return Wild;
    }

    public void setWild(String wild) {
        Wild = wild;
    }
}
