package me.h9w.designpattern.builder_pattern;

public class Student {

    private final int id;
    private final String name;
    private final String phone;
    private static int globalNo;



    public static class Builder{
        private final int id;
        private final String name;

        private String phone = "";

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder phone(String phone) {
            this.phone = phone;

            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
