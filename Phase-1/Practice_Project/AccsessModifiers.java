package com.Building_Blocks;

class privatemodifier {
	private  void display() {
		System.out.println("Private Accsess Modifiers");
	}
}

class publicmodifier {
	public  void display() {
		System.out.println("Public Accsess Modifiers");
	}
}
class DefaultAccsess{
	void display() {
		System.out.println("Default Accsess Modifiers");
	}
}
public class AccsessModifiers {
	public static void main(String[] args) {
		DefaultAccsess obj = new DefaultAccsess(); 		  
	    obj.display();
	    publicmodifier obj1=new publicmodifier();
	    obj.display();
	    privatemodifier obj2=new privatemodifier();	    
	   // p.display(); //( Private Method cant be asscess in another class.
	}
	

}

	