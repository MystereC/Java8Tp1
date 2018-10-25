package exo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Exercice1 {

	public static <T> void deletePeerIndexFromList(List<T> list){
		
		Iterator<T> li = list.iterator();
		int i=0;

		 while(li.hasNext()) {
			 li.next();
	    	  if(i%2==0) {	   
	    		  li.remove();
	    		  }
	    	  i++;
	    	  
	    	  }
	}
	
	public static <T> void removeEmptyCollection(Collection<? extends Collection<T>> collection) {
		
		Iterator<? extends Collection<T>> li = collection.iterator();
		
		while(li.hasNext()) {	
			if(li.next().isEmpty()) {
			  li.remove();
			}
			
		}
		
	}
	
	public static <T> void addAllCOllection(Collection<?extends Collection<T>> cSource,Collection<T> cDestination ) {
		
		
	}
	
	
	public static  <T> Map<T,T> collectionToMap (Collection<T> col,Map<T,T> map){
		Iterator<T> li = col.iterator();
		
		while(li.hasNext()) { 
			T t=li.next();
			 map.put(t, t); 
		}
		return map;
		
		
	}
	
	static <T extends Comparable<T>> void deleteFromCollection(Collection<? extends T> collection, T max) {
		
		Iterator<? extends T> li = collection.iterator();
		while(li.hasNext()) { 
			if(li.next().compareTo(max)==1) { 
				li.remove();
			}
			
		}
		
		
		
		
	}
		

	public static void main (String[] args ) {
		
		
		List<Integer> l= new ArrayList<Integer>();
		Map<Integer,Integer> map1 = new HashMap<Integer, Integer>();
 		
		for(int i=0; i<=10;i++) {
		l.add(i);
		}
		deletePeerIndexFromList(l);
		
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
			}
		collectionToMap(l,map1);
		 
		System.out.println("Parcours de l'objet HashMap : ");
		
		Set<Entry<Integer, Integer>> setHm = map1.entrySet();
	      Iterator<Entry<Integer, Integer>> it = setHm.iterator();
	      while(it.hasNext()){
	          Entry<Integer, Integer> e = it.next();
	          System.out.println(e.getKey() + " : " + e.getValue());
	       }
	        
	      
	      
		
	}
}



