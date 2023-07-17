package me.h9w.designpattern.facade.system;

class HelpSystem03 {

    public HelpSystem03() {
        System.out.println("Call Constructor: " + getClass().getSimpleName());
    }

    public void process() {
        System.out.println("Call Process: " + getClass().getSimpleName());
    }
}
