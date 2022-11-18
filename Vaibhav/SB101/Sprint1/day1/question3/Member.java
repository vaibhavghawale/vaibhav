package com.Sprint1.day1.question3;

public class Member {
	
	int memberId;
	String memberName;
	int membershipNo;
	String membershopEnddate;
	
	public Member() {
		super();
	}
	
	
	public Member(int memberId, String memberName, int membershipNo, String membershopEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershopEnddate = membershopEnddate;
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershopEnddate=" + membershopEnddate + "]";
	}
	
	
	
	
	
	

}
