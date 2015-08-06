import java.awt.*;
class MenuDemo extends Frame
{
	MenuBar mainBar;
	Menu fileMenu,editMenu,searchMenu;
	MenuItem newItem,openItem,closeItem,cutItem,copyItem,pasteItem;
	MenuItem bynameItem,byageItem;
	//MenuItem sepItem,sepItem1;

	MenuDemo()
	{
		mainBar=new MenuBar();
		fileMenu=new Menu("File");
		newItem=new MenuItem("New");
		openItem=new MenuItem("Open");
		closeItem=new MenuItem("Close");
		//sepItem=new MenuItem("-");
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		//fileMenu.add(sepItem);
		fileMenu.add(closeItem);
		
		editMenu=new Menu("Edit ");
		cutItem=new MenuItem("Cut");
		copyItem=new MenuItem("copy");
		pasteItem=new MenuItem("Paste");
		//sepItem1=new MenuItem("-");
		editMenu.add(cutItem);
		editMenu.add(copyItem);
		editMenu.add(pasteItem);
		//editMenu.add(sepItem1);
		//editMenu.add(sepItem);
		editMenu.addSeparator();
		searchMenu=new Menu("Search ");
		bynameItem=new MenuItem("By Name");
		byageItem=new MenuItem("By Age");
		searchMenu.add(bynameItem);
		searchMenu.add(byageItem);
		editMenu.add(searchMenu);
		


		editMenu.insertSeparator(1);
		mainBar.add(fileMenu);
		mainBar.add(editMenu);
		setMenuBar(mainBar);
		setBounds(10,10,300,300);
		setVisible(true);
	}
public static void main(String args[])
{
	MenuDemo md=new MenuDemo();
}

}
