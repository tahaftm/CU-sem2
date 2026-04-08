public class OnlineAccount{
    String username;
    String email;
    String createdDate;

    public OnlineAccount(String username, String email, String createdDate){
        this.username = username;
        this.email= email;
        this.createdDate = createdDate;
    }

    public void displayInfo(){
        System.out.println(username +" with email " + email +" created account on " + createdDate); 
    }
}