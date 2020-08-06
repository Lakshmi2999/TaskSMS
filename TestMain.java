
import java.util.Scanner;
public class TestMain {
    public static void main(String[] args) {
        int total;
        Scanner sc=new Scanner(System.in);
        StudentDetails studentDetailsObject= new StudentDetails();
        System.out.println("Enter no of Students:");
        total=Integer.parseInt(sc.next());
        studentDetailsObject.allStudentDetails=new Student[total];
        while(true){
        	int choice=0;
            System.out.println("1.Register Student\n2.Display all Student Details\n3.Search Student with ID\n4.Search Student with Name\n5.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:Student studentObject=new Student();
                        System.out.println("Enter the Student Id:");
            	        studentObject.setStudId(Integer.parseInt(sc.next()));
                        System.out.println("Enter the Student name:");
                        studentObject.setStudName(sc.next());
                        System.out.println("Enter the course completed:");
                        studentObject.setCourse(sc.next());
                        System.out.println("Enter the number of contact numbers:");
                        int noOfContactNum=Integer.parseInt(sc.next());
                        String phnNum[]= new String[noOfContactNum];
                        int countOf=1;
                        for(int indexOfPhnNum=0;indexOfPhnNum<noOfContactNum;indexOfPhnNum++){
                            System.out.println("Enter contact number "+ countOf++ +": ");
                            phnNum[indexOfPhnNum]=sc.next();
                        }
                        studentObject.setPhnNo(phnNum);
                        studentDetailsObject.register(studentObject);
                        break;
                case 2:studentDetailsObject.displayDetails();
                        break;
                case 3:System.out.println("Enter the Student Id");
                        int idToSearch=Integer.parseInt(sc.next());
                        studentDetailsObject.displayDetails(idToSearch);
                        break;
                case 4:System.out.println("Enter the Student Name");
                        String nameToSearch=sc.next();
                        studentDetailsObject.displayDetails(nameToSearch);                       
                        break;
                case 5:System.out.println("****** Thank you ******");
                        System.exit(0);
            }
        }
    }
}