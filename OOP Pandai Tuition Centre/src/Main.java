import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("PANDAI TUITION CENTRE");
        System.out.println("How many students: ");
        int count = input.nextInt();

        StudentBatch allStudents = new StudentBatch();

        for(int i=0; i<count; i++){
            System.out.println("STUDENT " + (i+1));
            input.nextLine();
            System.out.println("Full Name: ");
            String fullName = input.nextLine();
            Name names = new Name(fullName);

            System.out.println("IC Number: ");
            String ic = input.nextLine();

            System.out.println("Full Address: ");
            String address = input.nextLine();
            Address addr = new Address(address);

            System.out.println("School Name: ");
            String schName = input.nextLine();

            float[] mark = new float[5];
            for(int j=0; j<5; j++){
                System.out.println("Mark " + (j+1) + ": ");
                mark[j] = input.nextFloat();
            }

            Student studObject = new Student(names, ic, addr, schName, mark);
            allStudents.addStudent(studObject);
        }

        System.out.println("\n-------------------------STUDENTS OF PANDAI TUITION CENTRE-------------------------");
        allStudents.displayAllStudents();

        System.out.println("Do you want to find anyone? | Yes=1 | No=0 |");
        int choice = input.nextInt();
        input.nextLine();

        if(choice == 1){
            System.out.println("Enter data you want to find: ");
            String cari = input.nextLine();
            boolean isIn = allStudents.find(cari);
            allStudents.displayFind(isIn);
        }
        else{
            System.exit(0);
        }
    }
}
