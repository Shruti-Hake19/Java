package Compositions;

import java.awt.List;
import java.util.ArrayList;


public class CompositionEx {

    public static void main(String[]args){

        College c1 = new College("Deogiri clg","Abad");
        College c2 = new College("MIT","Pune");
        College c3 = new College("Medical clg","Jalna");

        // Creating list which contains the no. of colleges.
        ArrayList college = new ArrayList<College>();
        college.add(c1);
        college.add(c2);
        college.add(c3);
        University university = new University(college);

//        List<College> colleges = university.getTotalCollegesInUniversity();
//        for (College cg : colleges) {
//            System.out.println("Name : " + cg.name
//                    + " and "
//                    + " Address : " + cg.address);
        }
    }


