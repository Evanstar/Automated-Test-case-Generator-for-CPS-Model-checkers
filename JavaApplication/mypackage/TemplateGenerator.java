package mypackage;

public class TemplateGenerator{
	
	public static void main(String args[])
	{
	//TransitionsGenerator t=new TransitionsGenerator();
	LocationsGenerator l=new LocationsGenerator();
	l.getNumberOfLocations();
	l.location();
	DimensionsGenerator d=new DimensionsGenerator();
	d.getNumberOfDimensions();
	d.dimensions();
	d.getNumberOfFiles();
	FlowGenerator f = new FlowGenerator();
	f.getFlowType();
	//t.transitions();
	for(int i = 0; i<Template.fileNumber ; i++) {
	
	
	//t.getNumberOfTransitions();
	//t.transitions();
	
	//GuardGenerator g = new GuardGenerator();
	//InvariantGenerator in=new InvariantGenerator();
	//in.checkInvariant();
	//AssignmentGenerator assignment=new AssignmentGenerator();
	//assignment.checkAssignment();
	
	XMLFileGenerator xml=new XMLFileGenerator();
	xml.display();
	}
	}

}
