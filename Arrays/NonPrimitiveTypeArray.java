import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int marks;
    public Student(int rollno, String name, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
public class NonPrimitiveTypeArray {
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           Student arr[]=new Student[5];
           for(int i=0;i<arr.length;i++){
               arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt());
           }
           for(int i=0;i<arr.length;i++){
               System.out.println(arr[i].rollno +" "+arr[i].name +" "+arr[i].marks);
           }
       }
}
