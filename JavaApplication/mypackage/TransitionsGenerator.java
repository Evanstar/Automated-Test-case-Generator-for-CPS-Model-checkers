package mypackage;
 import java.util.Random;
 import java.util.ArrayList;
public class TransitionsGenerator extends Template {
ArrayList<Integer> e=new ArrayList<Integer>();
ArrayList<String> l=new ArrayList<String>();
Random r=new Random();
int randomnumber;
public void transitions()
{
	for(int i=0;i<=transitions;i++)
	{
		randomnumber=r.nextInt(locations);
		e.add(randomnumber);
		if(i<transitions)
		l.add("e"+i);
	}
	//System.out.println(e);
	//System.out.println(l);
}

}
