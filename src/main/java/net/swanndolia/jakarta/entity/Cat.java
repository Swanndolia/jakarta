package net.swanndolia.jakarta.entity;

import java.time.LocalDate;

public class Cat {
    String name;
    String race;
    String favoriteFood;
    LocalDate birthDate;

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Cat(String name, String race, String favoriteFood, LocalDate birthDate) {
        this.name = name;
        this.race = race;
        this.favoriteFood = favoriteFood;
        this.birthDate = birthDate;
    }
}
