import java.io.*;
public class Hospital
{
static String name="General Hospital";
public void availability(boolean avail)
{
if(avail==true)
{
System.out.println("\nRoom available to use");
}
else
{
System.out.println("\nRoom unavailable at the moment");
}
}
public void doctors_present(String doc)
{
System.out.println("\nDoctors working in the hospital: "+doc);
}
public static void main(String args[]) throws IOException
{
boolean[] roomavailable={true, true, false, true, false, true, true};
String[] doctor={"Dr.Raj", "Dr.Kannan", "Dr.John", "Dr.Ahamed"};
DataInputStream dr= new DataInputStream(System.in);
Hospital hosp= new Hospital();
System.out.println("\n\t"+hosp.name+"\t\n");
System.out.println("\nHospital Records Details.\n Enter 1 to view to view doctor records\n Enter 2 to check room availability\n ");
int ch=Integer.parseInt(dr.readLine());
switch(ch)
{
case 1:
System.out.println("\nDoctor Records");
for(int i=0; i<doctor.length; i++)
{
hosp.doctors_present(doctor[i]);
}
break;
case 2:
System.out.println("\nRooms Available: ");
for( int i=0; i<roomavailable.length; i++)
{
hosp.availability(roomavailable[i]);
}
break;
}
}
}