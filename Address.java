import java.io.*;
import java.net.*;
class Address
{
public static void main(String args[])throws IOException
  {	
DataInputStream ds= new DataInputStream(System.in);
System.out.println("Enter website name :-");
String site =ds.readLine();
try
{
InetAddress ip = InetAddress.getByName(site);
System.out.println("The tp address is :"+ip);
}
catch(UnknownHostException ue)
{
System.out.println("Website not found ");

} 
}

	
}