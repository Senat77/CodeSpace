package com.alpha.practicalwork27.work3;

public abstract class Camera {

    final private String model;

    public Camera(String model) {
        this.model = model;
    }

    abstract public void makePhoto();

    @Override
    public String toString() {
        return "Camera : " +
                "model='" + model + '\'';
    }
}
