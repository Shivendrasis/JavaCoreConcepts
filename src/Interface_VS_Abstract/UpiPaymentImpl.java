package Interface_VS_Abstract;

public class UpiPaymentImpl implements Payments{


    @Override
    public void makePayment(int amount) {
        System.out.println("Amount : "+ amount + " Done by Upi payment");
    }

    @Override
    public void getPaymentStatus() {

        System.out.println("UPI Payment successfully !");
    }
}
