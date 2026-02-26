public class MemberCard{
	private static int counter;
	private static final String PREFIX = "LIB-";

	private String cardNumber;
    	private int semester;
    	private String studentName;
    	private double feePaid;
	private boolean active;
    	private String department;

	public String generateCardNumber() {
        	counter++;
        	return PREFIX + counter;
	}
	
	public MemberCard(String studentName) {
        	this.cardNumber = generateCardNumber();
        	this.studentName = studentName;
        	this.department = "BSSE";
        	this.semester = 1;
        	this.feePaid = 0;
        	this.active = true;
	}

	public MemberCard(String studentName, String department) {
        	this.cardNumber = generateCardNumber();
        	this.studentName = studentName;
        	this.department = department;
        	this.semester = 1;
        	this.feePaid = 0;
        	this.active = true;
    	}

    	public MemberCard(String studentName, String department,int semester, double feePaid, boolean active) {
        	this.cardNumber = generateCardNumber();
        	this.studentName = studentName;
        	this.department = department;
        	this.semester = semester;
        	this.feePaid = feePaid;
        	this.active = active;
    	}

	public MemberCard() {
    		this.cardNumber = generateCardNumber();
    		this.studentName = "Unknown";
    		this.department = "Unknown";
    		this.semester = 0;
    		this.feePaid = 0;
    		this.active = false;
	}
	
	public MemberCard(MemberCard other) {
        	this.cardNumber = generateCardNumber();
        	this.studentName = other.studentName;
        	this.department = other.department;
        	this.semester = other.semester;
        	this.feePaid = other.feePaid;
        	this.active = other.active;
    	}

	public void payFee(double amount) {
    		this.feePaid += amount;
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

	public String getName() {
		return studentName;
	}

	public int getSemester() {
		return semester;
	}

	public String getDept() {
		return department;
	}

	public double getFee() {
		return feePaid;
	}

	public boolean getStatus() {
		return active;
	}
	
}