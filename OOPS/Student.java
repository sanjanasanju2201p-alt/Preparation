package Preparation.OOPS;
class Student{   
    String name;
    int marks;
    int rollno;
    
    void displayInfo(){
        System.out.println(name);
        System.out.println(marks);
        System.out.println(rollno);
    }
    boolean isPass(){
        if(marks>40){
            return true;

        }
        else{
            return false;
        }

    }
    

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sanju";
        s1.marks= 40;
        s1.rollno= 32;
        s1.displayInfo();
        Student s2=s1;
        s2.name="anu";  // Reference coping
        System.out.println(s1.name);
        System.out.println("pass"+s1.isPass());



        
    }
}

