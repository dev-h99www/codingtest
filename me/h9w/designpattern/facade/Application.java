package me.h9w.designpattern.facade;

import me.h9w.designpattern.facade.system.Facade;

public class Application {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.process();
    }
}
