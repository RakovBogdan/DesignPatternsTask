package org.bogdanrakov.patternstask.humanstate;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new AtMushroomGlade());
        human.doAction();
    }
}
