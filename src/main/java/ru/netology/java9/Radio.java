package ru.netology.java9;

public class Radio {
    private int countRadioStation = 10;
    private int currentRadioStation;
    private int currentVolume;

    public Radio (int countRadioStation) {
        this.countRadioStation = countRadioStation;
    }

    public Radio () {}

    public int getCountRadioStation() {
        return countRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newRadioStation) {
        if (newRadioStation > countRadioStation - 1) {
            currentRadioStation = 0;
        } else if (newRadioStation < 0) {
            currentRadioStation = countRadioStation - 1;
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
        int newRadioStation = ++currentRadioStation;
        setCurrentRadioStation(newRadioStation);
    }

    public void prevRadioStation() {
        int newRadioStation = --currentRadioStation;
        setCurrentRadioStation(newRadioStation);
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