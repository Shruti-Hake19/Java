package GetterSetter;

public class GetSet {

    private String Name;
    private int RollNo;

    //Getter
    public String getName(){
       return Name;
    }

    //Setter
    public void setName(String N)
    {
        this.Name = N;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }
}
