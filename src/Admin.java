import java.util.UUID;

public class Admin extends User {
    Admin(String id,String firstName,String lastName,String username, String password, String email, String phone){
      super(id,firstName,lastName,username, password, email, phone);
    }
    private boolean removeAccount(String id){
     /* if(EndpointUser.delete(id))
        return true; */
      return false;
    }

    private String resetPassword(String id){
      /* if(EndpointUser.getDetail(id)){
        User oldUserPass = EndpointUser.getDetail(id);
        firstName = oldUserPass.getFirstName();
        lastName = oldUserPass.getLastName();

        User updatedUserPass = new User(id, first, last, "password");
        (EndpointUser.update(newUser));
        return "password"; 
      } */
      return "User not found in database";
      
    }

    private void hideReview(){
      
    }
}
