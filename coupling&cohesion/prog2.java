class A
{

//data member "name" is declared private to implement loose coupling.
private String name;


public String getName()
{

//Checking a valid access to name
if(name!=null)
	return name;
else
	return"not initiaized";
}

public void setName(String s)
{

//Checking a valid setting to name
if (s==null)
{
	System.out.println("You can't initialize name to a null");
}
}

}

class B
{
public static void main(String... ar)
{
A ob= new A();

//Calling setter method, as the direct access of "name" is not possible i.e. loose coupling between classes
ob.setName(null);

//Calling getter method, as the direct access of "name" is not possible i.e. loose coupling
System.out.println("Name is " + ob.getName()); 	  
}
}
