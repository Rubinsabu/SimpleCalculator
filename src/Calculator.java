import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	
	boolean isClicked=false;
	String oldVal,newVal;
	char oper;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenBtn;JButton eightBtn;JButton nineBtn;
	JButton fourBtn;JButton fiveBtn;JButton sixBtn;
	JButton oneBtn;JButton twoBtn;JButton threeBtn;
	JButton dotBtn;JButton zeroBtn;JButton equalBtn;JButton clearBtn;
	JButton subBtn;JButton addBtn;JButton mulBtn;JButton divBtn;
	
	Calculator(){
		jf = new JFrame();
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
		displayLabel= new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenBtn = new JButton("7");
		sevenBtn.setBounds(30, 130, 80, 80);
		sevenBtn.addActionListener(this);
		sevenBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sevenBtn);
		
		eightBtn = new JButton("8");
		eightBtn.setBounds(135, 130, 80, 80);
		eightBtn.addActionListener(this);
		eightBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(eightBtn);
		
		nineBtn = new JButton("9");
		nineBtn.setBounds(240, 130, 80, 80);
		nineBtn.addActionListener(this);
		nineBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(nineBtn);
		
		fourBtn = new JButton("4");
		fourBtn.setBounds(30, 240, 80, 80);
		fourBtn.addActionListener(this);
		fourBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fourBtn);
		
		fiveBtn = new JButton("5");
		fiveBtn.setBounds(135, 240, 80, 80);
		fiveBtn.addActionListener(this);
		fiveBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(fiveBtn);
		
		sixBtn = new JButton("6");
		sixBtn.setBounds(240, 240, 80, 80);
		sixBtn.addActionListener(this);
		sixBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(sixBtn);
		
		oneBtn = new JButton("1");
		oneBtn.setBounds(30, 350, 80, 80);
		oneBtn.addActionListener(this);
		oneBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(oneBtn);
		
		twoBtn = new JButton("2");
		twoBtn.setBounds(135, 350, 80, 80);
		twoBtn.addActionListener(this);
		twoBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(twoBtn);
		
		threeBtn = new JButton("3");
		threeBtn.setBounds(240, 350, 80, 80);
		threeBtn.addActionListener(this);
		threeBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(threeBtn);
		
		dotBtn = new JButton(".");
		dotBtn.setBounds(30, 460, 80, 80);
		dotBtn.addActionListener(this);
		dotBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(dotBtn);
		
		zeroBtn = new JButton("0");
		zeroBtn.setBounds(135, 460, 80, 80);
		zeroBtn.addActionListener(this);
		zeroBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(zeroBtn);
		
		equalBtn = new JButton("=");
		equalBtn.setBounds(240, 460, 80, 80);
		equalBtn.addActionListener(this);
		equalBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(equalBtn);
		
		subBtn = new JButton("-");
		subBtn.setBounds(360, 130, 80, 80);
		subBtn.addActionListener(this);
		subBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(subBtn);
		
		addBtn = new JButton("+");
		addBtn.setBounds(360, 240, 80, 80);
		addBtn.addActionListener(this);
		addBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(addBtn);
		
		mulBtn = new JButton("x");
		mulBtn.setBounds(360, 350, 80, 80);
		mulBtn.addActionListener(this);
		mulBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(mulBtn);
		
		divBtn = new JButton("/");
		divBtn.setBounds(360, 460, 80, 80);
		divBtn.addActionListener(this);
		divBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(divBtn);
		
		clearBtn = new JButton("Clear");
		clearBtn.setBounds(470, 240, 80, 80);
		clearBtn.addActionListener(this);
		//clearBtn.setFont(new Font("Arial",Font.PLAIN, 40));
		jf.add(clearBtn);
		
		jf.setVisible(true); //JFrame visibility		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// auto close terminal on window closing
	}
	public static void main(String[] args) {
		new Calculator();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource()==sevenBtn) {
			if(isClicked) {
				displayLabel.setText("7");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"7");
			}
		}
		else if( e.getSource()==eightBtn) {
			if(isClicked) {
				displayLabel.setText("8");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"8");
			}
			
		}
		else if(e.getSource()==nineBtn) {
			if(isClicked) {
				displayLabel.setText("9");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"9");
			}
			
		}
		else if(e.getSource()==sixBtn) {
			if(isClicked) {
				displayLabel.setText("6");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"6");
			}
			
		}
		else if(e.getSource()==fiveBtn) {
			if(isClicked) {
				displayLabel.setText("5");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"5");
			}
			
		}
		else if(e.getSource()==fourBtn) {
			if(isClicked) {
				displayLabel.setText("4");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"4");
			}
			
		}
		else if(e.getSource()==threeBtn) {
			if(isClicked) {
				displayLabel.setText("3");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"3");
			}
			
		}
		else if(e.getSource()==twoBtn) {
			if(isClicked) {
				displayLabel.setText("2");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"2");
			}
			
		}
		else if(e.getSource()==oneBtn) {
			if(isClicked) {
				displayLabel.setText("1");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"1");
			}
			
		}
		else if(e.getSource()==divBtn) {
			isClicked = true;
			oldVal=displayLabel.getText();
			oper = '/';
		}
		else if(e.getSource()==mulBtn) {
			isClicked = true;
			oldVal=displayLabel.getText();
			oper = 'x';
		}
		else if(e.getSource()==addBtn) {
			isClicked = true;
			oldVal=displayLabel.getText();
			oper = '+';
		}
		else if(e.getSource()==subBtn) {
			isClicked = true;
			oldVal=displayLabel.getText();
			oper = '-';
		}
		else if(e.getSource()==equalBtn) {
			
			float result = 0;
			newVal=displayLabel.getText();
			
			if(oper == '+')
			{
				float oldValF=Float.parseFloat(oldVal);
				float newValF=Float.parseFloat(newVal);
				
				result= oldValF + newValF;
			}
			else if(oper == '-') {
				float oldValF=Float.parseFloat(oldVal);
				float newValF=Float.parseFloat(newVal);
				
				result= oldValF - newValF;
			}
			else if(oper == '/') {
				float oldValF=Float.parseFloat(oldVal);
				float newValF=Float.parseFloat(newVal);
				
				result= oldValF/newValF;
			}
			else if(oper == 'x') {
				float oldValF=Float.parseFloat(oldVal);
				float newValF=Float.parseFloat(newVal);
				
				result= oldValF*newValF;
			}
			
			displayLabel.setText(result+""); //to convert to string
		}
		else if(e.getSource()==zeroBtn) {
			if(isClicked) {
				displayLabel.setText("0");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"0");
			}
		}
		else if(e.getSource()==dotBtn) {
			if(isClicked) {
				displayLabel.setText(".");
				isClicked= false;
			}
			else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+".");
			}
		}
		else if(e.getSource()==clearBtn) {
			displayLabel.setText("");
		}
	}

}
