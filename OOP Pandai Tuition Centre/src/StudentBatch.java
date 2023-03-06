import java.util.ArrayList;
import java.util.List;
import java.util.spi.CurrencyNameProvider;

import javax.swing.text.StyledEditorKit.ForegroundAction;


public class StudentBatch {
    private ArrayList<Student> allStudents;

    public StudentBatch(){
        allStudents = new ArrayList<Student>();
    }

    public void addStudent(Student studObject){
        //ArrayList<Student> studIndiv = new ArrayList<>();
        allStudents.add(studObject);
    }

    public void displayAllStudents(){
        
        for(int i=0; i<allStudents.size(); i++){
            Student currStudent = allStudents.get(i);
            Name name = currStudent.getName();
            Address address = currStudent.getAddress();

            System.out.println("STUDENT " + (i+1));
            System.out.println("FULL NAME: " + name.getFullName());
            System.out.println("FIRST: " + name.getFname() + "| MIDDLE: " + name.getMname() + " | LAST: " + name.getLname());
            System.out.println("IC NUMBER: " + currStudent.getIC());
            System.out.println("ADDRESS: " + address.getFullAddress());
            System.out.println("NO: " + address.getNum() + " | AREA: " + address.getArea() + " | POSSCODE: " + address.getPosscode() + " | DISTRICT: " + address.getDistrict() + " | STATE: " + address.getState());
            System.out.println("SCHOOL: " + currStudent.getSchName());
            System.out.println("AVERAGE MARK: " + currStudent.calcAvg(allStudents.get(i).getMarks()));
            System.out.println("MINIMUM MARK: " + currStudent.CalcMinimum(allStudents.get(i).getMarks()));
            System.out.println("MAXIMUM MARK: " + currStudent.CalcMaximum(allStudents.get(i).getMarks()));
            //System.out.println("\n");
        }
    }

    public boolean find(String cari){
        boolean found = false;
        for(int i=0; i<allStudents.size(); i++){
            if(allStudents.get(i).getName().getFullName().equals(cari)){
                            //Student.java  //Name.java
                found = true;
                break;
            }
            else if(allStudents.get(i).getName().getFname().equals(cari)){
                found = true;
                break;
            }
            else if(allStudents.get(i).getName().getMname().equals(cari)){
                found = true;
                break;
            }
            else if(allStudents.get(i).getName().getLname().equals(cari)){
                found = true;
                break;
            }
        }
        return found;
    }

    public void displayFind(boolean found){
        System.out.println("FIND: " + found);
    }
}
