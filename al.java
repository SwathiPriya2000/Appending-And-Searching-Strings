import java.util.*;
public class al
{
public static void main(String args[])
{
 ArrayList<String>obj=new ArrayList<String>();
 obj.add("Ajeet");
 obj.add("Harry");
 obj.add("Chaitanya");
 obj.add("Steve");
 obj.add("Anuj");
 System.out.println("Currently the array list has following elements:"+obj);
 obj.add(0,"Rahul");
 obj.add(1,"Justin");
 obj.add("Chaitanya");
 obj.remove("Harry");
 System.out.println("Current array lists is:"+obj);
 obj.remove(1);
 System.out.println("Current array list is:"+obj);

 String search;

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the element to search");
 search=sc.next();
 int pos=obj.indexOf(search);
 if(pos==-1)
        System.out.println(search+"not present");
 else
        System.out.println(search+"is present in"+pos+"position");
}
}

