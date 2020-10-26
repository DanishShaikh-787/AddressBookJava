package AddressBook.java;

import javax.swing.JOptionPane;

public class PersonInfo {

	String name;
    String address;
    String phNum;
 
   public PersonInfo(String n, String add, String phNum){
    name = n;
    address = add;
    phNum = phNum;
  }

public void print(){
	   
    JOptionPane.showMessageDialog(null, "Name:" +name+"Address:" +address+ "Phone No.:"+phNum);
  }
}
