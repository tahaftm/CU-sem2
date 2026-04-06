public class OnlineAccount{
    private String username;
    private String email;
    private String createdDate;

    public OnlineAccount(String username, String email, String createdDate) {
        this.username = username;
        this.email = email;
        this.createdDate = createdDate;
    }

    void displayInfo(){
        System.out.println("username: "+ username);
        System.out.println("email: "+ email);
        System.out.println("created date: "+ createdDate);
    }

    void login(){
        System.out.println(username + " logged in");
    }

    public String toString() {
        return "OnlineAccount: " + username + ", " + email;
    }

}