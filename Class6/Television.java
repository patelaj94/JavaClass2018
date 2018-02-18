package com.npljava;

public class Television {
    int volume;
    int channel;
    double screenSize;
    String manufacturer;

    public Television(int volume, int channel, double screenSize, String manufacturer) {
        this.volume = volume;
        this.channel = channel;
        this.screenSize = screenSize;
        this.manufacturer = manufacturer;
    }

    public void volumeUp(){
        this.volume += 1;
        System.out.println("TV volume: " + this.volume);
    }

    public void volumeDown(){
        this.volume -= 1;
        System.out.println("TV volume: " + this.volume);
    }

    public void channelUp(){
        this.channel += 1;
        System.out.println("Channel: " + this.channel);
    }

    public void channelDown(){
        this.channel -= 1;
        System.out.println("Channel: " + this.channel);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
