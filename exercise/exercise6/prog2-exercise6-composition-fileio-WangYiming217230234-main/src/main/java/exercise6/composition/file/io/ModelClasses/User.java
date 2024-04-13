package exercise6.composition.file.io.ModelClasses;
public class User {  
    private String firstName;  
    private String lastName;  
    private String userEmail;  
    private String userID;  
  
    public User(String firstName, String lastName, String userEmail, String userID2) {  
        this.firstName = firstName;  
        this.lastName = lastName;  
        this.userEmail = userEmail;  
        this.userID = userID2;  
    }  
  
     
    public String getFirstName() {  
        return firstName;  
    }  
  
    public String getLastName() {  
        return lastName;  
    }  
  
    public String getUserEmail() {  
        return userEmail;  
    }  
  
    public String getUserID() {  
        return userID;  
    }  
  
     
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
  
    public void setUserEmail(String userEmail) {  
        this.userEmail = userEmail;  
    }  
  
    public void setUserID(String userID) {  
        this.userID = userID;  
    }  
  
     
    @Override  
    public String toString() {  
        return "User ID: " + userID + "\n" +  
               "User First Name: " + firstName + "\n" +  
               "User Last Name: " + lastName + "\n" +  
               "User Email: " + userEmail;  
    }  
}

