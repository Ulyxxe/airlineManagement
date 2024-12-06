package org.ulysse;

public class Aircraft {
    private String model;
    private String registration;
    private int capacity;

    public Aircraft(String model, String registration,int capacity){
        this.model = model;
        this.registration = registration;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    public String getModel() {
        return model;
    }
    public String getRegistration() {
        return registration;
    }
}
