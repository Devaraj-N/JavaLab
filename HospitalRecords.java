import java.io.*;
abstract class AbstractClass
{
	abstract void shows();
}
 class Hospital extends AbstractClass
{	String name="Odyseey";
	final int branches=2;
	static String opentimings="10 to 10";
	void shows()
	{
	  System.out.println("\nHospital Details\n Hospital was founded in December 1978 by Dr.Maadhavan.\n He worked as chief doctor in Government hospital.");
	  System.out.println("\nHe quit his job there and opened a small clinic that grew into a big multi-speciality hospital it is today\n");
	  System.out.println("\nThe number of braches is "+branches);
	  System.out.println("\nDue to his popularity, he opened another hospital-New Order Hospital\n");
	  System.out.println("\nThis hospital has comparitively less rates than other multi-speciality hospitals with the same resources.\n");
	  System.out.println("\nThe hospital is famous for its pediatric ward and orthopoedic ward.\n");
	  System.out.println("\nThe hospital is open from "+opentimings);
	}
}
class Doctor extends Hospital
{
	String name, field;
	int age;
                 static String hname="General Hospital";
	public static class TreatmentRate
	   {
		public static void printname()
		{
		  System.out.println("\nName of the hospital: " +Doctor.hname);
		  System.out.println("\nTreatment Rate\n");
		  System.out.println("\nCheck Up \t 200\n");
		  System.out.println("\nScan \t400\n");
		  System.out.println("\nConsultation\t200\n");
		}
	    }
	Doctor()
	{
	}
	Doctor(String name, String field)
	{
	   this.name=name;
	   this.field=field;
	}
	Doctor(String name, String field, int age)
	{
	   this.name=name;
	   this.field=field;
	  this.age=age;
	}
	static void diff_hospital()
	{
	  hname="New Order Hospital";
	}
	public void set(String name, String field, int age)
	{
	   this.name=name;
	   this.field=field;
	   this.age=age;
	}
	public void show(String name, String field)
	{
	   System.out.println("\nHospital Name: "+super.name);
	   System.out.println("\nDoctor name: "+this.name);
	   System.out.println("\nField of study: "+this.field);
	}
	public void show(int age)
	{
	   System.out.println("\nDoctor Age: "+this.age);
	}
}
public class HospitalRecords
{
    public static void main(String args[]) throws IOException
    {
	int age;
	String name, field;
	System.out.println("\nName and Age are: ");
	for(int i=0; i<args.length; i++)
	{
	   System.out.println("\n"+args[i]);
	}
	DataInputStream dr= new DataInputStream(System.in);
	System.out.println("\n\t"+Doctor.hname+"\t\n");
	System.out.println("\nHospital Records Details.\n Enter 1 to Enter doctor records\n Enter 2 to know about the Hospital\n \nEnter 3 to change hospital name \nEnter 4 to know about hospital rates\n ");
	int ch=Integer.parseInt(dr.readLine());
	switch(ch)
	{

	case 1:	  
	  System.out.println("\nEnter Doctor Name: ");
	  name=dr.readLine();
	  System.out.println("\nEnter Doctor Field: ");
	  field=dr.readLine();
	  System.out.println("\nEnter Doctor Age: ");
	  age=Integer.parseInt(dr.readLine());
	  Doctor doc=new Doctor(name, field, age);
	  doc.set(name, field, age);
	  doc.show(name, field);
	  doc.show(age);
	break;
	
	case 2:
	  Doctor docs=new Doctor();
	  docs.shows();
	break;
	
	case 3:
	  Doctor.diff_hospital();
	break;
	
	case 4:
	   Doctor.TreatmentRate rate= new Doctor.TreatmentRate();
	   rate.printname();
  	break;
	}
    }
}