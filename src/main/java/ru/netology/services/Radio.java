package ru.netology.services;

public class Radio {
    
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) { // если меньше 0, возвращается к 0
            return;
        }
        if (currentStation > 9) { // если больше 9, возвращается к 9
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() { // переключаем на следующую станцию
        if (currentStation != 9) { // если была меньше 9, станет +1
            currentStation++;
        } else {
            currentStation = 0; // если была 9, станет 0
        }
    }

    public void prevStation() { // переключаем на предыдущую станцию
        if (currentStation != 0) { // если была больше 0, станет -1
           currentStation--;
        } else {
           currentStation = 9; // если была 0, станет 9
        }
    }

     public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) { // выбираем громкость
        if (currentVolume < 0) { // если меньше 0, возвращается к 0
            return;
        }
        if (currentVolume > 100) { // если больше 100, возвращается к 100
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() { // громкость добавляется +1
        if (currentVolume != 100) { // если была меньше 100, станет +1
            currentVolume++;
        }
    }

    public void turnDownVolume() { // громкость уменьщается на -1
        if (currentVolume != 0) { // если была больше 0, станет -1
            currentVolume--;
        }
    }

}
