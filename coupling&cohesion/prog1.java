

class A
{
public String name; //public data member of A class


public String getName()
{

//Checking a valid access to "name"
if(name!=null)
	return name;
else
	return"not initiaized";
}


public void setName(String s)
{

//Checking a valid setting to "name"
if (s==null)
{
	System.out.println("You can't initialized name to a null");
}
}

} 



class B
{
public static void main(String... ar)
{
A ob= new A();

//Directly setting the value of data member "name" of class A, due to tight coupling between the two classes
ob.name=null;  

//Direct access of data member "name" of class A, due to tight coupling between two classes
System.out.println("Name is " + ob.name); 	  
}
}
