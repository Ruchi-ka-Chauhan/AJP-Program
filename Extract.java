package mse;


//        class Employee{
//            String name;
//            Employee(String name){
//                this.name=name;
//            }
//}
//public class Extract{
//    public static void main(String[] args) {
//        List<String> list= Arrays.asList(new Employee("Amit"),new Employee("Rahul"));
//        List<String> result=list.stream().map(emp->emp.name).collect(Collectors.toList());
//        System.out.println(result);
//    }
//}
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

public class Extract {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Amit"),
                new Employee("Rahul")
        );

        List<String> result = list.stream()
                .map(emp -> emp.name)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}