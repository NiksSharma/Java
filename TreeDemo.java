/*
JTree
A
    B
	c
	d
    e
	f
Nodes
DefaultMutableTreeNode
*/
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class TreeDemo extends JFrame
{
	JTree jt;
	DefaultMutableTreeNode aNode,bNode,cNode,dNode,eNode,fNode;
	TreeDemo()
	{
	aNode=new DefaultMutableTreeNode("A");
	bNode=new DefaultMutableTreeNode("B");
	cNode=new DefaultMutableTreeNode("C");
	dNode=new DefaultMutableTreeNode("D");
	eNode=new DefaultMutableTreeNode("E");
	fNode=new DefaultMutableTreeNode("F");
	eNode.add(fNode);
	bNode.add(cNode);
	bNode.add(dNode);
	aNode.add(bNode);
	aNode.add(eNode);
	jt=new JTree(aNode);
	add(jt);
	setBounds(10,10,300,300);
	setVisible(true);
	}
public static void main(String args[])
{
	TreeDemo td=new TreeDemo();
}
}


	

