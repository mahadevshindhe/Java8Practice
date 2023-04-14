package org.example5;

import java.util.Objects;

public class Trader {
    private String name;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + ((name == null) ? 0 : name.hashCode());
        hash = hash * 31 + ((city == null) ? 0 : city.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Trader)) {
            return false;
        }
        Trader o = (Trader) other;
        boolean equals = Objects.equals(name, o.getName());
        equals = equals && Objects.equals(city, o.getCity());
        return equals;
    }

    @Override
    public String toString() {
        return String.format("Trader:%s in %s", name, city);
    }
}