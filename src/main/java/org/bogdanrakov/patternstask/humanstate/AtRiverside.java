package org.bogdanrakov.patternstask.humanstate;

public class AtRiverside implements State {

    @Override
    public void doAction() {
        System.out.println("Swimming");
    }

}
