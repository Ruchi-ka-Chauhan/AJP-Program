class Student{
    String name;
    int age;

Student(String n,int a){   //parameterizd constructor
    name=n;
    age=a;
}
    Student(Student s){ //copy constructor
name=s.name;
age=s.age;
}
void display(){
    System.out.println("name : "+name+"  age : "+age);
}
}
public class Constructor {
    public static void main(String args[]) {
Student s1=new Student("Rahul",22);
Student s2=new Student(s1);
s1.display();
s2.display();
    }
}
