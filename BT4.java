package CHUONG2;

import java.util.Scanner;

public class BT4 {
    private String name;
    private int age;
    private String address;
    private int marksofsubject;

    BT4(String name, int age, String address, int marksofsubject) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marksofsubject = marksofsubject;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getMarksofsubject() {
        return marksofsubject;
    }

    public String toString() {
        return "sinhvien  [name:"+name+"age:"+age+"address:"+address+"marksofsubject:"+marksofsubject+"]";
    }
}
