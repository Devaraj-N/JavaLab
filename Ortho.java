
package pck;
public class Ortho
{
	 public String pname, ailment, cause;
	 public int age;
	public Ortho(String pname, int age, String ailment, String cause)
	{
	  this.pname=pname;
	  this.age=age;
	  this.ailment=ailment;
	  this.cause=cause;
	}
	public void show()
	{
	  System.out.println("\nPatient name: "+this.pname);
	  System.out.println("\nPatient age: "+this.age);
	  System.out.println("\nAilment: "+this.ailment);
	  System.out.println("\nCause for pain: "+this.cause);
	}
}

	