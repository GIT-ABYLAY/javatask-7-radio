package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation(){
        Radio radio = new Radio();

        radio.currentStation = 0;

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }
//    @Test
//    public void shouldSetToMaxStation(){
//        Radio radio = new Radio();
//
//        radio.setToMaxStation();
//
//        int expected = 9;
//        int actual = radio.currentStation;
//
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void shouldSetToMinStation(){
//        Radio radio = new Radio();
//
//        radio.setToMinStation();
//
//        int expected = 0;
//        int actual = radio.currentStation;
//
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void nextStation(){
        Radio radio = new Radio();

        radio.currentStation = 9;
        int expected = 0;
        int actual = radio.setNextStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation(){
        Radio radio = new Radio();

        radio.currentStation = 0;
        int expected = 9;
        int actual = radio.setPrevStation();

        Assertions.assertEquals(expected, actual);
    }


//    @Test
//    public void shouldSetVolume(){
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }




//    @Test
//    public void shouldSetToMaxVolume(){
//        Radio radio = new Radio();
//
//        radio.setToMaxVolume();
//
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetToMinVolume(){
//        Radio radio = new Radio();
//
//        radio.setToMinVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void shouldNotSetVolumeAboveMax(){
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(110);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void increaseVolumeToOnePoint(){
        Radio radio = new Radio();

        radio.currentVolume = 100;

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void decreaseVolumeToOnePoint(){
        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected,actual);
    }
}
