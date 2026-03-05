
public class MemberCard {

    public static int counter;
    public String name;
    public String dept;
    public int semester;
    public boolean active;
    public double feePaid;
    private static final String PREFIX = "LIB-";
    private String cardNo;

    MemberCard(String name) {
        this.name = name;
        cardNo = PREFIX + counter;
        counter++;
    }

    MemberCard(String name, String dept) {
        this.name = name;
        this.dept = dept;
        cardNo = PREFIX + counter;
        counter++;
    }

    MemberCard(String name, String dept, int semester, double feePaid) {
        this.name = name;
        this.dept = dept;
        this.semester = semester;
        this.feePaid = feePaid;
        cardNo = PREFIX + counter;
        counter++;
    }

    // Copy constructor
    MemberCard(MemberCard other) {
        this.name = other.name;
        this.dept = other.dept;
        this.semester = other.semester;
        this.feePaid = other.feePaid;
        this.active = other.active;

        // Increase counter and assign a new card number
        counter++;
        this.cardNo = PREFIX + counter;
    }

    public static int getCardNo(MemberCard object) {
        return counter;
    }

    public static int getTotalCards() {
        return counter;
    }

    public void deactivateCard() {
        this.active = false;
    }

    public void activateCard() {
        this.active = true;
    }

    public void payFee(double amount) {
        if (amount > 1) {
            this.feePaid += amount;
        } else {
            System.out.println("Amount can not be negative");
        }
    }

    public String toString() {
        return cardNo + " " + name + " " + dept + " " + semester + " Fee: " + feePaid + " Active: " + active;
    }

}
