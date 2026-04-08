public class InstagramBusinessAccount extends SocialMediaAccount{
    String businessCategory;
    double adBudget;

    public InstagramBusinessAccount(String username, String email, String date, int followers, String businessCategory, double adBudget){
        super(username,email,date,followers);
        this.businessCategory = businessCategory;
        this.adBudget = adBudget;
    } 

    public void displayInfo() {
            super.displayInfo();
            System.out.println("business category: " + businessCategory);
            System.out.println("ad budget: " + adBudget);
        }

    public double calculateEngagement() {
        return adBudget / 1000; 
    }
    public void showAnalytics() {
        System.out.println("Engagement Score: " + calculateEngagement());
    }
}