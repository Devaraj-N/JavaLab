import java.io.*;
import java.lang.*;
import java.util.*;
import pck.Hospital;
import pck.Ortho;
/*interface display
{
 public abstract void show();
}*/
class Doctor //implements display
{ 
	String name;
	String field;
	public int age;
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
	   //System.out.println("\nHospital Name: "+super.name);
	   System.out.println("\nDoctor name: "+this.name);
	   System.out.println("\nField of study: "+this.field);
	}
	public void show(int age)
	{
	   System.out.println("\nDoctor Age: "+this.age);
	}
}

class InvalidPasswordException extends Exception
{
  InvalidPasswordException(String s)
    {
	super(s);
     }
}
class Treatments extends Thread
{
  public void run()
  {
    System.out.println("\nThere are three classifications of medical treatment: \n* Curative- to cure a patient of an illness \n* Palliative- to relieve symptoms from an illness \n* Preventative- to avoid the onset of an illness.\n The doctors also recommend an etymology treatment, like antibiotics to treat strep throat, for example. To relieve pain in this case, the treatment can be accompanied by a symptomatic treatment like an antalgic.");
   }
}
class Other_Treatments implements Runnable
{
  public void run()
    {
      System.out.println("\nTreatments prescribed by doctors can be classified using one or several of the following methods: Medical, surgical, or medico techniques. A medical treatment generally prescribes diet and lifestyle measures, like changing certain habits, as well as medication intake, whether injectable or not. Physical therapy, speech therapy, psychiatry, and physiotherapy are equally part of medical treatments. For certain illnesses, it is necessary to resort to surgical treatment. Certain examinations are situated between traditional treatments and surgery, such as, radiology, endoscopy, and phototherapy.");
     System.out.println("\nTo heal, relieve, or prevent an illness, health professionals can resort to other specific methods. In any case, observation is an integral part of treatment, like regularly examining blood pressure, or asking for an X-ray. In non-conventional medicine, certain therapies and techniques, like acupuncture, balneotherapy, taking supplements, detoxification, or homeopathy, can also be prescribed.\n");
   }
}
public class HospitalRecords
{
  static void validate(String s) throws InvalidPasswordException
   {
	if(s.equals("Password"))
	System.out.println("\nPassword Accepted"); 
	else
                   throw new InvalidPasswordException("\nPassword Incorrect. Enter at own risk\n");
                   //System.exit(0);	   

    }
    public static void main(String args[]) throws IOException
    {
	int dage, exp;
	String name, field, pass;
	DataInputStream dr= new DataInputStream(System.in);
	try
	{
	System.out.println("\nEnter Password: ");
	pass=dr.readLine();
	validate(pass);
	}catch(Exception e)
	{
	  System.out.println("\nException occured: "+e);
	  System.exit(0);
	}
	System.out.println("\n\t"+Doctor.hname+"\t\n");
	 System.out.println("\nHospital Records Details.\nEnter 1 to Enter doctor records \nEnter 2 to know about the Hospital \nEnter 3 to change hospital name \nEnter 4 to know about hospital rates \nEnter 5 to display user information \nEnter 6 to know about Treatment Methods \n Enter 7 to recieve Orthopeadic Treatment\nEnter 8 to exit");
	int ch=Integer.parseInt(dr.readLine());
	switch(ch)
	{
	case 1:	  
	  System.out.println("\nEnter Doctor Name: ");
	  name=dr.readLine();
	  try 
	  {
	         
	         System.out.println(name.charAt(0));
	  }
	 catch(StringIndexOutOfBoundsException e) 
	 {
	    System.out.println("\nName cannot be empty");
	  }
	  System.out.println("\nEnter Doctor Field: ");
	  field=dr.readLine();
	  System.out.println("\nEnter Doctor Age: ");
	  dage=Integer.parseInt(dr.readLine());
	  try 
	   {
	    System.out.println("\nEnter years of experience: ");
	    exp=Integer.parseInt(dr.readLine());
	   }
	   catch(NumberFormatException e)
	   {
	       System.out.println("\nExperience must be a number");
	   }
	  Doctor doc=new Doctor(name, field, dage);
	  doc.set(name, field, dage);
	  doc.show(name, field);
	  doc.show(dage);
	  //System.out.println("\nExperience: "+exp);
	break;
	
	case 2:
	  Hospital hos=new Hospital();
	  hos.shows();
	break;
	
	case 3:
	  Doctor.diff_hospital();
	break;
	
	case 4:
	   Doctor.TreatmentRate rate= new Doctor.TreatmentRate();
	   rate.printname();
  	break;

	case 5:
	   System.out.println("\nName and Age are: ");
	for(int i=0; i<args.length; i++)
	{
	   System.out.println("\n"+args[i]);
	}
	break;
	
	case 6:
	 Treatments tr=new Treatments();
	  Other_Treatments otr= new Other_Treatments();
	  Thread t1=new Thread(otr);
	   tr.setPriority(Thread.MAX_PRIORITY);
	   t1.setPriority(Thread.MIN_PRIORITY);
  	   tr.start();
	   t1.start();
   	   break;
	
	case 7:
	 System.out.println("\nEnter number of patients: ");
	 int n=Integer.parseInt(dr.readLine());
	 ArrayList<Ortho> orl=new ArrayList<Ortho>();
	 for(int i=0; i<n; i++)
	  {
	   System.out.println("\nEnter Patient name: ");
	   String pname=dr.readLine();
	   System.out.println("\nEnter Patient age: ");
	   int age=Integer.parseInt(dr.readLine());
	   System.out.println("\nEnter Patient's ailment: ");
	   String ailment=dr.readLine();
	   System.out.println("\nEnter Patient's cause for pain: ");
	   String cause=dr.readLine();
	   Ortho ot=new Ortho(pname, age, ailment, cause);
	   orl.add(ot);
	   ot.show();
	  }
	  Iterator itr=orl.iterator();
	  while(itr.hasNext())
	  {
	    Ortho or=(Ortho)itr.next();
	    System.out.println("\nPatient Name: "+or.pname);
	    System.out.println("\nPatient Age: "+or.age);
	    System.out.println("\nPatient Ailment: "+or.ailment);
	    System.out.println("\nPatient Cause for Pain: "+or.cause);
	  }
	  break;
	  
	case 8:
	  System.exit(0);
	}
        
    }
}