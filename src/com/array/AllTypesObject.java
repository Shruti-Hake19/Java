package com.array;

public class AllTypesObject {
    public static void main(String[] args) {


        Object[] a= new Object[3];
        a[0]=new ArrayEmp(111,"vijay",20000.00);
        a[1]= Integer.valueOf(10);
        a[2]=new String("Ronak");

        for (Object  obj : a)
        {
            if (obj instanceof ArrayEmp)
            {
                ArrayEmp emp1 = (ArrayEmp) obj;
                System.out.println(emp1.eid + " " + emp1.name + emp1.salary);
            }
            if (obj instanceof Integer)
            {
                System.out.println(obj);
            }
            if (obj instanceof String)
            {
                System.out.println(obj);
            }
        }

    }
}
