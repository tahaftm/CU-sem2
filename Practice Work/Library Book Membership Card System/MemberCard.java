public class MemberCard{
    // Attributes:
    private static int counter;
    private static final String PREFIX = "LIB-";
    private String cardNo;
    private String studentName;
    private String department;
    private int semester;
    private double feePaid;
    private boolean active;
    // Constructor:
    public MemberCard(String studentName, String department,int semester,double feePaid,boolean  active){
        this.studentName = studentName;
        this.department =department;
        this.semester = semester;
        this.feePaid = feePaid;
        this.active = active;
        counter++;
        this.cardNo = generateCardNo();
    }
    public MemberCard(String studentName){
        this.studentName = studentName;
        counter++;
        this.cardNo = generateCardNo();
    }
    public MemberCard(String studentName, String department){
        this.studentName = studentName;
        this.department =department;
        counter++;
        this.cardNo = generateCardNo();
    }
    //Default Constructor:
    public MemberCard(){
        this("Unknown", "BSSE", 1,0,true);
    }
    //Copy Constructor:
    public MemberCard(MemberCard other){
        this.studentName = other.studentName;
        this.department =other.department;
        this.semester = other.semester;
        this.feePaid = other.feePaid;
        this.active = other.active;
    }
    // Static method requirements:
    public static int getTotalCards(){
        int totalCards = counter;
        return totalCards;
    }
    /// Methods to Implement
    private String generateCardNo(){
        cardNo = PREFIX+"-"+department+"-"+String.format("%03d", counter);
        return cardNo;
    }

    public void payFee(double amount){
        if(amount >= 0){
            feePaid+=amount;
        }
    }

    public String toString(){
        return cardNo + studentName + department + "semester: " + semester;
    }

    public void deactivateCard(){
        active = false;
    }

    public void activateCard(){
        active = true;
    }

    
}