/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarea4math.random;

import javax.swing.JOptionPane;

/**
 *
 * @author ross1
 */
public class Testarea4mathRandom {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		double correct = 0;
		double grade;
		for (int i = 0; i < 5; i++) {
			int questioninput,
					randomNumber1 = (int) (9 * Math.random()) + 1,
					randomNumber2 = (int) (9 * Math.random()) + 1;
			int randomnumberanswer = randomNumber1 + randomNumber2;
			questioninput = Integer.parseInt(JOptionPane.showInputDialog(randomNumber1 + "+" + randomNumber2));
			if (questioninput == randomnumberanswer) {
				JOptionPane.showMessageDialog(null, "correct");
				correct++;
			} else {
				JOptionPane.showMessageDialog(null, "wrong answer the correct one was " + randomnumberanswer);
			}
		}
		grade = (correct * 100) / 5;
		if (grade < 40) {
			JOptionPane.showMessageDialog(null, "sorry you have failed.\n your grade was " + grade);
		} else if (grade >= 40 && grade <= 50) {
			JOptionPane.showMessageDialog(null, " you have passed the test.\n your grade was " + grade);
		} else if (grade >= 51 && grade <= 60) {
			JOptionPane.showMessageDialog(null, " you got a  merit on the test.\n your grade was " + grade);
		} else if (grade > 61) {
			JOptionPane.showMessageDialog(null, "Welldone you got a distinction .\n your grade was " + grade);
		}
		JOptionPane.showMessageDialog(null, "Thanks for taking my quiz");
	}
}
