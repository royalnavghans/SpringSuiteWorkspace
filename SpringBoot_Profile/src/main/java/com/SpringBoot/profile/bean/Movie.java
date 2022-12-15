package com.SpringBoot.profile.bean;

public class Movie {
int Movie_Id;
String Movie_Name;
String Actor_Name;

public Movie(int movie_Id, String movie_Name, String actor_Name) {
	super();
	Movie_Id = movie_Id;
	Movie_Name = movie_Name;
	Actor_Name = actor_Name;
}
public int getMovie_Id() {
	return Movie_Id;
}
public void setMovie_Id(int movie_Id) {
	Movie_Id = movie_Id;
}
public String getMovie_Name() {
	return Movie_Name;
}
public void setMovie_Name(String movie_Name) {
	Movie_Name = movie_Name;
}
public String getActor_Name() {
	return Actor_Name;
}
public void setActor_Name(String actor_Name) {
	Actor_Name = actor_Name;
}


}
