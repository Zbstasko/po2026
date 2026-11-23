package agh.po.animals;

public abstract class Animal {
    public String name;
    public int legs;
    public int getLegs() {
        return legs;
    }
    public abstract String getDescription();
}
