package mypackage;

import java.util.ArrayList;
//import java.util.Random;


public class GuardGenerator extends Template{
     ArrayList<String> guard = new ArrayList<String>();
     String randomGuard="";
     public void  checkGuard()
     {
     	if(typeOfGrd.equals("const")||typeOfGrd.equals("constant"))
     	{
     	constantGuard();
     	}
     	if(typeOfGrd.equals("polytope"))
     	{
     		polytopeGuard();
     	}
     }


     public void constantGuard()
     {
     	for(int i=0;i<transitions;i++)	
     	{
     		for(int j=0;j<dimensions;j++)
     		{
     	     randomGuard+=DimensionsGenerator.x.get(j)+"<"+randomSign()+randomValue();
     	     if(j<dimensions-1)
     	     {
     	    	 randomGuard+="&";
     	     }
     		}
     		guard.add(randomGuard);
     		//System.out.println(guard.get(i));
     		randomGuard="";
     	}	
     }

     public void polytopeGuard()
     {
     	for(int i=0;i<transitions;i++)	
     	{
     		for(int j=0;j<dimensions;j++)
     		{
     			randomGuard+=randomValue()+"*"+DimensionsGenerator.x.get(j)+"<="+randomValue();
     	     if(j<dimensions-1)
     	     {
     	    	 randomGuard+="&";
     	     }
     		}
     		guard.add(randomGuard);
     		//System.out.println(guard.get(i));
     		randomGuard="";
     	}	
     }



     }