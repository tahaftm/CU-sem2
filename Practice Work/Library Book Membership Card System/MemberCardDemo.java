public class MemberCardDemo{
    public static void main(String[] args) {
        MemberCard m1 = new MemberCard("Taha", "BSCS", 2, 12000, true);     // Orginal contructor
        MemberCard m2 = new MemberCard("Fatima", "ACCA");       // Overloaded constructor
        MemberCard m3 = new MemberCard("Ali");      // Overloaded constructor
        MemberCard m4 = new MemberCard();     // Default constructor
        MemberCard m5 = new MemberCard(m4);   // Copy constructor
        m1.deactivateCard();
        m2.activateCard();
        System.out.println(m1.toString());
        System.out.println("Total Cards: "+m5.toString());

    }
}