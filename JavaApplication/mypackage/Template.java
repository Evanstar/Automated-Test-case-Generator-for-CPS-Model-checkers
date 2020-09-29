package mypackage;

import java.io.*;
import java.util.Random;
public class Template extends RandomGenerator {
static public String numberoflocations,flowChoice,numberofdimensions,numberoftransitions,flowType,typeOfGrd,typeOfAssignment,typeOfInvariant,file_no;
static	public int locations,dimensions,transitions,fileNumber;
	PrintWriter pw=new PrintWriter(System.out, true);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Random r = new Random();
	public void getNumberOfLocations() 
	{
	//try
	//{
	pw.println("enter the number of location:");
	//numberoflocations=br.readLine();
	//locations=Integer.parseInt(numberoflocations);
	locations = GUIClass.loc_no;
	/*}
	catch(IOException ex)
	{
	pw.println("I/O Error:"+ex);
	}
	*/
	}
	public void getNumberOfDimensions()
	{
	//try
	//{
	//pw.println("enter the number of dimensions:");
	//numberofdimensions=br.readLine();
	//dimensions=Integer.parseInt(numberofdimensions);
		dimensions = GUIClass.dm_no;
	//}
	//catch(IOException ex)
	//{
	//pw.println("I/O Error:"+ex);
	//}
	}
	public void getNumberOfFiles()
	{
	//try
	//{
	//pw.println("enter the number of random files:");
	//file_no = br.readLine();
	//fileNumber = Integer.parseInt(file_no);
		fileNumber = GUIClass.xm_no;
	/*}
	catch(IOException ex)
	{
	pw.println("I/O Error:"+ex);
	}*/
	}
	public void getNumberOfTransitions()
	{
	//try
	//{
	//pw.println("enter the number of transitions:");
	//numberoftransitions = br.readLine();
	//transitions = Integer.parseInt(numberoftransitions);
		transitions = GUIClass.tr_no;
	//System.out.println(transitions);
	/*}
	catch(IOException ex)
	{
	pw.println("I/O Error:"+ex);
	}*/
	}
	public void getFlowType()
	{
	/*try
	{
	pw.println("enter the type of flow: 1 - Linear Dynamics 2 - Constant Dynamics");
	flowType=br.readLine();
	flowChoice = Integer.parseInt(flowType);*/
		flowChoice = GUIClass.flo;
	/*}
	catch(IOException ex)
	{
	pw.println("I/O Error:"+ex);
	}*/
	getTypeOfInvariant();
	getTypeOfAssignment();
	getTypeOfGrd();
	getNumberOfTransitions();
	
	}
	public void getTypeOfInvariant()
	{
		/*try 
		{
		pw.println("enter the type of invariant:");
		typeOfInvariant=br.readLine();
		}*/
		typeOfInvariant = GUIClass.inv;
		/*catch(IOException ex)
		{
		pw.println("I/O Error:"+ex);
		}*/
		//getTypeOfGuard();
	}
	public void getTypeOfAssignment()
	{
		/*try 
		{
		pw.println("enter the type of assignment:");
		typeOfAssignment=br.readLine();
		}*/
		typeOfAssignment = GUIClass.asgn;
		/*catch(IOException ex)
		{
		pw.println("I/O Error:"+ex);
		}*/
	}
	public void getTypeOfGrd()
	{
		/*try 
		{
		pw.println("enter the type of guard:");
		typeOfGrd=br.readLine();
		}*/
			typeOfGrd = GUIClass.grd;
		/*catch(IOException ex)
		{
		pw.println("I/O Error:"+ex);
		}*/
	}
	
}
