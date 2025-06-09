package javapj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class graphstEx {

    public static void main(String[] args) {
        Map<String, List<String>> m = new HashMap<>();
        
        m.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        m.put("Reptile House", Arrays.asList("Snake pit"));
        m.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        m.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        m.put("Snake pit", new ArrayList<>());
        m.put("Parrot Pavilion", new ArrayList<>());
        m.put("Lion Den", new ArrayList<>());
        m.put("Elephant Enclosure", new ArrayList<>());

        System.out.println("Explore the bfs:");
        bfs(m,"Entrance");
    }
    public static void bfs(Map<String,List<String>>m,String start) {
    	Queue<String>q=new LinkedList<>();
    	Set<String> s=new HashSet<>();
    	q.add(start);
    	s.add(start);
    	while(!q.isEmpty()) {
    		String cstate=q.poll();
    		System.out.println("visited "+cstate);
    			List<String> neighbors=m.get(cstate);
    		if(neighbors!=null) {
    			for(String n:neighbors) {
    				if(!s.contains(n)) {
    					q.add(n);
    					s.add(n);
    				}
    			}
    		}
    	}
    }
}
