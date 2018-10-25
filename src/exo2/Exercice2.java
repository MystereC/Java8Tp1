package exo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Exercice2 <K, V> extends HashMap{

	
private  Map<K,V> mapSource;
	
	public  Exercice2(Map<K,V>  mapSource) {
		super();
		this. mapSource =  mapSource;
	}

	
   public Map<V,Set<K>> reverseMap() {
		
	   Map<V,Set<K>> mapDestination = new HashMap<V,Set<K>>();
	    Set<Entry<K, V>> setLhm = this.mapSource.entrySet();
	    Iterator<Entry<K, V>> it = setLhm.iterator();
	    
	      
	      while(it.hasNext()){
	    	      Entry<K, V> e = it.next();
	    	    		  if(mapDestination.containsKey(e.getValue())) {  
	    	    			  Set<K> listOfSourceKey = mapDestination.get(e.getValue());
	    	    			  listOfSourceKey.add(e.getKey());
	    	    			  mapDestination.replace(e.getValue(), listOfSourceKey); }
	    	                else {
	    	                	Set<K> listOfSourceKey = new HashSet<K>();              
	    	                	listOfSourceKey.add(e.getKey());
	    		               mapDestination.put(e.getValue(),listOfSourceKey );
	    	               }
	    	  	  }
		return  mapDestination;
	}



	
	

}


/*class Main {
	
	public static void main (String[] args ) {
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(10, "A");
		map.put(22, "Z");
   
    	Map<String,Set<Integer>> map2 = new HashMap<String, Set<Integer>>();		
    	map2=reverseMap(map);
		System.out.println(map2);		
		
	}
	
	
	
}*/