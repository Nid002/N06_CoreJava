package org.tnsif.interfacedemo;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we cannot create object/instantiate an interface
		//Sony s=new Sony();        (Sony is interface)
		
		SonyTV s=new SonyTV();
		s.display();
		s.show();
		Sony.accept();
		
		
		ISRO i=new ISRO();
		i.status();
		
		Human h=new Human();
		h.showDrink();
	}

}
