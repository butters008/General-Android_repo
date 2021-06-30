package com.example.recyclerview_app;

public class RpgCharacter {

    // 1 - Creating 3 strings
    private String name, race, battleClass;


    // 2 - Creating the constructors
    public RpgCharacter(String name, String race, String battleClass) {
        this.name = name;
        this.race = race;
        this.battleClass = battleClass;
    }

    public RpgCharacter() { } //Not sure why I needed a blank constructor for this tutorial but OK


    // 3 - Creating the Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBattleClass() {
        return battleClass;
    }

    public void setBattleClass(String battleClass) {
        this.battleClass = battleClass;
    }

}
