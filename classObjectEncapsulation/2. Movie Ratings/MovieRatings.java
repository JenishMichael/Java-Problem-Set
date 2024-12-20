package classObjectEncapsulation;

public class MovieRatings {
	private String title;
	private String genre;
	private double rating;
	
	public MovieRatings(String title, String genre, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public boolean isHit() {
		return rating >= 8.0;
	}
	     
}
