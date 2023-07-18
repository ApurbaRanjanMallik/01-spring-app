package arm.spring.beans;

public class ZetacardPayment implements IPayment {
	public ZetacardPayment() {
		System.out.println("Zatacrad constructor executed");
	}

	public boolean payBill(Double billAmount) {
		System.out.println("ZetacardPayment payBill() method called");
		return true;
	}

}
