import java.util.ArrayList;

public class Employee extends User {
    public String companyName;
    public String jobTitle;
    private ArrayList<Review> reviews;

    public Employee(String id, String firstName, String lastName, String username, String password, String email, String phone, String companyName, String jobTitle) {
      super(id, firstName, lastName, username, password, email, phone);
      this.companyName = companyName;
      this.jobTitle = jobTitle;

    }

    public Employee(String companyName, String jobTitle){
      this.companyName = companyName;
      this.jobTitle = jobTitle;
      reviews = new ArrayList<Review>(); 
    }

    public Review addStudentReview(User writer, String comment, double score){
      Review newReview = new Review(writer,comment,score);
      reviews.add(newReview);
      return newReview;
    }
    
}
