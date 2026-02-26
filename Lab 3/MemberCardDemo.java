public class MemberCardDemo{
	public static void main(String[] args){
		MemberCard m1 = new MemberCard();
        	MemberCard m2 = new MemberCard("Ali");
        	MemberCard m3 = new MemberCard("Sana", "BBA");
        	MemberCard m4 = new MemberCard("Ahmed", "BSCS", 3, 500, true);
        	MemberCard m5 = new MemberCard("Hira", "BSE", 2, 300, false);
        	MemberCard m6 = new MemberCard(m4);

        	m2.payFee(400);        
        	m3.deactivateCard();   
        	m5.activateCard();     

		System.out.println(m2.generateCardNumber() + " " + m2.getName() + " " + m2.getDept() + " " + m2.getSemester() + " Fees: " + m2.getFee() + " Active: " + m2.getStatus());

		System.out.println(m3.generateCardNumber() + " " + m3.getName() + " " + m3.getDept() + " " + m3.getSemester() + " Fees: " + m3.getFee() + " Active: " + m3.getStatus());
        	System.out.println("Total Cards Created: " + MemberCard.getTotalCards());
	}
}