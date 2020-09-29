package mypackage;

import java.util.*;
import java.io.*;
	class CFGgenerator extends XMLFileGenerator
	{
	String cfgpath=s.replace("xml", "cfg");
	CFGgenerator()
	{
	super();

	}
	public void cfgFile() 
	{
		String initialValue="";
		Random random=new Random();
		try{
		FileWriter fw=new FileWriter(cfgpath);
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("# Analysis options");
		pw.println("# Test-Case");
		pw.println("system ="+"\"template1\"");
		pw.println("scenario ="+"\"supp\"");
		pw.println("directions ="+"\"box\"");
		pw.println("sampling-time =0.2");
		pw.println("time-horizon =40");
		pw.println("iter-max =200");
		pw.println("output-format ="+ "\"GEN\"");
		pw.println("rel-err = 1.0e-12");
		pw.println("abs-err = 1.0e-13");
		for(int i=0;i<DimensionsGenerator.dimensions;i++)
		{	initialValue+= " "+DimensionsGenerator.x.get(i)+"==0"+"&";
			
		}
		initialValue+="loc(template1)=="+LocationsGenerator.v.get(random.nextInt(LocationsGenerator.locations));
		pw.println("initially=\""+initialValue+"\"");
		pw.println("output-variables ="+"\"x0,x1\"");
		fw.close();
		}
		catch(IOException e)
		{
		System.out.println("I/O Error"+e);	
		}
		}
	
		

}