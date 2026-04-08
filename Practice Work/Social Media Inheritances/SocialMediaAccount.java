public class SocialMediaAccount extends OnlineAccount{
    public static int postCount;
    public int followers;

    public SocialMediaAccount(String username, String email, String date, int followers){
        super(username, email, date);
        this.followers = followers;
        postCount++;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Followers: " + followers);
        System.out.println("Post Count: " + postCount);
    }

    public int postContent(){
        return postCount;
    }


}