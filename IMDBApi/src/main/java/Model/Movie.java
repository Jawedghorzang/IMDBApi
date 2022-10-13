package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

 
// This class represent our database table

@Entity
public class Movie {

	@Id
	@Column(length = 255,nullable = false)
	String title;
	int year;
	@Column(length = 1000,nullable = false,name = "score")
	String imDb;
	
	
	public Movie(String title, int year, String imDb) {
		super();
		this.title = title;
		this.year = year;
		this.imDb = imDb;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getImDb() {
		return imDb;
	}


	public void setImDb(String imDb) {
		this.imDb = imDb;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", year=" + year + ", imDb=" + imDb + "]";
	}
	
	
	
}
