class Box
{
double width,height,depth;
double vol()
{
return width*height*depth;
}
void setDim(double w, double h, double d)
{
width=w;
height=h;
depth=d;
}
}
class BoxDemo3
{
public static void main(String args[])
{
Box mybox= new Box();
Box mybox1 = new Box();
double vol;
mybox.setDim(10,20,15);
mybox1.setDim(3,6,9);
vol=mybox.vol();
System.out.println(vol);
vol=mybox1.vol();
System.out.println(vol);

}
}
