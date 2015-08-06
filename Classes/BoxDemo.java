class Box
{
double width, height,depth;
}
class BoxDemo{
public static void main(String args[])
{
Box mybox=new Box();
double vol;
mybox.width=10;
mybox.height=15;
mybox.depth=20;
vol= mybox.width*mybox.height*mybox.depth;
System.out.println("Volume is" + vol);
}
}
