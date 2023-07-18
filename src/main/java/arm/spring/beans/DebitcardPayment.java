package arm.spring.beans;

public class DebitcardPayment implements IPayment {
	public DebitcardPayment() {
		System.out.println("Debitcard constructor executed");
	}

	public boolean payBill(Double billAmount) {
		System.out.println("DebitcardPayment payBill() method called");
		return true;
	}

}
