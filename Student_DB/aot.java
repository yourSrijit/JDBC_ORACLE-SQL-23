package Student_DB;

public class aot {
    private int roll;
    private String name;
    private int std;
    private int marks;
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public int getMarls() {
        return marks;
    }

    public void setMarls(int marls) {
        this.marks = marls;
    }
    public aot(int roll,String name,int std,int marks){
        super();
        this.roll=roll;
        this.name=name;
        this.std=std;
        this.marks=marks;
    }
    public aot(){

    }


}
