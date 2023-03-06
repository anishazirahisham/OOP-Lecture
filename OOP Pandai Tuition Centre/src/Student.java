import java.util.ArrayList;

public class Student {

    private Name names;
    private Address addr;
    private String ic;
    private String schName;
    private float[] mark;

    public Student(Name names, String ic, Address addr, String schName, float[] mark){
        this.names = names;
        this.ic = ic;
        this.addr = addr;
        this.schName = schName;
        this.mark = mark;
    }

    public Name getName(){
        return names;
    }

    public void setIC(String ic){
        this.ic = ic;
    }
    public String getIC(){
        return ic;
    }
    
    public Address getAddress(){
        return addr;
    }

    public void setSchName(String schName){
        this.schName = schName;
    }
    public String getSchName(){
        return schName;
    }

    public float[] getMarks(){
        return mark;
    }

    public float calcAvg(float[] mark){
        float total=0, avg;
        for(int i=0; i<5; i++){
            total += mark[i];
        }
        avg=total/5;
        return avg;
    }

    public float CalcMinimum(float[] mark){
        float min = mark[0];
        for(int i=0; i<5; i++){
            if(mark[i]<min){
                min = mark[i];
            }
        }
        return min;
    }

    public float CalcMaximum(float[] mark){
        float max = mark[0];
        for(int i=0; i<5; i++){
            if(mark[i]>max){
                max = mark[i];
            }
        }
        return max;
    }

}