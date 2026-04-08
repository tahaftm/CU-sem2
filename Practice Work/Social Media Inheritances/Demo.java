public class Demo{
    public static void main(String[] args){
        OnlineAccount oa = new OnlineAccount("tahaftm", "tahatariqf@gmail.com", "12-03-2020");
        oa.displayInfo();

        System.out.println("----------------------------------------------------------------------------------------------------");

        SocialMediaAccount sca1 = new SocialMediaAccount("tahaftm", "tahatariqf@gmail.com", "12-03-2020",670);
        SocialMediaAccount sca2 = new SocialMediaAccount("omer123", "omerrashid@gmail.com", "23-02-2020",230);
        sca1.displayInfo();
        sca2.displayInfo();

        System.out.println("----------------------------------------------------------------------------------------------------");
    
        InstagramBusinessAccount insta = new InstagramBusinessAccount("tahaftm", "tahatariqf@gmail.com", "12-03-2020",670,"AI", 23000);
        insta.displayInfo();
    }
}