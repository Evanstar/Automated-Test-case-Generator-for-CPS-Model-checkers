package mypackage;
import java.util.ArrayList;
//import java.util.Random;
public class InvariantGenerator extends Template {
ArrayList<String> invariant=new ArrayList<String>();
String randomInvariant="";
public void checkInvariant()
{
	if(typeOfInvariant.equals("const")||typeOfInvariant.equals("constant"))
    {
	constantInvariant();
	}
	if(typeOfInvariant.equals("polytope"))
	{
		polytopeInvariant();
	}
	
}

public void constantInvariant()
{
  for(int i=0;i<locations;i++)
   {
	  for(int j=0;j<dimensions;j++)
	  {
		randomInvariant+=DimensionsGenerator.x.get(j)+"<="+randomSign()+randomValue();
		if(j<dimensions-1)
		 {
		   randomInvariant+="&";	
		 }
	  }
	    invariant.add(randomInvariant);
		//System.out.println(invariant.get(i));
		randomInvariant="";
	  }
	  
  }

public void polytopeInvariant()
{
	for(int i=0;i<locations;i++)
	{
		for(int j=0;j<dimensions;j++)
		  {
			randomInvariant+=randomValue()+"*"+DimensionsGenerator.x.get(j)+"<="+randomValue();
			if(j<dimensions-1)
			 {
			   randomInvariant+="&";	
			 }
		  }
		    invariant.add(randomInvariant);
			//System.out.println(invariant.get(i));
			randomInvariant="";
		  }  
		
	}
}


