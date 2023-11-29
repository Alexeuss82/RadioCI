package ru.netology;

public class Radio {
    private int currentStation;
    private int volume;
    private final int numStations;

    public Radio() {
        this.numStations = 10; // значение по умолчанию
        this.currentStation = 0;
        this.volume = 0;
    }

    public Radio(int size) {
        this.currentStation = 0;
        this.numStations = currentStation + size;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station < numStations) {
            currentStation = station;
        } else {
            System.out.println("Недопустимый номер радиостанции.");
        }
    }

    public void next() {
        if (currentStation == numStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numStations - 1;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Недопустимый уровень громкости.");
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Достигнут максимальный уровень громкости.");
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Достигнут минимальный уровень громкости.");
        }
    }
}
