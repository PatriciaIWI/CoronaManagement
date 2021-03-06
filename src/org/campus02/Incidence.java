package org.campus02;

import java.util.Objects;

public class Incidence {
    private String state;
    private String date;
    private int number;


    //Generate Konstrukteur
    public Incidence(String state, String date, int number) {
        this.state = state;
        this.date = date;
        this.number = number;

    }
//Generate Getter

    public String getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }
// generate Equals und Hashcodes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incidence incidence = (Incidence) o;
        return number == incidence.number && Objects.equals(state, incidence.state) && Objects.equals(date, incidence.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, date);
    }

    // Generate  / TO String


    @Override
    public String toString() {
        return "Incidence{" +
                "state='" + state + '\'' +
                ", date='" + date + '\'' +
                ", number=" + number +
                '}';
    }
}
