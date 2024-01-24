import javax.swing.*;
public class Shop100Bath {

	public static void main(String[] args) {
		Product sold = new Product();
		
		int buttonConfirm = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?");
		if(buttonConfirm==0) {
			sold = new PattanakarnBranch();
		}
		
		int numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product"));
		
		sold.setUnit(numberofProduct);
		
		JOptionPane.showMessageDialog(null, sold.toString());

	}

}
