package kr.co.soy.customer.domain;

public class CustomerVO {
	private int customerNo;
	private String customerId;
	private String customerPw;
	private String customerName;
	private String customerEmail;
	
	public CustomerVO() {} // 기본 생성자

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPw() {
		return customerPw;
	}

	public void setCustomerPw(String customerPw) {
		this.customerPw = customerPw;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	// toString = 디버깅용
	@Override
	public String toString() {
		return "CustomerVO [customerNo=" + customerNo + ", customerId=" + customerId + ", customerPw=" + customerPw
				+ ", customerName=" + customerName + ", customerEmail=" + customerEmail + "]";
	}
	
	
}
