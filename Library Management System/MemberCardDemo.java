public class MemberCardDemo{
    public static void main(String[] args) {
        // 1. Default constructor (name only)
        MemberCard m1 = new MemberCard("Ali");
        m1.activateCard(); // activate the card

        // 2 & 3. Overloaded constructor (name + dept)
        MemberCard m2 = new MemberCard("Sara", "CS");
        MemberCard m3 = new MemberCard("Taha", "AI");

        // 4 & 5. Full constructor (name + dept + semester + feePaid)
        MemberCard m4 = new MemberCard("Aisha", "EE", 3, 5000);
        MemberCard m5 = new MemberCard("Bilal", "ME", 2, 4500);

        // 6. Copy constructor (copy of m4)
        MemberCard m6 = new MemberCard(m4);

        // ---------- Method Calls ----------

        // Pay fee for at least 1 member
        m1.payFee(2000);

        // Deactivate at least 1 member
        m3.deactivateCard();

        // Activate at least 1 member (could be same or different)
        m5.activateCard();

        // ---------- Printing ----------

        System.out.println("All Member Cards:");
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);

        // Print total cards created
        System.out.println("Total cards created: " + MemberCard.getTotalCards());
    }
}