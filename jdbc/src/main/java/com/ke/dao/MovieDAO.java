package com.ke.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ke.config.DBConfig;
import com.ke.domain.Movie;

public class MovieDAO {
	
	private Statement statement;
	private Connection connection;
	
	
	public MovieDAO() throws SQLException {
		
		this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.username, DBConfig.password);
		this.statement = connection.createStatement();
		
	}
	
	// ResultSet
	public Movie movieFromResultSet(ResultSet resultSet) throws SQLException {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		String genre = resultSet.getString("genre");
		String rating = resultSet.getString("rating");
		boolean is3d = resultSet.getBoolean("is3d");
		
		return new Movie(id, name, genre, rating, is3d);
	}
	
	// ReadAll Statement
	public List<Movie> readAll() {
		try {
			ResultSet resultSet = statement.executeQuery("SELECT * FROM movie");
			List<Movie> movies = new ArrayList<Movie>();
			while (resultSet.next()) {
				movies.add(movieFromResultSet(resultSet));
			}
			return movies;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// Create Statement
	public void create(Movie movie) {
		try {
			statement.executeUpdate("INSERT INTO movie(`name`, `genre`, `rating`, `is3d`) VALUE"
					+ "('" + movie.getName() + "', '" + movie.getGenre() + "', '" + movie.getRating() + "', '" + (movie.is3d() ? 1 : 0) + "')");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Update Statement
	public void update(Movie movie, int id) {
		try {
			statement.executeUpdate("UPDATE movie SET "
					+ "`name` = '" + movie.getName() + "', `genre` = '" + movie.getGenre() + "', `rating` = '" + movie.getRating() + "', `is3d` = '" + (movie.is3d() ? 1 : 0) + " WHERE id = " + id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// Delete Statement
	public void delete(int id) {
		try {
			statement.executeUpdate("DELETE FROM movie WHERE id = " + id);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
