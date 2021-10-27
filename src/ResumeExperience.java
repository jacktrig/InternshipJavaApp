import java.util.ArrayList;

 public class ResumeExperience {
     private String companyName;
     private String experienceLocation;
     private String positionTitle;
     public String positionDescription;
     private String datesOfExperience;
     private ArrayList<String> experienceDetails;

     public ResumeExperience(String companyName, String experienceLocation, String positionTitle, String positionDescription, String datesOfExperience){
       this.companyName = companyName;
       this.experienceLocation = experienceLocation;
       this.positionTitle = positionTitle;
       this.positionDescription = positionDescription;
       this.datesOfExperience = datesOfExperience;
     }

     public ArrayList<String> addExperienceDetail(String detailDescription){
       return new ArrayList<>();
     }

     public boolean removeExperienceDetail(String detailDescription){
       return true;
     }
 }