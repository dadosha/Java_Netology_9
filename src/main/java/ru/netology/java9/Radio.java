package ru.netology.java9;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > 9) {
            currentRadioStation = 0;
        } else if (newRadioStation < 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = newRadioStation;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            currentVolume = 100;
        } else if (newVolume < 0) {
            currentVolume = 0;
        } else {
            currentVolume = newVolume;
        }
    }
    public void nextRadioStation() {
        currentRadioStation++;
        setCurrentRadioStation(currentRadioStation);
    }

    public void prevRadioStation() {
        currentRadioStation--;
        setCurrentRadioStation(currentRadioStation);
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}