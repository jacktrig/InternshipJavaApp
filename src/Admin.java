import java.util.UUID;

<<<<<<< HEAD
public class Admin extends User { 
=======
public class Admin extends User {
>>>>>>> 8ca29cc613ed929d18c747f816dbfabd1d00d9b9
    Admin(UUID id,String firstName,String lastName,String username, String password, String email, int phone){
      super(id,firstName,lastName,username, password, email, phone);
    }
    private boolean removeAccount(String id){
      if(EndpointUser.delete(id))
        return true;
      return false;
    }

    private String resetPassword(String id){
      if(EndpointUser.getDetail(id)){
        User oldUserPass = EndpointUser.getDetail(id);
        firstName = oldUserPass.getFirstName();
        lastName = oldUserPass.getLastName();

        User updatedUserPass = new User(id, first, last, "password");
        (EndpointUser.update(newUser));
        return "password";
      }
      return "User not found in database";
    }

    private void hideReview(){
      
    }
}
