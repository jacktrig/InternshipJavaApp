
import java.util.ArrayList;

public class Resume {
  private String id;
  private ArrayList<Education> educations;
  private ArrayList<ResumeExperience> experiences;
  private ArrayList<String> skills;
  private ArrayList<String> currentClasses;
  /**
   * calls and assign the  strings and the array lists 
   */
  public Resume() {
    this.experiences = new ArrayList<ResumeExperience>();
    this.skills = new ArrayList<String>();
    this.currentClasses = new ArrayList<String>();
  }
  /**
   * creates the resume constructor 
   * @param id
   * @param experiences
   * @param skills
   * @param currentClasses
   */
  public Resume(String id, ArrayList<ResumeExperience> experiences, ArrayList<String> skills, ArrayList<String> currentClasses) {
    this.id = id;
    this.experiences = experiences;
    this.skills = skills;
    this.currentClasses = currentClasses;
  }
  public void addEducation(Education education) {
    this.educations.add(education);
  }
  
  public void addExperience(ResumeExperience experience) {
    this.experiences.add(experience);
  }
  /**
   * adds skill to the arraylist 
   * @param skill
   */
  public void addSkill(String skill) {
    skills.add(skill);
  }
  /**
   * adds class to the array list
   * @param className
   */
  public void addClass(String className) {
    currentClasses.add(className);
  }
	
}
