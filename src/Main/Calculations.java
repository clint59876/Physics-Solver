package Main;

import javax.swing.text.BadLocationException;

public class Calculations {
	float time;
	float xinit;
	float yinit;
	float hypot;
	float trajectory;
	float yvel;
	float xvel;
	float yacc;
	float xacc;
	float finalx;
	float finaly;
	boolean[] selected = new boolean[] { false, false, false, false, false, false, false, false, false, false, false };
	String calculations = "";

	Calculations(float[] input, boolean[] select) {
		for (int i = 0; i <= select.length - 1; i++) {
			selected[i] = select[i];
		}
		xacc = input[0];
		yacc = input[1];
		time = input[2];
		trajectory = input[3];
		hypot = input[4];
		xvel = input[5];
		yvel = input[6];
		xinit = input[7];
		yinit = input[8];
		finalx = input[9];
		finaly = input[10];
	}

	String calculate() {
		if ((selected[5] == false) && (selected[0] && selected[2])) {
			xvel = xinit + xacc * time;
			calculations = calculations + "\n X-Velocity: " + xvel + "\n";
			selected[5] = true;
		}
		if ((selected[6] == false) && (selected[1] && selected[2])) {
			yvel = yinit + yacc * time;
			calculations = calculations + "\n Y-Velocity: " + yvel + "\n";
			selected[6] = true;
		}
		return calculations;
	}

}
