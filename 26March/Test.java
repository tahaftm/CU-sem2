public class Test {
    public static void main(String[] args) {

        // Parent object
        OnlineAccount acc = new OnlineAccount("taha", "tahatariqf@gmail.com", "2026");
        acc.displayInfo();
        acc.login();
        System.out.println(acc);
        System.out.println("------------------");

        // Child object
        SocialMediaAccount sm = new SocialMediaAccount("tahaSM", "sm@gmail.com", "2023", 247, 23);
        sm.displayInfo();
        sm.postContent();
        System.out.println(sm);
        System.out.println("------------------");

        // Grandchild object
        InstagramBusinessAccount ig = new InstagramBusinessAccount(
                "tahaIG", "ig@gmail.com", "2022",
                1000, 25, "Clothing", 5000
        );

        ig.displayInfo();
        ig.postContent();
        ig.showAnalytics();
        System.out.println(ig);
    }
}