package pck;
interface AbstractClass
{
  void shows();
}
public class Hospital implements AbstractClass
{	StringBuffer name=new StringBuffer("Odyssey");
	final int branches=2;
	static String opentimings="10 to 10";
	static int areacode;
	String address= new String("14, near Palanganatham Bus stand, Madurai");
	static
	{
	  areacode=625003;
	}
	public void shows()
	{
	  System.out.println("\nHospital Details\n Hospital was founded in December 1978 by Dr.Maadhavan. He worked as chief doctor in Government hospital.");
	  System.out.println("\nHe quit his job there and opened a small clinic that grew into a big multi-speciality hospital it is today.");
	  System.out.println("\nThe number of braches is "+branches);
	  System.out.println("\nDue to his popularity, he opened another hospital-New Order Hospital");
	  System.out.println("\nThis hospital has comparitively less rates than other multi-speciality hospitals with the same resources.");
	  System.out.println("\nThe hospital is located at "+address);
	  System.out.println("  Area code is "+areacode);
	  System.out.println("\nThe hospital is famous for its pediatric ward and orthopoedic ward.");
	  System.out.println("\nThe hospital is open from "+opentimings);
	}
}
