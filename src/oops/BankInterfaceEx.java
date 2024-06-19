package oops;

 interface BankInterfaceEx1 {

    float rateOfInterest();
}
class SBI implements BankInterfaceEx1{
    public float rateOfInterest(){
        return 9.15f;
    }
}
class PNB implements BankInterfaceEx1{
    public float rateOfInterest(){
        return 9.7f;
    }
}

class TestInterface2{
    public static void main(String[] args){
        BankInterfaceEx1 b=new SBI();
        System.out.println("ROI: "+b.rateOfInterest());

        BankInterfaceEx1 b1 = new PNB();
        System.out.println(b1.rateOfInterest());

    }
 }

