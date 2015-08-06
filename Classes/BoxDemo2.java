class Box
{
double width, height,depth;
}
class BoxDemo2{
public static void main(String args[])
{
Box mybox1=new Box();
Box mybox2=new Box();
double vol;
mybox1.width=10;
mybox1.height=15;
mybox1.depth=20;
mybox2.width=5;
mybox2.height=7.5;
mybox2.depth=10;
vol= mybox1.width*mybox1.height*mybox1.depth;
System.out.println("Volume is" + vol);
vol=mybox2.width*mybox2.height*mybox2.depth;
System.out.println("Volume is"+vol);
}
}
