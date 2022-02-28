package com.ke.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.ke.config.DBConfig;
import com.ke.domain.Movie;

public class MovieDAO {
	
	private Statement statement;
	private Connection connection;
	
	
	public MovieDAO() throws SQLException {
		
		this.connection = DriverManager.getConnection(DBConfig.url, DBConfig.username, DBConfig.password);
		this.statement = connection.createStatement();
		
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
	
}
