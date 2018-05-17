package com.viral.nirmal.mvvmsample.model;

public class Man {
    public int age;

    public Man() {
        born();
    }

    public void born() {
        age = 0;
    }

    public void celebrateBirthday() {
        age++;
    }

    public void accident(boolean isFatal) {
        if (isFatal) {
            die();
        } else {
            age--;
        }
    }

    public void die() {
        age = 0;
    }

}
