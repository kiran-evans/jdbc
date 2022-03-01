package com.ke;

import java.sql.SQLException;

import com.ke.dao.MovieDAO;
import com.ke.domain.Movie;

public class Runner {

	public static void main(String[] args) throws SQLException {
		
		Movie movieOne = new Movie("The Matrix", "Sci-Fi", "12", true);
		MovieDAO dao = new MovieDAO();
		
		dao.create(movieOne);

	}

}
