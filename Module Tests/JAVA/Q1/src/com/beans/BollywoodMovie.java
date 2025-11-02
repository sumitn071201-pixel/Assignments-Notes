package com.beans;

import java.util.Date;

public class BollywoodMovie extends Movie{
	
	private int noOfSongs;
	private String singer;
		
	public BollywoodMovie(int movieId, String mName, int duration, String actor, String actress, Date dateOfRelease) {
		super(movieId, mName, duration, actor, actress, dateOfRelease);
		
	}

	@Override
	public int getMovieId() {
		// TODO Auto-generated method stub
		return super.getMovieId();
	}

	@Override
	public void setMovieId(int movieId) {
		// TODO Auto-generated method stub
		super.setMovieId(movieId);
	}

	@Override
	public String getmName() {
		// TODO Auto-generated method stub
		return super.getmName();
	}

	@Override
	public void setmName(String mName) {
		// TODO Auto-generated method stub
		super.setmName(mName);
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return super.getDuration();
	}

	@Override
	public void setDuration(int duration) {
		// TODO Auto-generated method stub
		super.setDuration(duration);
	}

	@Override
	public String getActor() {
		// TODO Auto-generated method stub
		return super.getActor();
	}

	@Override
	public void setActor(String actor) {
		// TODO Auto-generated method stub
		super.setActor(actor);
	}

	@Override
	public String getActress() {
		// TODO Auto-generated method stub
		return super.getActress();
	}

	@Override
	public void setActress(String actress) {
		// TODO Auto-generated method stub
		super.setActress(actress);
	}

	@Override
	public Date getDateOfRelease() {
		// TODO Auto-generated method stub
		return super.getDateOfRelease();
	}

	@Override
	public void setDateOfRelease(Date dateOfRelease) {
		// TODO Auto-generated method stub
		super.setDateOfRelease(dateOfRelease);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

}
