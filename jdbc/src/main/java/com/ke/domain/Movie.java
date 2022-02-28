package com.ke.domain;

public class Movie {
	
	private int id;
	private String name;
	private String genre;
	private String rating;
	private boolean is3d;
	
	public Movie() {}

	public Movie(int id, String name, String genre, String rating, boolean is3d) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.is3d = is3d;
	}

	public Movie(String name, String genre, String rating, boolean is3d) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
		this.is3d = is3d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean is3d() {
		return is3d;
	}

	public void setIs3d(boolean is3d) {
		this.is3d = is3d;
	}
	
}
