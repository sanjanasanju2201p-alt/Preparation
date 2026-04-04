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
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sanju";
        s1.marks= 100;
        s1.rollno= 58;
        s1.displayInfo();
        Student s2=s1;
        s2.name="anu";
        System.out.println(s1.name);



        
    }

}
