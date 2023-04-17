package comPack.assingPack;

class Movie {
    private String movieName;
    private String movieStartTime;
    private String movieEndTime;
    private double movieTicketPrice;
       
    // Getters and Setters
    public String getMovieName() {
        return movieName;
    }
    
    public void setMovieName(String name) {
        this.movieName = name;
    }
    
    public String getMovieStartTime() {
        return movieStartTime;
    }
    
    public void setMovieStartTime(String startTime) {
        this.movieStartTime = startTime;
    }
    
    public String getMovieEndTime() {
        return movieEndTime;
    }
    
    public void setMovieEndTime(String endTime) {
        this.movieEndTime = endTime;
    }
    
    public double getMovieTicketPrice() {
        return movieTicketPrice;
    }
    
    public void setMovieTicketPrice(double ticketPrice) {
        this.movieTicketPrice = ticketPrice;
    }
}

public class MovieTheatreManagementSystem {
   

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setMovieName("Iron Man 1,2,3");
        movie.setMovieStartTime("9:00 PM");
        movie.setMovieEndTime("6:00 PM");
        movie.setMovieTicketPrice(500);

        // Display the movie information
        System.out.println("Movie Name: " + movie.getMovieName());
        System.out.println("Start Time: " + movie.getMovieStartTime());
        System.out.println("End Time: " + movie.getMovieEndTime());
        System.out.println("Ticket Price: " + movie.getMovieTicketPrice());
    }
}

