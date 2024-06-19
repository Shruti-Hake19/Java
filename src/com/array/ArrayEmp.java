package com.array;

public class ArrayEmp {
    int eid;
    String  name;
    double salary;

    public ArrayEmp(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayEmp e1 = new ArrayEmp(1,"Vijay",20000);
        ArrayEmp e2 = new ArrayEmp(2,"Shreya",10000.45);
        ArrayEmp e3 = new ArrayEmp(3,"Tania",50000.50);

        ArrayEmp[] arrayEmps = new ArrayEmp[5];
        arrayEmps[0] = e1;
        arrayEmps[1] = e2;
        arrayEmps[4] = e3;

        System.out.println("Array length is... " + arrayEmps.length);

        System.out.println("**************");

        for( ArrayEmp e : arrayEmps)
        {
            if (e == null)
            {
                System.out.println(e);
            }
            else if (e != null)
            {
                System.out.println(e.eid + "  " + e.name + " " + e.salary);
            }
        }
        System.out.println("**************");
        System.out.println("Null Values indexes....");
        // find null indexes
        for(int i = 0; i<arrayEmps.length; i++)
        {
            if (arrayEmps[i] == null)
            {
                System.out.println(i);
            }

        }

    }
}
