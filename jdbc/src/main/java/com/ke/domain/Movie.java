package com.ke.domain;

public class Movie {
	
	private String name;
	private String genre;
	private String rating;
	private boolean is3d;
	
	public Movie() {}

	public Movie(String name, String genre, String rating, boolean is3d) {
		super();
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.is3d = is3d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isIs3d() {
		return is3d;
	}

	public void setIs3d(boolean is3d) {
		this.is3d = is3d;
	}
	
	
}
