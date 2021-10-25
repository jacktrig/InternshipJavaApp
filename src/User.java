import java.util.UUID;

public abstract class User {
  protected String id;
  protected String firstName;
  protected String lastName;
  protected String username;
  protected String password;
  protected String email;
  protected String phone;
  
  protected User() {

  }

  public User(String id, String firstName, String lastName, String username, String password, String email, String phone) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.email = email;
    this.phone = phone;
  }
  public String getID() {
    return this.id;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public String getUserName() {
    return this.username;
  }
  public String getPassword() {
    return this.password;
  }
  public String getEmail() {
    return this.email;
  }
  public String getPhoneNumber() {
    return this.phone;
  }

 

  public boolean checkUnique(String username, String password, String email, int phone) {
    //TODO - possibly needs to be moved to UserEndpoint
    return true;
  }
  
  protected boolean changePassword(String oldPassword, String newPassword) { //may need to move this method
    if(oldPassword == this.password) {
      this.password = newPassword;
      return true;
    }
    
    return false;
  }

  public UUID getID() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public int getPhone() {
    return phone;
  }
}