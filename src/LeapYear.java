import java.util.*;

import javax.swing.JOptionPane;
public class LeapYear {
	public static boolean isLeapYear(int year)
	{
		return (year%4==0)&&((!(year%100==0))||(year%400==0));
	}

	public static void main(String[] args) {
		int year = 0;
		String strYear;
		do {
			strYear = JOptionPane.showInputDialog(null,"Skriv in ett årtal","Indata",JOptionPane.QUESTION_MESSAGE);
			if (strYear != null) {
				try {
					year = Integer.parseInt(strYear);
					if (isLeapYear(year)) {
						JOptionPane.showMessageDialog(null, "De va ett skottår", "Meddelande", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "De va inte ett skottår", "Meddelande", JOptionPane.INFORMATION_MESSAGE);
					}

				} catch (NumberFormatException e){
					JOptionPane.showMessageDialog(null, "Dåligt år du skrev", "Du suger", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		} while (strYear != null);
	}

}
