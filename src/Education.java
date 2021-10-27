public class Education {
  public String schoolName;
  public String degree;
  public String major;
  public double gpa;
  
  public Education(String schoolName, String degree, String major, double gpa) {
    this.schoolName = schoolName;
    this.degree = degree;
    this.major = major;
    this.gpa = gpa;
  }

  public String getSchoolName() {
    return this.schoolName;
  }
  
  public String getDegree() {
    return this.degree;
  }

  public String getMajor() {
    return this.major;
  }

  public double getGPA() {
    return this.gpa;
  }
}
