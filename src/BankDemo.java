abstract class Bank {
    abstract float getRateOfInterest();
}
class SBI extends Bank {
    float getRateOfInterest() {
        return 6.4f;
    }
}
class HDFC extends Bank {
    float getRateOfInterest() {
        return 7.8f;
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new HDFC();
        System.out.println("SBI Rate of Interest: " + b1.getRateOfInterest() + "%");
        System.out.println("HDFC Rate of Interest: " + b2.getRateOfInterest() + "%");
    }
}

