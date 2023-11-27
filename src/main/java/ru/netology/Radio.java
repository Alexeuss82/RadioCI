package ru.netology;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        } else {
            System.out.println("Недопустимый номер радиостанции.");
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
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
