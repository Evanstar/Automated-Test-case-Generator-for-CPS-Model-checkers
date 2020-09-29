package mypackage;
import java.util.*;
public class DimensionsGenerator extends Template {
	public static ArrayList<String> x=new ArrayList<String>();
	public void dimensions()
	{
	for(int i=0;i<dimensions;i++)
	{
	x.add("x"+i);
	System.out.println(x.get(i));
	}
	}

}
