import Interface_VS_Abstract.CraditCardPaymentImpl;
import Interface_VS_Abstract.Payments;
import Interface_VS_Abstract.UpiPaymentImpl;


public class Main {
    public static void main(String[] args) {


        //Client Code (Using Interface Reference)

        Payments p1 = new UpiPaymentImpl();
        p1.makePayment(5000);
        p1.getPaymentStatus();


        System.out.println("___________________________");

        Payments p2 = new CraditCardPaymentImpl();
        p2.makePayment(8000);
        p2.getPaymentStatus();
    }
}