package com.example.abc;

public class AlphabetItem {
    private String letter;
    private String example;
    private int imageResourceId;

    public AlphabetItem(String letter, String example, int imageResourceId) {
        this.letter = letter;
        this.example = example;
        this.imageResourceId = imageResourceId;
    }

    public String getLetter() {
        return letter;
    }

    public String getExample() {
        return example;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}