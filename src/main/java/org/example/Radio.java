package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Radio {
    public int currentStation;

//    public void setToMaxStation() {
//        currentStation = 9;
//    }
//
//    public void setToMinStation() {
//        currentStation = 0;
//    }
    public int setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            {
                return currentStation;
            }
        }
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        return currentStation;
    }
    public int setPrevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            {
                return currentStation;
            }
        }
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
        return currentStation;
    }

    public int currentVolume;

//    public int getCurrentVolume() {
//        return currentVolume;
//    }

//    public void setCurrentVolume(int newCurrentVolome) {
//        if (newCurrentVolome < 0) {
//            return;
//        }
//        if (newCurrentVolome > 100)
//            return;
//        currentVolume = newCurrentVolome;
//    }

//    public void setToMaxVolume() {
//        currentVolume = 100;
//    }
//
//    public void setToMinVolume() {
//        currentVolume = 0;
//    }

    public int increaseVolume() {
        if (currentVolume == 100){
            currentVolume = currentVolume;
            {
                return currentVolume;
            }
        }

        if (currentVolume <= 100) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if  (currentVolume == 0){
            currentVolume = 0;
            {
                return currentVolume;
            }
        }
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
