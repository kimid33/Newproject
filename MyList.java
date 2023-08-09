import java.util.*;
class MyList
{
	 public static void main(String args[]){    
    //Create List    
    List<String> n = new ArrayList<String>();    
    //Adding elements in the List.   
    n.add("hello");    
    n.add("this");    
    n.add("is");    
    n.add("me");    
    n.add("hello");    
    n.add("this");    
    n.add("is");    
    n.add("me"); 
    //Performing iteration of list to print each element of it.   
    //for(String name: n)    
        System.out.println(n);     //List is an indexed sequence.   
    }    
}

class MySet
{
	public static void main(String args[]){    
    //Create List    
    Set<String> n1 = new HashSet<String>();    
    //Adding elements in the List.   
    n1.add("hello");    
    n1.add("this");    
    n1.add("is");    
    n1.add("me");    
    n1.add("hello");    
    n1.add("this");    
    n1.add(null);    //null element can store only
    //Performing iteration of list to print each element of it.   
    //for(String name: n)    
        System.out.println(n1);   //Set is an non-indexed sequence.
    }
}