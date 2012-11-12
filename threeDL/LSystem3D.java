/*
This class returns a pattern based on the input provided by the user as to:
*iteration
*starting pattern
*replacement rules
*deviation angle

*/
package threeDL;

import java.util.*;
public class LSystem3D {

	static int i;
	static int j;
	static int k;
	//This is a testmethod using hardcoded replacement rules and starting pattern:
	static ArrayList<String> pattern(int iteration){
	
   	ArrayList<String> pattern = new ArrayList<String>();//pattern.
  // 	pattern.add("A");
   	 	pattern.add("A");
   	ArrayList<String> pattern2 = new ArrayList<String>();//pattern2
   	//replacement rules:
   	for (j=0;j<iteration-1;j++){
   		for (k=0;k<pattern.size();k++){
		 		String test = pattern.get(k);
		/* 			if (test.equals("A")){
   				pattern2.add("^");			 		
			 		pattern2.add("*");
	   			pattern2.add("A");		 		
			 		pattern2.add("F");
			   	pattern2.add("^"); 		
			 		pattern2.add("*");
			 		pattern2.add("A");
			   	pattern2.add("F"); 		
			 		pattern2.add("A");
			 		pattern2.add("-");
			 		pattern2.add("F");
	   			pattern2.add("^");		 		
			 		pattern2.add("/");
			   	pattern2.add("/"); 		
			 		pattern2.add("A");
			 		pattern2.add("F");
			   	pattern2.add("A"); 		
			 		pattern2.add("&");
			 		pattern2.add("F");
	   			pattern2.add("+");		 		
			 		pattern2.add("/");
			   	pattern2.add("/"); 		
			 		pattern2.add("A");
			 		pattern2.add("F");
			   	pattern2.add("A"); 		
			 		pattern2.add("-");
			 		pattern2.add("F");			 					 		
			 		pattern2.add("/");
			 		pattern2.add("A");		 			
			 		pattern2.add("-");		 			
			 		pattern2.add("/");		 						 					 					 				 
		 			}*/
		 		
			 	if (test.equals("A")){
			 		pattern2.add("B");
   				pattern2.add("-");			 		
			 		pattern2.add("F");
	   			pattern2.add("+");		 		
			 		pattern2.add("C");
			   	pattern2.add("F"); 		
			 		pattern2.add("C");
			 		pattern2.add("+");
			   	pattern2.add("F"); 		
			 		pattern2.add("-");
			 		pattern2.add("D");
			 		pattern2.add("&");
	   			pattern2.add("F");		 		
			 		pattern2.add("^");
			   	pattern2.add("D"); 		
			 		pattern2.add("-");
			 		pattern2.add("F");
			   	pattern2.add("+"); 		
			 		pattern2.add("&");
			 		pattern2.add("&");
	   			pattern2.add("C");		 		
			 		pattern2.add("F");
			   	pattern2.add("C"); 		
			 		pattern2.add("+");
			 		pattern2.add("F");
			   	pattern2.add("+"); 		
			 		pattern2.add("B");
			 		pattern2.add("/");			 					 		
			 		pattern2.add("/");			 					 					 		
			 	}
			 	if (test.equals("B")){
			 		pattern2.add("A");
   				pattern2.add("&");			 		
			 		pattern2.add("F");
	   			pattern2.add("^");		 		
			 		pattern2.add("C");
			   	pattern2.add("F"); 		
			 		pattern2.add("B");
			 		pattern2.add("^");
			   	pattern2.add("F"); 		
			 		pattern2.add("^");
			 		pattern2.add("D");
			 		pattern2.add("^");
	   			pattern2.add("^");		 		
			 		pattern2.add("-");
			   	pattern2.add("F"); 		
			 		pattern2.add("-");
			 		pattern2.add("D");
			   	pattern2.add("^"); 		
			 		pattern2.add("|");
			 		pattern2.add("F");
	   			pattern2.add("^");		 		
			 		pattern2.add("B");
			   	pattern2.add("|"); 		
			 		pattern2.add("F");
			 		pattern2.add("C");
			   	pattern2.add("^"); 		
			 		pattern2.add("F");
			 		pattern2.add("^");			 					 		
			 		pattern2.add("A");			 					 					 		
			 		pattern2.add("/");			 					 		
			 		pattern2.add("/");	
			 	}			 	
			 	
			 	if (test.equals("C")){
			 		pattern2.add("|");
   				pattern2.add("D");			 		
			 		pattern2.add("^");
	   			pattern2.add("|");		 		
			 		pattern2.add("F");
			   	pattern2.add("^"); 		
			 		pattern2.add("B");
			 		pattern2.add("-");
			   	pattern2.add("F"); 		
			 		pattern2.add("+");
			 		pattern2.add("C");
			 		pattern2.add("^");
	   			pattern2.add("F");		 		
			 		pattern2.add("^");
			   	pattern2.add("A"); 		
			 		pattern2.add("&");
			 		pattern2.add("&");
			   	pattern2.add("F"); 		
			 		pattern2.add("A");
			 		pattern2.add("&");
	   			pattern2.add("F");		 		
			 		pattern2.add("^");
			   	pattern2.add("C"); 		
			 		pattern2.add("+");
			 		pattern2.add("F");
			   	pattern2.add("+"); 		
			 		pattern2.add("B");
			 		pattern2.add("^");			 					 		
			 		pattern2.add("F");			 					 					 		
			 		pattern2.add("^");			 					 		
			 		pattern2.add("D");	
			 		pattern2.add("/");			 					 					 		
			 		pattern2.add("/");			 					 		
			 	}	
			 	
			 	if (test.equals("D")){
			 		pattern2.add("|");
   				pattern2.add("C");			 		
			 		pattern2.add("F");
	   			pattern2.add("B");		 		
			 		pattern2.add("-");
			   	pattern2.add("F"); 		
			 		pattern2.add("+");
			 		pattern2.add("B");
			   	pattern2.add("|"); 		
			 		pattern2.add("F");
			 		pattern2.add("A");
			 		pattern2.add("&");
	   			pattern2.add("F");		 		
			 		pattern2.add("^");
			   	pattern2.add("A"); 		
			 		pattern2.add("&");
			 		pattern2.add("&");
			   	pattern2.add("F"); 		
			 		pattern2.add("B");
			 		pattern2.add("-");
	   			pattern2.add("F");		 		
			 		pattern2.add("+");
			   	pattern2.add("B"); 		
			 		pattern2.add("|");
			 		pattern2.add("F");
			   	pattern2.add("C"); 		
			 		pattern2.add("/");
			 		pattern2.add("/");			 					 			 					 		
			 	}			 	
			 	
			 	if (test.equals("F")){
			 		pattern2.add("F");
			 	}			 	
			 	if (test.equals("-")){
			 		pattern2.add("-");
			 	}
			 	if (test.equals("+")){
			 		pattern2.add("+");
			 	}
			 	if (test.equals("*")){
			 		pattern2.add("*");
			 	}
			 	if (test.equals("&")){
			 		pattern2.add("&");
			 	}
			 	
			 	if (test.equals("/")){
			 		pattern2.add("/");
			 	}
			 	if (test.equals("^")){
			 		pattern2.add("^");
			 	}
			 	if (test.equals("|")){
			 		pattern2.add("|");
			 	}			 				 				 				 				 	
			 }
			 pattern.clear();
			 	for (i=0;i<pattern2.size();i++){
			 		pattern.add(pattern2.get(i));
			 	}
			 	pattern2.clear();
		 	}
		 	
   	if (iteration==0){ //The zero case is special.
   	pattern.clear();
   	System.out.println("Not much happening with that low iteration #.");
   	}
   	
   	for (i=0;i<pattern.size();i++){
		 	System.out.println(pattern.get(i));
   	}

    return pattern;	
	}
//This is the method used by the program, it takes iteration #, Starting pattern, replacement rules and deviation angle  as arguments and returns the resulting pattern:
		static ArrayList<String> pattern(int iteration,ArrayList <String> al,ArrayList <String> rule1,ArrayList <String> rule2,ArrayList <String> rule3,ArrayList <String> rule4,ArrayList <String> rule5){
	// al contains starting pattern.
	//rule 1 contains rewriting rules for F.
	//rule 2 contains rewriting rules for X.
	//rule 3 contains rewriting rules for Y.	
   	ArrayList<String> pattern = new ArrayList<String>();//pattern.
   	pattern=al;
   	System.out.println("This is pattern size: "+pattern.size());
   	ArrayList<String> pattern2 = new ArrayList<String>();//pattern2
   	//replacement rules:
   	for (j=0;j<iteration-1;j++){
   		for (k=0;k<pattern.size();k++){
		 		String test = pattern.get(k);
					

			 	
			 	if (test.equals("A")){
						for (String s : rule2){
							pattern2.add(s);
						}
			 	}
			 	
			 	if (test.equals("B")){
						for (String s : rule3){
							pattern2.add(s);
						}
			 	}
			 				 	
			 	if (test.equals("C")){
						for (String s : rule4){
							pattern2.add(s);
						}
			 	}			 	
			 	
			 	if (test.equals("D")){
						for (String s : rule5){
							pattern2.add(s);
						}
			 	}			 	
			 	
				if (test.equals("F")){
						for (String s : rule1){
							pattern2.add(s);
						}
			 	}			 	
				if (test.equals("-")){
			 		pattern2.add("-");
			 	}
			 	if (test.equals("+")){
			 		pattern2.add("+");
			 	}
			 	if (test.equals("*")){
			 		pattern2.add("*");
			 	}
			 	if (test.equals("&")){
			 		pattern2.add("&");
			 	}
			 	
			 	if (test.equals("/")){
			 		pattern2.add("/");
			 	}
			 	if (test.equals("^")){
			 		pattern2.add("^");
			 	}
			 	if (test.equals("|")){
			 		pattern2.add("|");
			 	}			 				 				 				 				 	
			 		 	
			 }
			 pattern.clear();
			 	for (i=0;i<pattern2.size();i++){
			 		pattern.add(pattern2.get(i));
			 	}
			 	pattern2.clear();
		 	}
		 	
   	if (iteration==0){ //The zero case is special.
   	pattern.clear();
   //	System.out.println("");
   	}
   	
   	for (i=0;i<pattern.size();i++){
	//	 	System.out.println(pattern.get(i));
   	}

    return pattern;	
	}

	
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {	
			pattern(3);
			}						
		 });
	}

}
