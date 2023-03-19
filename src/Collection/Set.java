package Collection;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  HashSet a = new HashSet();
	  
	  a.add(2);
	  a.add(10);
	  a.add(6);
	  a.add(20);
	  a.add(-32);
	  a.add(10);
	  
	  System.out.println(a.size());
	  
	 
	  
	 
	  
	  
	 ArrayList a2 = new ArrayList(a);
	 

	 Collections.sort(a2);
	 
	 System.out.println(a);
	 System.out.println(a2);

	}

}
