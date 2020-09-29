package mypackage;
import java.util.*;
public class LocationsGenerator extends Template {
	public static ArrayList<String> v=new ArrayList<String>();
	public void location()
	{
	for(int i=0;i<locations;i++)
	{
	v.add("v"+i);
	System.out.println(v.get(i));
	}
	}

}
