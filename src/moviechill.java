
public class moviechill {
public static void main(String[] args) {
	
	Movie mav1 = new Movie("slam", -134567);
	Movie mav2 = new Movie("slam 2 : mam", 1);
	Movie mav3 = new Movie("slam 3 : ham", 7);
	Movie mav4 = new Movie("slam: the prequel", 2);
	Movie mav5 = new Movie("slam: the sequel", 5);
	mav1.getTicketPrice();
	NetflixQueue kooi = new NetflixQueue();
	
	kooi.addMovie(mav1);
	kooi.addMovie(mav2);
	kooi.addMovie(mav3);
	kooi.addMovie(mav4);
	kooi.addMovie(mav5);
	kooi.printMovies();
	String ertyu = kooi.getBestMovie().toString();
	System.out.println(ertyu);
}
}
