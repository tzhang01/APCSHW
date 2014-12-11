import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame implements ActionListener{
	private Container pane;
	private JButton b, clear;
	private JTextField f, c;
	private JLabel farenheit, celsius;
	private JCheckBox CtoF, FtoC;	
	
	public TempConverter(){
		this.setTitle("Temperature Converter!");
		this.setSize(600,300);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());

		b = new JButton("Convert!");
		clear = new JButton("Reset");
		farenheit = new JLabel("Farenheit:", null,JLabel.CENTER);
		f = new JTextField(12);
		celsius = new JLabel("Celsius:", null, JLabel.CENTER);
		c = new JTextField(12);
		FtoC = new JCheckBox("Farenheit to Celcius");
		CtoF = new JCheckBox("Celsius to Farenheit");

		b.setActionCommand("Convert");
		b.addActionListener(this);
		clear.setActionCommand("clear");
		clear.addActionListener(this);

		pane.add(farenheit);
		pane.add(f);
		pane.add(celsius);
		pane.add(c);
		pane.add(FtoC);
		pane.add(CtoF);
		pane.add(b);
		pane.add(clear);
	}
	public void actionPerformed(ActionEvent e){
		String action = e.getActionCommand();
		if(action.equals("Convert")){
			int number;				
			if(FtoC.isSelected()){
				number = Integer.valueOf(f.getText());					
				number = ((number -32) * (5/9));
				c.setText(String.valueOf(number));
			}
			if(CtoF.isSelected()){
				number = Integer.valueOf(c.getText());
				number = ((number * (9/5)) + 32);
				f.setText(String.valueOf(number));				
			}
			if(action.equals("clear")){
				c.setText("");
				f.setText("");
			}
		}
	}

	public static void main(String[]args){
		TempConverter t = new TempConverter();
		t.setVisible(true);
	}
}
	
