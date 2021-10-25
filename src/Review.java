public class Review {
	private User writer;
	private String comment;
	private double rating;
        
	public Review() {

	}
	public Review(User writer, String comment, double rating){
		this.writer = writer;
		this.comment = comment;
		this.rating = rating;
	}
   
	public User getWriter(){
		return writer;
	}
   
	public String getComment(){
    	return comment;
	}
   
	public double getRating(){
	 	return rating;
	}
    }