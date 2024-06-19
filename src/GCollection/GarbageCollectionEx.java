package GCollection;

public class GarbageCollectionEx {
    public void finalize(){
        System.out.println(" Calling finalized method.....");
    }
    public static void main(String[]args){

        GarbageCollectionEx t = new GarbageCollectionEx();
        GarbageCollectionEx t1 = new GarbageCollectionEx();

//        String s1=new String("Shruti");
//        String s2 =new String("Hake");
//
//        System.out.println(s1+ " " +s2);

        System.out.println(t);
        System.out.println(t1);

        t=null;  // Assign null value to the object

        new GarbageCollectionEx();  // Nameless object
       // System.gc();


System.out.println(" ************************ ");
        String s1=new String("Shruti");
        String s2 =new String("Hake");
        System.out.println(s1+ " " +s2);
        System.out.println(s1.hashCode() +"\t" + s2.hashCode());
        s1=s2;
        System.out.println(s1 + " " + s2);
        System.out.println(s1.hashCode() +"\t" + s2.hashCode());

        // can call gc  in 2 ways:
      // System.gc();  //static method
        //Runtime r = Runtime.getRuntime();
        // r.gc();      // instance method

       // Runtime r1 = Runtime.getRuntime();//

        Integer I = Integer.valueOf(100);
        System.out.println(I);

    }
}
