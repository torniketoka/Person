package khachidze;

import java.nio.channels.Selector;
import java.security.acl.Permission;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  
	
	public static void main(String[] args) {
		
		Skill prog = Skill.PROGRAMMING;
		Skill sport = Skill.SPORTS;
		Skill mathe = Skill.MATH;
    Skill mathe1 = Skill.FRENCH;

    
    
    
	
    Map<Person,Skill> sample = new HashMap<Person,Skill>();
    

			
   
		Set<Skill> ski1 = new TreeSet<>();
  	ski1.add(mathe);
		Set<Skill> ski2 = new TreeSet<>();
		ski2.add(sport);
		Set<Skill> ski3 = new TreeSet<>();
		ski3.add(prog);

     Expert e = new Expert("ex", "Brous", 45, 180, 75, ski1, ski1);
     System.out.println(e);
     
     System.out.println(e.practise(mathe));
     System.out.println("");
     System.out.println(e);
     
     
     Person p = new Person("p", "PPP", 31, 175, 87, ski3);
     System.out.println("");
     System.out.println(p);
     System.out.println("");
     System.out.println(p.getBonus());
     
     
     Expert ex = new Expert("exppppppp", "Broussss", 22, 197, 81, ski3, ski3);
     System.out.println("");
     System.out.println(ex);
     System.out.println(ex.getBonus());
     ex.practise(prog);
     System.out.println("");
     System.out.println(ex);
     System.out.println(ex.getBonus());

     
     Expert exx = new Expert("expp", "Broussss", 37, 185, 79, ski1, ski1);
     System.out.println("");
     System.out.println(exx);
     System.out.println(exx.getBonus());
     exx.practise(mathe);
     System.out.println("");
     System.out.println(exx);
     System.out.println(exx.getBonus());
     
     
     System.out.println("");
     System.out.println(p.practise(mathe));
     System.out.println("");
     System.out.println(p);
     
     System.out.println("");
     System.out.println(p.practise(prog));
     System.out.println("");
     System.out.println(p);
     

   System.out.println("");
   System.out.println("");

   
   sample.put(p, prog);
   for(Person pp: sample.keySet()) {
    System.out.println("Person: " + pp.getFirstname() + " skill: " + sample.get(pp) );
   }
   
   
   
     
     ArrayList<Person> arr = new ArrayList<>();
     arr.add(exx);
     arr.add(ex);
     arr.add(e);
     arr.add(p);
    
   
     for(Person pe: arr) {
       System.out.println(pe.getFirstname());
     }
     
     arr.sort((Person a, Person b)-> a.getFirstname().compareTo(b.getFirstname()));

     
     System.out.println("");
     System.out.println("");

     for(Person pe: arr) {
       System.out.println(pe.getFirstname());
     }
            
	}

}
