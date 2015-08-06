class Menu
{
public static void main(String args[])
throws java.io.IOException
{
char choice;
do{
System.out.println("Help on:");
System.out.println("1. if");
System.out.println("2. Switch");
System.out.println("3. while");
System.out.println("4. do-while");
System.out.println("5. for \n");
System.out.println("Choose one");
choice =(char) System.in.read();
}
while (choice <'1'||choice>'5');
System.out.println("\n\n");
switch(choice)
{
case '1':
System.out.println("The if :\n:");
System.out.println("if(condition) statement;\n else statement,");
break;
case '2':
System.out.println("The Switch:\n Switch(expression) {case constant: Statement Sewquence break; //.....}");
break;
case'3':
System.out.println("The while:\n while(condition) statement:");
break;
case '4':
System.out.println("the do-while:\n do(statement) while (condition);");
break;
case '5':
System.out.println("the for: \n for (init; condition; iteration) Statement");
break;
}
}
} 