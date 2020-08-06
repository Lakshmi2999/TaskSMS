public class StudentDetails{
    int countOfStudents=0;
    Student allStudentDetails[];
    void register(Student studentObject){
        allStudentDetails[countOfStudents]=studentObject;
        countOfStudents++;
    }
    void displayDetails(){
        if(countOfStudents==0)
        System.out.println("****** No students registered yet ******");
        for(int indexOfStudentDetails=0;indexOfStudentDetails<countOfStudents;indexOfStudentDetails++) {
            int countOfPhnNum=1;
            System.out.println("Student ID: "+allStudentDetails[indexOfStudentDetails].getStudId()+"\nStudent Name: "+allStudentDetails[indexOfStudentDetails].getStudName()+"\nCourse completed: "+allStudentDetails[indexOfStudentDetails].getCourse());
            for(String str:allStudentDetails[indexOfStudentDetails].getPhnNo())
                System.out.println("Contact Number "+countOfPhnNum++ +": "+str);
            System.out.println("****************************");
        }
    }
    void displayDetails(String nameToSearch){
        boolean foundName=false;
        for(int indexOfStudentDetails=0;indexOfStudentDetails<countOfStudents;indexOfStudentDetails++){
            if(nameToSearch.equals(allStudentDetails[indexOfStudentDetails].getStudName())){
                int countOfPhnNum=1;
                System.out.println("Student Id: "+allStudentDetails[indexOfStudentDetails].getStudId()+"\nCourse completed: "+allStudentDetails[indexOfStudentDetails].getCourse());
                for(String str:allStudentDetails[indexOfStudentDetails].getPhnNo())
                    System.out.println("Contact Number "+countOfPhnNum++ +": "+str);
                System.out.println("****************************");
                foundName=true;
            }
        }
        if(foundName==false){
            System.out.println("****** No Student with name "+nameToSearch+ " ******");
        }                     
    }
    void displayDetails(int idToSearch){
        boolean foundId=false;
        for(int indexOfStudentDetails=0;indexOfStudentDetails<countOfStudents;indexOfStudentDetails++){
            if(idToSearch==allStudentDetails[indexOfStudentDetails].getStudId()){
                int countOfNo=1;
                System.out.println("Student Name: "+allStudentDetails[indexOfStudentDetails].getStudName()+"\nCourse completed: "+allStudentDetails[indexOfStudentDetails].getCourse());
                for(String str:allStudentDetails[indexOfStudentDetails].getPhnNo())
                    System.out.println("Contact Number "+countOfNo++ +": "+str);
                System.out.println("****************************");
                foundId=true;
            }
        }
        if(foundId==false){
            System.out.println("****** No Student with ID "+idToSearch+" ******");
        }
    }
}