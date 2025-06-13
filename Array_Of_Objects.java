class Student{
    int rollid;
    String name;
    int marks;

}

public class Array_Of_Objects {
    public static void main(Strings_[] args) {
        Student s1=new Student();
        s1.rollid=1;
        s1.name="ritik";
        s1.marks=90;

        //do it for s2
        Student s2=new Student();
        s2.rollid=2;
        s2.name="Mohit";
        s2.marks=85;

        //s3
        Student s3=new Student();
        s3.rollid=3;
        s3.name="Rohan";
        s3.marks=95;

        Student student[]=new Student[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        // for(int i=0;i<student.length;i++)
        // {
        //     System.out.println(student[i].name+" : "+student[i].marks);
        // }
        for(Student stud:student)
        {
            System.out.println(stud.name+" : "+stud.marks);
        }





    }
    
}
