package List;

public class Student {// implements Comparable {
    String stdName;
    int stdRollno;
    int stdId;

    public Student(String stdName, int stdRollno, int stdId) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdRollno = stdRollno;
    }
}

//    @Override
//    public int compareTo(Object ob) {
//       // return Integer.compare(this.stdRollno,ob.std);
//        Integer.compare(this.stdId,ob.stdId)
//    }
//}
