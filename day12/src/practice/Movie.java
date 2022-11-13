package practice;

import java.util.Date;

public class Movie {
	
	String title;
	String director;
	String[] actors;
	String genre;
	int runnningTime;
	Date openningDate;
	double grade;
	
	Movie(String title, String director, String[] actor, String genre,
			int runningTime, Date openningDate, double grade){
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.genre = genre;
		this.runnningTime = runningTime;
		this.openningDate = openningDate;
		this.grade = grade;
	}
	
	String getInfo() {
		String form = "[%s] %s, %s (%.2f)";
		String result = String.format(form, title, actors[0], actors[1], grade);
		return result;
	}
	

}
