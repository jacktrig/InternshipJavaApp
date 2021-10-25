import java.util.ArrayList;
import java.util.*;

 public class JobListing {
     public UUID id;
     private String jobTitle;
     private String companyName;
     private String jobDescription;
     private ArrayList<String> prefferedQuals;
     private ArrayList<String> requiredQuals;
     private boolean isOpen;
     private double rating;
     
     public JobListing() {

     }

     public JobListing(UUID id, String companyName, String jobDescription, ArrayList<String> requiredQuals, ArrayList<String> prefferedQuals) {
        this.id = id;
        this.companyName = companyName;
        this.jobDescription = jobDescription;
        this.prefferedQuals = prefferedQuals;
        this.requiredQuals = requiredQuals;
        isOpen = true;
     }

     public JobListing getJob(String id){
	    return this;

     }

     public String getJobTitle() {
         return jobTitle;
     }

     public String getCompanyName() {
         return companyName;
     }

     public boolean isOpen() {
         return isOpen;
     }

     public double getRating(){
	    return rating;
     }

     public void sendInterestMessage(String studentID){
       //TODO
     }
 }
