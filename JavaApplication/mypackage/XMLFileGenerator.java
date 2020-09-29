package mypackage;
	
	import java.io.*;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
	import javax.xml.parsers.DocumentBuilderFactory;
	import javax.xml.parsers.ParserConfigurationException;
	import javax.xml.transform.Transformer;
	import javax.xml.transform.TransformerException;
	import javax.xml.transform.TransformerFactory;
	import javax.xml.transform.dom.DOMSource;
	import javax.xml.transform.stream.StreamResult;
	import org.w3c.dom.Document;
	import org.w3c.dom.Element;
	public class XMLFileGenerator {
		
		Random r = new Random();
		int random_no;
		LocationsGenerator g;
		DimensionsGenerator d;
		//TransitionsGenerator t;
		String s;
		static int fno=1;
		XMLFileGenerator()
		{	//random_no = r.nextInt();
			//System.out.println("enter a path");
			//try{
				
			s = "file"+fno+".xml";
			System.out.println(s);
			
		//}
		//catch(IOException ex)
		//{
			//System.out.println("I/O Error:"+ex);
		//}
		}
		public void display()
		{
		TransitionsGenerator t = new TransitionsGenerator();
		GuardGenerator gd = new GuardGenerator();
		//Template t1 = new Template();
		FlowGenerator f = new FlowGenerator();
		AssignmentGenerator a = new AssignmentGenerator();
		InvariantGenerator in = new InvariantGenerator();
		CFGgenerator cfg = new CFGgenerator();
		f.checkFlow();
		gd.checkGuard();
		a.checkAssignment();
		in.checkInvariant();
		
		t.transitions();
		try
		{
			//BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
			Document doc = documentBuilder.newDocument();
			Element root = doc.createElement("sspaceex");
			doc.appendChild(root);
			root.setAttribute("math","SpaceEx");
			root.setAttribute("version","0.2");
			Element component = doc.createElement("component");
			root.appendChild(component);
			component.setAttribute("id","template");
     
			for(int i=0;i<DimensionsGenerator.dimensions;i++)
			{
				Element param=doc.createElement("param");
				component.appendChild(param);
				param.setAttribute("d1","1");
				param.setAttribute("d2","1");
				param.setAttribute("dynamics","any");
				param.setAttribute("local","false");
				param.setAttribute("name",DimensionsGenerator.x.get(i));
				param.setAttribute("type","real");
    	
			}
			for(int i=0;i<TransitionsGenerator.transitions;i++)
			{
				Element param=doc.createElement("param");
				component.appendChild(param);
				param.setAttribute("local","false");
				param.setAttribute("name",t.l.get(i));
				param.setAttribute("type","label");
    	
			}
			int count=0;
			for(int i=0;i<LocationsGenerator.locations;i++)
			{	 
				Element location=doc.createElement("location");
				component.appendChild(location);
				location.setAttribute("id",String.valueOf(i));
				location.setAttribute("name",LocationsGenerator.v.get(i));
			for(int j=i;j<=i;j++)
			{   
				Element flow=doc.createElement("flow");
				//for(int k=0;k<DimensionsGenerator.dimensions;k++) {
					//if( Template.flowChoice == 1) {
    			 flow.appendChild(doc.createTextNode(f.flow_ld.get(count++)));
				//else if(Template.flowChoice == 2){
    			 //flow.appendChild(doc.createTextNode(f.flow_ld.get(count++)));}
    		// }
				location.appendChild(flow);
    		}
    	 
			for(int k=i;k<=i;k++)
			{
				Element invariant=doc.createElement("invariant");
				invariant.appendChild(doc.createTextNode(in.invariant.get(i)));
				location.appendChild(invariant);
    		 
			}
			f.checkFlow();
			}
			count = 0;
			for(int i=0;i<TransitionsGenerator.transitions;i++)
			{
				Element transitions=doc.createElement("transition");
				component.appendChild(transitions);
				transitions.setAttribute("source",String.valueOf(t.e.get(i)));
				transitions.setAttribute("target",String.valueOf(t.e.get(i+1)));
				for(int j=i;j<=i;j++)
				{
					
					Element label=doc.createElement("label");
					label.appendChild(doc.createTextNode(t.l.get(i)));
					transitions.appendChild(label);
    	
				}
				for(int j=i;j<=i;j++)
				{
    		
					Element label=doc.createElement("guard");
					//for(int k = 0 ; k<DimensionsGenerator.dimensions; k++) {
						label.appendChild(doc.createTextNode(gd.guard.get(i)));
						transitions.appendChild(label);
					//}
					Element assignment=doc.createElement("assignment");
					assignment.appendChild(doc.createTextNode(a.assignment.get(i)));
					transitions.appendChild(assignment);
				}
				gd.checkGuard();
			}
     
     Element component1=doc.createElement("component");
     root.appendChild(component1);
     component1.setAttribute("id","template1");
     for(int i=0;i<DimensionsGenerator.dimensions;i++)
     {
    	Element param=doc.createElement("param");
        component1.appendChild(param);
        param.setAttribute("controlled","true");
    	param.setAttribute("d1","1");
    	param.setAttribute("d2","1");
    	param.setAttribute("dynamics","any");
    	param.setAttribute("local","false");
    	param.setAttribute("name",DimensionsGenerator.x.get(i));
    	param.setAttribute("type","real");
    	
     }
     for(int j=0;j<TransitionsGenerator.transitions;j++)
     {
    	Element param=doc.createElement("param");
        component1.appendChild(param);
    	param.setAttribute("local", "false");
    	param.setAttribute("name", t.l.get(j));
    	param.setAttribute("type", "label");
     }
     Element bind=doc.createElement("bind");
     component1.appendChild(bind);
     bind.setAttribute("component","template");
     bind.setAttribute("as","template1");
     for(int i=0;i<DimensionsGenerator.dimensions;i++)
     {
    	 Element map=doc.createElement("map");
    	 bind.appendChild(map);
    	 //map.setAttribute("key",DimensionsGenerator.x.get(i)+">"+d.x.get(i));
    	 map.setAttribute("key",DimensionsGenerator.x.get(i));
    	 map.setTextContent(DimensionsGenerator.x.get(i));
    	 
     }
     for(int i=0;i<TransitionsGenerator.transitions;i++)
     {
    	 
    	 Element map=doc.createElement("map");
    	 bind.appendChild(map);
    	 map.setAttribute("key",t.l.get(i));
    	 map.setTextContent(t.l.get(i));
    	 
     }
     
     
	 TransformerFactory transformerFactory = TransformerFactory.newInstance();

	 	Transformer transformer = transformerFactory.newTransformer();
	 	DOMSource domSource = new DOMSource(doc);
	 	StreamResult streamResult = new StreamResult(new File(s));
	 	transformer.transform(domSource, streamResult);
	 	//StreamResult consoleResult = new StreamResult(System.out);
	 	//transformer.transform(domSource, consoleResult);
	 	cfg.cfgFile();
	 	fno++;
		}
		catch(ParserConfigurationException pce)
		{
			pce.printStackTrace();
		
		}
		catch(TransformerException tfe)
		{
				tfe.printStackTrace();	
		}
			
		}
		
			
}

