import javax.swing.*;

import java.text.DecimalFormat;
import java.util.Random; //use library for Random class
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		int WithdrawMoney = Integer.parseInt(JOptionPane.showInputDialog(null, "Your balance : " + frm.format(balance) + "\nInput money to withdraw"));
		
		if(WithdrawMoney > balance) 
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(WithdrawMoney > 20000) 
		{
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (WithdrawMoney%100 < 99 && WithdrawMoney%100 > 1) 
		{
			int Money = WithdrawMoney%100;
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw " + Money + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "You withdraw " + WithdrawMoney + " baht." + "\n1000=" + 
		    WithdrawMoney/1000 + "\n500=" + (WithdrawMoney%1000)/500 + "\n100=" + (WithdrawMoney%500)/100);
		}
		
		

	}

}
