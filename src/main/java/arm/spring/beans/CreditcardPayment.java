package arm.spring.beans;

public class CreditcardPayment implements IPayment {
	public CreditcardPayment() {
		System.out.println("CreditcardPayment constructor executed..");
	}

	public boolean payBill(Double billAmount) {
		System.out.println("CreditcardPayment payBill() method called");
		return true;
	}

}
