//program to demonstrate on access specifier
//driver class
package in.kkwagh.library;
import in.bkcmet.library.Library;
//import in.bkcmet.library.*;
public class Faculty {

	public static void main(String[] args) {
		Library l=new Library();
		l.libraryName="MET Library";
		l.displayPublic();
		
	/*userId and displayPrivate() method is private
	 * so we can't access into another package or class 
	 *  only we can access inside the same class
	 */
		//l.userId=202468L;
		//l.displayPrivate();
		
	/* booksName & displayDefault() method is default
	 * so we can't access into package 
	 * only we can access it within the same package */
		//l.booksName;
		//l.displayDefault();
		
	}

}
