package me.h9w.designpattern.builder_pattern;

import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {

        Student student = new Student.Builder(1,"dd").phone("010").build();


    }

}
