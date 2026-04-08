import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class evenfilter {
  public static void main(String args[]){
  List<Integer> numbers= Arrays.asList(10,15,20,25,30,35);
//        //List<String>name=Arrays.asList("java","Python","GO","Ruby");
    ArrayList<Integer>list=new ArrayList<Integer>();
//        //ArrayList<String>list=new ArrayList<String>();
  list.addAll(numbers);
//        //list.addAll(name);
    System.out.println(numbers);
  list.stream().filter(n->n>15).filter(n->n%2==0).forEach((value)->System.out.print(value+" "));
//      // list.stream().filter((name)->name.contains("o")).forEach((value)->System.out.println(value+" "));
 }
}

//create a student class (name,marks)and wrte a prg using strmapi filter()to print student marks>60
