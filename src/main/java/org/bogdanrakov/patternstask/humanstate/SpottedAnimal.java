package org.bogdanrakov.patternstask.humanstate;

public class SpottedAnimal implements State {

    @Override
    public void doAction() {
        System.out.println("Hunting");
    }

}
