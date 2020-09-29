package mypackage;
import java.util.ArrayList;
//import java.util.Random;
public class AssignmentGenerator extends Template 
{
	ArrayList<String> assignment=new ArrayList<String>();
	String randomAssignment="";
	
	public void checkAssignment()
	{
		if(typeOfAssignment.equals("const")||typeOfAssignment.equals("constant"))
		{
			constantAssignment();
		}
		if(typeOfAssignment.equals("affine"))
		{
			affineAssignment();
		}
	}

	public void constantAssignment()
	{
		for(int i=0;i<transitions;i++)	
		{
			for(int j=0;j<dimensions;j++)
			{
		     randomAssignment+=DimensionsGenerator.x.get(j)+":="+randomSign()+randomValue();
		     if(j<dimensions-1)
		     {
		    	 randomAssignment+="&";
		     }
			}
			assignment.add(randomAssignment);
			//System.out.println(assignment.get(i));
			randomAssignment="";
		}	
	
     }
	
	public void affineAssignment()
	{
		for(int i=0;i<transitions;i++)	
		{
			for(int j=0;j<dimensions;j++)
			{ randomAssignment+= DimensionsGenerator.x.get(j)+":=";
			for(int k=0;k<dimensions;k++) {
				 if(k<dimensions-1) {
					 randomAssignment+=randomValue()+"*"+DimensionsGenerator.x.get(k)+"+";	 
				 }
				 else {
					 randomAssignment+=randomValue()+"*"+DimensionsGenerator.x.get(k);
				 }
				 
				 }
			     if(j<dimensions-1)
			     {
			    	 randomAssignment+="&";
			     }
			
		     
			}
			assignment.add(randomAssignment);
			//System.out.println(assignment.get(i));
			randomAssignment="";
		}	
		
	}

}	