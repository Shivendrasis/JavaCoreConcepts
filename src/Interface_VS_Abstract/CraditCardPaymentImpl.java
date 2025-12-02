package Interface_VS_Abstract;

public class CraditCardPaymentImpl implements Payments{

    @Override
    public void makePayment(int amount) {

        System.out.println("Amount: " + amount + " Done by credit card");
    }

    @Override
    public void getPaymentStatus() {

        System.out.println("Credit card payment successfully !");
    }
}
