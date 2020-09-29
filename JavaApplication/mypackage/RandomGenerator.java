package mypackage;

import java.util.*;
import java.text.DecimalFormat;
public class RandomGenerator 
{
 Random random=new Random();

public String randomSign()
{
	String randomsign="";
	if(random.nextInt(2)==0)
	{
		randomsign="-";
	}
	else
	{
		randomsign="";
	}
	
	return randomsign;
}

public double randomValue()
{
double a=100*random.nextDouble();
DecimalFormat df = new DecimalFormat("#.00");
    String random = df.format(a);
    double randomValue=Double.parseDouble(random);
    return randomValue;
}

	
	
}