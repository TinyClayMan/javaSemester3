package com.company;

public abstract class Furniture {
    private boolean isNew;
    private String material;
    private String contents;

    public Furniture (boolean isNew, String material) {
        this.isNew = isNew;
        this.material = material;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getMaterial() {
        return material;
    }

    public String getContents() {
        return contents;
    }

    public boolean isNew() {
        return isNew;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "new=" + isNew +
                ", material='" + material + '\'' +
                ", contents='" + contents + '\'' +
                '}';
    }
}