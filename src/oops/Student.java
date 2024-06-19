package oops;

public class Student {
    int stdId;
    String stuName;
    Address Address;
    int sturollNo;

    Student(int stdId, String stuName, Address Address, int sturollNo) {

        this.stdId = stdId;
        this.stuName = stuName;
        this.Address = Address;
        this.sturollNo = sturollNo;

    }

    void disp() {
        System.out.println("stuId: " + stdId);
        System.out.println("stuName:  " + stuName);
        System.out.println("Address " +Address.bNo+" "+Address.city+" "+Address.area);
        System.out.println("studrollNo " + sturollNo);
    }

    public static void main(String[] arg) {
        Address a = new Address(40,"pune","warje");
        Student b = new Student(101,"Shruti",a,40);
        b.disp();
}
}