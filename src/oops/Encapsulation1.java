package oops;

public class Encapsulation1 {
   private int sId;
   private String sName;
   private double mathMarks;
   private double scienceMarks;

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }

    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks;
    }


    // public return type getXXX()     -return type   - property type


    public int getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public double getMathMarks() {
        return mathMarks;
    }

    public double getScienceMarks() {
        return scienceMarks;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
