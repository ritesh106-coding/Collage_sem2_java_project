class student{
    int rollno;
    String name;

    student(){
        System.out.println("==============Student detail===============");
    }
    
    student(String n,int r){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println("RollNo:-" +rollno+ "   Name:- " +name);
    }
}
class Main{
    public static void main(String[]args){
        student s=new student();
        student s1=new student("Ritesh",1);
        student s2=new student("Himanshi",2);
         student s3=new student("OM",3);
        s1.display();
           s2.display();
              s3.display();
        
    } 
}
