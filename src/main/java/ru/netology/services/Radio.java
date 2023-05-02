package ru.netology.services;

public class Radio {

    private int currentStation;
    private int currentVolume;
    
    private int maxStation;
    private int minStation = 0;
  
    private int maxVolume = 100;
    private int minVolume = 0;
   
    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void nextStation() { // переключаем на следующую станцию
        if (currentStation != maxStation) { // если была меньше 9, станет +1
            currentStation++;
        } else {
            currentStation = minStation; // если была 9, станет 0
        }
    }

    public void prevStation() { // переключаем на предыдущую станцию
        if (currentStation != minStation) { // если была больше 0, станет -1
            currentStation--;
        } else {
            currentStation = maxStation; // если была 0, станет 9
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentVolume(int currentVolume) { // выбираем громкость
        if (currentVolume < minVolume) { // если меньше 0, возвращается к 0
            return;
        }
        if (currentVolume > maxVolume) { // если больше 100, возвращается к 100
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() { // громкость добавляется +1
        if (currentVolume != maxVolume) { // если была меньше 100, станет +1
            currentVolume++;
        }
    }

    public void turnDownVolume() { // громкость уменьщается на -1
        if (currentVolume != minVolume) { // если была больше 0, станет -1
            currentVolume--;
        }
    }

}
