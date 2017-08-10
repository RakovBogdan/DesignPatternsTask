package org.bogdanrakov.patternstask.humanstate;

class Human {

    private State state;

    void setState(State state) {
        this.state = state;
    }

    void doAction() {
        state.doAction();
    }
}
