package AddressBook.java;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AddressBook {
	ArrayList<PersonInfo> persons;
	      public AddressBook ( ) {
	            persons = new ArrayList<PersonInfo>();
	} 
		        public void addPerson( ) {
	 
	String name = JOptionPane.showInputDialog("Enter name");
	String add = JOptionPane.showInputDialog("Enter address");
	String phNum = JOptionPane.showInputDialog("Enter phone no");
	 
	          PersonInfo p = new PersonInfo(name, add, phNum);
	      persons.add(p);
	       }
	 
	            public void search(String name){
	            for(int i = 0; i < persons.size(); i++){
	               PersonInfo p = (PersonInfo)persons.get(i);; 
	               if(name.equals(p.name)){	
	                p.print();    
	               }
	            }            
	            }
	              public void remove(String name){
	            	  for(int i = 0; i < persons.size(); i++){
	            		  PersonInfo p = (PersonInfo)persons.get(i); 
	            		  if(name.equals(p.name)){
	            			  persons.remove(i); }
	            	  }
	              }
				public void display() {
					int i = 0;
					System.out.println(persons.get(i));
//					System.out.println("Display" +);
					
				}
	              
}
