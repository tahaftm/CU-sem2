class InstagramBusinessAccount extends SocialMediaAccount {
    private String businessCategory;
    private double adBudget;

    // Constructor chaining
    InstagramBusinessAccount(String username, String email, String createdDate,
                             int followers, int postCount,
                             String businessCategory, double adBudget) {
        super(username, email, createdDate, followers, postCount);
        this.businessCategory = businessCategory;
        this.adBudget = adBudget;
    }

    // Overridden displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("business category: " + businessCategory);
        System.out.println("ad budget: " + adBudget);
    }

    // calculateEngagement()
    double calculateEngagement() {
        return adBudget / 1000; 
    }

    void showAnalytics() {
        System.out.println("Engagement Score: " + calculateEngagement());
    }

    @Override
    public String toString() {
        return super.toString() + ". Selected category is: " + businessCategory;
    }
}