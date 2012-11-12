package threeDL;

import java.awt.*;
import java.awt.Graphics.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class LSystemGUI extends JPanel implements ActionListener {

	public static String fractalChosen;
	public static int iterations;
	public static boolean warningIssued=false;
	public JLabel infoText;
	public JLabel infoText2;
	public JLabel infoText3;
	public JLabel infoText4;
	public JLabel infoText5;		
	public static JTextField replacementA;
	public static JTextField replacementB;	
	public static JTextField replacementC;
	public static JTextField replacementD;		
	public static JTextField jtf;
	public static JTextField replacement;
	public ArrayList <String> startingPattern;
	public static IntegerField itf;
	
	public LSystemGUI() {
		super (new GridBagLayout());
		GridBagLayout gridbag = (GridBagLayout)getLayout();
		GridBagConstraints c = new GridBagConstraints();	
		
		
		JLabel iterations = new JLabel("Choose amount of Iterations:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(iterations,c);
		add(iterations,c);

		String[] array = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16"};
		
		JComboBox jc = new JComboBox(array);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		gridbag.setConstraints(jc,c);
		jc.setSelectedIndex(0);
		add(jc,c);
		jc.addActionListener(this);
		
		infoText = new JLabel("Choose Starting Pattern");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);
		
		jtf = new JTextField("A");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		gridbag.setConstraints(jtf,c);
		jtf.setColumns(10);
		add(jtf,c);		
		
		infoText = new JLabel("Choose turning angle");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);

		itf = new IntegerField(4);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		gridbag.setConstraints(itf,c);
		itf.setInt(90);
		add(itf,c);	
		
		infoText = new JLabel("Replacement Rule for F:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		gridbag.setConstraints(infoText,c);
		add(infoText,c);
		
		replacement = new JTextField("F");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		gridbag.setConstraints(replacement,c);
		replacement.setColumns(30);
		add(replacement,c);	
		
		infoText2 = new JLabel("Replacement Rule for A:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		gridbag.setConstraints(infoText2,c);
		add(infoText2,c);
		
		replacementA = new JTextField("B-F+CFC+F-D&F^D-F+&&CFC+F+B//");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		gridbag.setConstraints(replacementA,c);
		replacementA.setColumns(30);
		add(replacementA,c);		
		
		infoText3 = new JLabel("Replacement Rule for B:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 5;
		gridbag.setConstraints(infoText3,c);
		add(infoText3,c);
		
		replacementB = new JTextField("A&F^CFB^F^D^^-F-D^|F^B|FC^F^A//");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 5;
		gridbag.setConstraints(replacementB,c);
		replacementB.setColumns(30);
		add(replacementB,c);		
		
		infoText4 = new JLabel("Replacement Rule for C:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 6;
		gridbag.setConstraints(infoText4,c);
		add(infoText4,c);
		
		replacementC = new JTextField("|D^|F^B-F+C^F^A&&FA&F^C+F+B^F^D//");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 6;
		gridbag.setConstraints(replacementC,c);
		replacementB.setColumns(30);
		add(replacementC,c);		
		
		infoText5 = new JLabel("Replacement Rule for D:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 7;
		gridbag.setConstraints(infoText5,c);
		add(infoText5,c);
		
		replacementD = new JTextField("|CFB-F+B|FA&F^A&&FB-F+B|FC//");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 7;
		gridbag.setConstraints(replacementD,c);
		replacementD.setColumns(30);
		add(replacementD,c);
		
		JButton draw = new JButton("Draw");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 8;
		gridbag.setConstraints(draw,c);
		add(draw,c);
		
		draw.addActionListener(this);
		draw.setActionCommand("draw");				
	}

  public static void main(String s[]) {
      JFrame f = new JFrame("Draw L-Systems in 3 dimensions.");
 			f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 			
 			JComponent newContentPane = new LSystemGUI(); 
 			Color c = new Color(230,200,250);
 			newContentPane.setBackground(c);  
 			f.setContentPane(newContentPane); 
      f.pack();
      f.setSize(new Dimension(960,400));     
      f.setVisible(true);
  }	
  
  public static ArrayList<String> stringToArrayList(String s){
  	char[] stringArray=s.toCharArray();
  	ArrayList<String> al = new ArrayList<String>();
  	for (char c : stringArray){
  		String string = ""+c;
  		al.add(string);
  	}	
  	return al;
  }
  
  public static ArrayList<String> getStartingPattern(){
  		ArrayList<String> startingPattern;
  		String startingString = jtf.getText();
			startingPattern = stringToArrayList(startingString);
			return startingPattern;
  }
  
  public static ArrayList<String> getFReplacementRule(){
  		ArrayList<String> FReplacementRule;
  		String string = replacement.getText();
			FReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule"+string);			
			return FReplacementRule;
  }  
  
  public static ArrayList<String> getAReplacementRule(){
  		ArrayList<String> AReplacementRule;
  		String string = replacementA.getText();
			AReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for A: "+string);			
			return AReplacementRule;
  }   
  
  public static ArrayList<String> getBReplacementRule(){
  		ArrayList<String> BReplacementRule;
  		String string = replacementB.getText();
			BReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for B: "+string);			
			return BReplacementRule;
  }    
  
   public static ArrayList<String> getCReplacementRule(){
  		ArrayList<String> CReplacementRule;
  		String string = replacementC.getText();
			CReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for C: "+string);			
			return CReplacementRule;
  }   
  
   public static ArrayList<String> getDReplacementRule(){
  		ArrayList<String> DReplacementRule;
  		String string = replacementD.getText();
			DReplacementRule = stringToArrayList(string);
			System.out.println("This is replacementrule for D: "+string);			
			return DReplacementRule;
  } 
  
  public static int getAngle(){
  	int chosenAngle;
		chosenAngle = itf.getInt();
		return chosenAngle;
  }
  
  public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JComboBox) {
			try{
  		JComboBox cb = (JComboBox)e.getSource();
  		iterations = cb.getSelectedIndex()+1;
  		System.out.println("This is iteration #: "+iterations);
  		}catch (Exception E){}
  	}  	
		if (e.getSource() instanceof JButton) {
if ("draw".equals(e.getActionCommand())){
				try{
					System.out.println("The program will attempt to draw the L system specified by the gooey.");
					LSystem3DDraw LSD = new LSystem3DDraw();
					LSD.main(null);
				} catch (Exception E){}				//Do stuff.
			}		
		}
										
	}
}	
	

		



