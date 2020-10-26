package AddressBook.java;

import javax.swing.JOptionPane;

public class TestClass{
	public static void main(String args[]) {
	AddressBook add = new AddressBook();
	int choice;
	while(true) {
		String name = JOptionPane.showInputDialog("Enter 1 to add\n Enter 2 to search\n Enter 3 to remove\n Enter 4 to Exit\n");// Enter 4 to display\n
		choice = Integer.parseInt(name);
		switch(choice) {
		case 1:
				add.addPerson();
				break;
		case 2:
				name = JOptionPane.showInputDialog("Enter Name");
				add.search(name);
				break;
		case 3:
				name = JOptionPane.showInputDialog("Enter Name");
				add.remove(name);
				break;
//		case 4:
//				add.display();
//				break;
		case 4:
				System.exit(0);
		}
	}
	}
}
