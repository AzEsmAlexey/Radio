package ru.netology.Radio;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        if (numberStation > 9) {
            return;
        }
        currentStation = numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int volumeValue) {
        currentVolume = volumeValue;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void next() {

        int target = currentStation;
        if (target < 9) {
            currentStation = currentStation + 1;
        }
        if (target >= 9) {
            currentStation = 0;
        }
    }

    public void prev() {

        int target = currentStation;
        if (target > 0) {
            currentStation = currentStation - 1;
        }
        if (target <= 0) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }
}
