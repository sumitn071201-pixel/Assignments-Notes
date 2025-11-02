package com.beans;
import java.util.Date;

public class Movie {

	private int movieId;
	private String mName;
	private int duration;
	private String actor;
	private String actress;
	private Date dateOfRelease;
	
	
	public Movie(int movieId, String mName, int duration, String actor, String actress, Date dateOfRelease) {
		super();
		this.movieId = movieId;
		this.mName = mName;
		this.duration = duration;
		this.actor = actor;
		this.actress = actress;
		this.dateOfRelease = dateOfRelease;
		
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public Date getDateOfRelease() {
		return dateOfRelease;
	}
	public void setDateOfRelease(Date dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", mName=" + mName + ", duration=" + duration + ", actor=" + actor
				+ ", actress=" + actress + ", dateOfRelease=" + dateOfRelease + "]";
	}
	
	
	
	
	

	}


