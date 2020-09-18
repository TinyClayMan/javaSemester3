package com.company;

public class Book {
    private String author;
    private String name;
    private String releaseDate;
    private String country;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String date) {
        this.releaseDate = date;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public String getOverview() {
        return "Overview\n" +
                "Name: " + name +
                "\nAuthor: " + author +
                "\nCountry: " + country +
                "\nRelease date: " + releaseDate;
}
}
