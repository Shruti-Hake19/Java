package oops;

public class Testbank {
    public static void main(String[]args){

        SBIBank s = new SBIBank();
        AxisBank a = new AxisBank();
        ICICIBank i = new ICICIBank();

        System.out.println("SBI rate of interest is "+s.getRateOfInterest());
        System.out.println("AxisBank rate of interest is "+a.getRateOfInterest());
        System.out.println("ICICIBank rate of interest is "+i.getRateOfInterest());
    }
}
