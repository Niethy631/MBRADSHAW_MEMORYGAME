/*
 * This program is for my player Class
 * I named it MemPlayer
 */
package memorygame;

/**
 *
 * @author Niethy
 * 
 */

import java.io.Serializable;
        
public class MemPlayer implements Serializable {
    
    private String name;
    private double age;
    private String level;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;

    public MemPlayer(String name, double age, String level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }

    
}


