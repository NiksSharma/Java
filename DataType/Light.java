class Light 
{
public static void main(String args[])
	{
	int lightspeed=186000;
	long days=1000,seconds,distance;
	seconds=days*24*60*60;
	distance= lightspeed*seconds;
	System.out.println("In"+ days);
	System.out.println("days light will travel about");
	System.out.println(distance+"miles");
	}
}