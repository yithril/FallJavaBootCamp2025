package org.example;

public class GameCharacter {
    private String name;
    private String profession;
    //were going to give these two properties default values
    private int xp;
    private int level;

    public GameCharacter(String name, String profession){
        this.name = name;
        this.profession = profession;
        this.xp = 0;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
