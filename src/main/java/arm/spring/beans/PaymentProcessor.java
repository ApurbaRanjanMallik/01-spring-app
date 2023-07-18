package arm.spring.beans;

public class PaymentProcessor {
	private IPayment payment;

	public PaymentProcessor() {
		System.out.println("PaymentProcessor constructor executed");
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void doPayment(double billAmount) {
		boolean paymentStatus = payment.payBill(billAmount);
		if (paymentStatus) {
			System.out.println("Payment completed successfully : )");
		} else {
			System.out.println("Payment failed : (");
		}
	}
}
