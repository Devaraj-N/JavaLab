import java.io.*;
import java.lang.*;
import pck.Hospital;
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
	int age, exp;
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
	System.out.println("\nHospital Records Details.\n Enter 1 to Enter doctor records\n Enter 2 to know about the Hospital \nEnter 3 to change hospital name \nEnter 4 to know about hospital rates \nEnter 5 to display user information\nEnter 6 to exit");
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
	  age=Integer.parseInt(dr.readLine());
	  try 
	   {
	    System.out.println("\nEnter years of experience: ");
	    exp=Integer.parseInt(dr.readLine());
	   }
	   catch(NumberFormatException e)
	   {
	       System.out.println("\nExperience must be a number");
	   }
	  Doctor doc=new Doctor(name, field, age);
	  doc.set(name, field, age);
	  doc.show(name, field);
	  doc.show(age);
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
	  System.exit(0);
	}
    }
}