package mypackage;

import java.util.ArrayList;

public class FlowGenerator extends Template{
	ArrayList<String> flow_ld = new ArrayList<String>();
	String randomFlow = "";
	//ArrayList<String> flow_const = new ArrayList<String>();
	public void checkFlow()
	{
		
		if(flowChoice.equals("constant")||flowChoice.equals("const"))
		{
	      constantTypeFlow();
		}
		
		else if(flowChoice.equals("affine"))
		{
		  affineTypeFlow();	
		}
		else if(flowChoice.equals("none")) 
		{
			noneTypeFlow();
		}
 }
	
	
public void constantTypeFlow()
	{ 
	 for(int i=0;i<locations;i++)
		{
		 for(int j=0;j<dimensions;j++)
				{
					
				
				   randomFlow+=DimensionsGenerator.x.get(j)+"'"+"=="+randomValue();
				if(j<dimensions-1)
				 {
				   randomFlow+="&";	
				 }
				}
				 flow_ld.add(randomFlow);
				randomFlow="";
			}
    }
	
public void affineTypeFlow()
{
	
	for(int i=0;i<locations;i++)
	{
	 for(int j=0;j<dimensions;j++)
			{
			    randomFlow+=DimensionsGenerator.x.get(j)+"'"+"=="+affine();
			if(j<dimensions-1)
			 {
			   randomFlow+="&";	
			 }
			}
			 flow_ld.add(randomFlow);
			randomFlow="";
		}
}


public void noneTypeFlow()
{
	for(int i=0;i<locations;i++)
	{
	 for(int j=0;j<dimensions;j++)
			{
			    randomFlow+=DimensionsGenerator.x.get(j)+"'"+"==0";
			if(j<dimensions-1)
			 {
			   randomFlow+="&";	
			 }
			}
			 flow_ld.add(randomFlow);
			randomFlow="";
		}
}


public String affine()
{
    String affine="";
    for(int i=0;i<dimensions;i++)
     {
		affine+=randomValue()+"*"+DimensionsGenerator.x.get(i)+ " ";     	   
    	if(i<dimensions-1)
    	affine+="+" +" ";
    }
     

return affine;
}

}
