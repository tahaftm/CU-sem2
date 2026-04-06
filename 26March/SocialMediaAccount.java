class SocialMediaAccount extends OnlineAccount {
    private int followers;
    private int postCount;

    // Constructor chaining using super
    SocialMediaAccount(String username, String email, String createdDate,
                       int followers, int postCount) {
        super(username, email, createdDate);
        this.followers = followers;
        this.postCount = postCount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();  
        System.out.println("followers: " + followers);
        System.out.println("post count: " + postCount);
    }

    void postContent() {
        postCount++;
        System.out.println("New post uploaded. Total posts: " + postCount);
    }

    @Override
    public String toString() {
        return super.toString() + ". You have followers: " + followers;
    }
}