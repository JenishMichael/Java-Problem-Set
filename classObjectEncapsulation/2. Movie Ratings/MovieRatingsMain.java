package classObjectEncapsulation;

public class MovieRatingsMain {

	public static void main(String[] args) {
		
		MovieRatings[] movieRatingsArray = new MovieRatings[4];
		movieRatingsArray[0] = new MovieRatings("The First Avenger", "Comedy", 7);
		movieRatingsArray[1] = new MovieRatings("Homecoming", "Action", 8);
		movieRatingsArray[2] = new MovieRatings("Far from Home", "Comedy", 9);
		movieRatingsArray[3] = new MovieRatings("No Way Home", "Action", 10);
		
		for(MovieRatings i : movieRatingsArray) {
			if(i.isHit())
				System.out.println(i.getTitle()+ " is a Hit");
		}
		
		
		

		
	}

}