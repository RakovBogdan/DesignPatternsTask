package org.bogdanrakov.patternstask.humanstate;

public class AtMushroomGlade implements State {

    @Override
    public void doAction() {
        System.out.println("Gathering Mushrooms");
    }

}
