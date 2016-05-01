package br.edu.ufcg.harrypottermovies;

/**
 * Classe que representa um filme.
 */
public class Movie {

    private String title;
    private int poster;
    private int year;
    private String time; // minutes
    private double rating; // from 0 up to 10
    private String description;
    private String[] trailers;
    private boolean isFavorite;

    public Movie(String title, int poster, int year, String time, double rating, String description, String[] trailers) {
        this.title = title;
        this.poster = poster;
        this.year = year;
        this.time = time;
        this.rating = rating;
        this.description = description;
        this.trailers = trailers;
        this.isFavorite = false;
    }

    public String[] getTrailers() {
        return trailers;
    }

    public void setTrailers(String[] trailers) {
        this.trailers = trailers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Movie))
            return false;

        Movie movie = (Movie) obj;

        if (year != movie.year) return false;
        return !(title != null ? !title.equals(movie.title) : movie.title != null);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }
}
