package Our_calc;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Our_calc extends Application{
	 TextArea textarea=new TextArea();
	    String showExpression = ""; //where store user view 
	    String hiddenExpression = "";//store hide calculation expression
	    boolean isSquare = false;//if 
	    boolean isOpen = false;//if bracket is open
	    boolean isequal=false;//if user press equal button 
	    int countOpen = 0;// num of opened brackets
	    int countClose = 0;// num of closed brackets
            StackPane pane; //design pane
            //int fplus=0,fmin=0,fdiv=0,fmul=0, fmod=0,fsqrt=0,fsquare=0;// flags to know which process needed
	    
	 @Override
	 public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		 pane=desingCalculator();
                 pane.setMaxSize(300, 200);
		 Scene scene=new Scene(pane,370,200);
		
		 arg0.setTitle("Calcluator");
		 arg0.setScene(scene);
		 arg0.show();
		
		arg0.setOnCloseRequest(e->{
			arg0.close();
			
		});  
	 }
	  
	 
	 public StackPane desingCalculator(){
             StackPane root = new StackPane();
        root.setMaxSize(400, 200);
         textarea = new TextArea();
        textarea.setMaxSize(370, 50);
        textarea.setTranslateY(-75);
        textarea.setEditable(false);
        root.getChildren().add(textarea);

        Button seven = new Button("7");
        seven.setMaxSize(50, 30);
        seven.setTranslateX(-160);
        seven.setTranslateY(-25);
        root.getChildren().add(seven);
        /////////////////////////////////////////
        Button eight = new Button("8");
        eight.setMaxSize(50, 30);
        eight.setTranslateX(-100);
        eight.setTranslateY(-25);
        root.getChildren().add(eight);
        ////////////////////////////////
        Button nine = new Button("9");
        nine.setMaxSize(50, 30);
        nine.setTranslateX(-40);
        nine.setTranslateY(-25);
        root.getChildren().add(nine);
                ////////////////////////////
                Button div = new Button("/");
        div.setMaxSize(50, 30);
        div.setTranslateX(20);
        div.setTranslateY(-25);
        root.getChildren().add(div);

        Button clear = new Button("â†گ");
        clear.setMaxSize(50, 30);
        clear.setTranslateX(80);
        clear.setTranslateY(-25);
        root.getChildren().add(clear);

        Button reset = new Button("reset");
        reset.setMaxSize(50, 30);
        reset.setTranslateX(140);
        reset.setTranslateY(-25);
         root.getChildren().add(reset);

        Button four = new Button("4");
        four.setMaxSize(50, 30);
        four.setTranslateX(-160);
        four.setTranslateY(10);
         root.getChildren().add(four);

        Button five = new Button("5");
        five.setMaxSize(50, 30);
        five.setTranslateX(-100);
        five.setTranslateY(10);
        root.getChildren().add(five);

        Button six = new Button("6");
        six.setMaxSize(50, 30);
        six.setTranslateX(-40);
        six.setTranslateY(10);
         root.getChildren().add(six);

        Button mul = new Button("*");
        mul.setMaxSize(50, 30);
        mul.setTranslateX(20);
        mul.setTranslateY(10);
        root.getChildren().add(mul);

        Button open = new Button("(");
        open.setMaxSize(50, 30);
        open.setTranslateX(80);
        open.setTranslateY(10);
        root.getChildren().add(open);

        Button close = new Button(")");
        close.setMaxSize(50, 30);
        close.setTranslateX(140);
        close.setTranslateY(10);
        root.getChildren().add(close);

        Button one = new Button("1");
        one.setMaxSize(50, 30);
        one.setTranslateX(-160);
        one.setTranslateY(45);
        root.getChildren().add(one);

        Button two = new Button("2");
        two.setMaxSize(50, 30);
        two.setTranslateX(-100);
        two.setTranslateY(45);
        root.getChildren().add(two);

        Button three = new Button("3");
        three.setMaxSize(50, 30);
        three.setTranslateX(-40);
        three.setTranslateY(45);
         root.getChildren().add(three);

        Button minus = new Button("-");
        minus.setMaxSize(50, 30);
        minus.setTranslateX(20);
        minus.setTranslateY(45);
         root.getChildren().add(minus);

        Button square = new Button("X^2");
        square.setMaxSize(50, 30);
        square.setTranslateX(80);
        square.setTranslateY(45);
        root.getChildren().add(square);

        Button sqrt = new Button("âˆڑ");
        sqrt.setMaxSize(50, 30);
        sqrt.setTranslateX(140);
        sqrt.setTranslateY(45);
        root.getChildren().add(sqrt);

        Button zero = new Button("0");
        zero.setMaxSize(50, 30);
        zero.setTranslateX(-160);
        zero.setTranslateY(80);
        root.getChildren().add(zero);

        Button dot = new Button(".");
        dot.setMaxSize(50, 30);
        dot.setTranslateX(-100);
        dot.setTranslateY(80);
        root.getChildren().add(dot);

        Button mod = new Button("%");
        mod.setMaxSize(50, 30);
        mod.setTranslateX(-40);
        mod.setTranslateY(80);
        root.getChildren().add(mod);

        Button plus = new Button("+");
        plus.setMaxSize(50, 30);
        plus.setTranslateX(20);
        plus.setTranslateY(80);
        root.getChildren().add(plus);

        Button equal = new Button("=");
        equal.setMaxSize(110, 30);
        equal.setTranslateX(110);
        equal.setTranslateY(80);
        root.getChildren().add(equal);

///////////////////////////////////////////////////////////////// one button is clicked
		 one.setOnAction(e->{
                     
                     //fsqrt=0; fsquare=0;fmul=0;fmin=0;fplus=0;fdiv=0;fmod=0;
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "1";
                 hiddenExpression += "1";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "1";
                 hiddenExpression = "1";
                 textarea.setText(showExpression);
                 isequal=false;
             }

		 });
                 ///////////////////////////////////////////////////////////////// two button is clicked
		 two.setOnAction(e->{
                    

			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "2";
                 hiddenExpression += "2";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "2";
                 hiddenExpression = "2";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// three button is clicked
		 three.setOnAction(e->{
                    

			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "3";
                 hiddenExpression += "3";
                 textarea.setText(showExpression);

             }
             if(isequal){
            	 showExpression = "3";
                 hiddenExpression = "3";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// four button is clicked
		 four.setOnAction(e->{
                   
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "4";
                 hiddenExpression += "4";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "4";
                 hiddenExpression = "4";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
		 five.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "5";
                 hiddenExpression += "5";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "5";
                 hiddenExpression = "5";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// six button is clicked
		 six.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "6";
                 hiddenExpression += "6";
                 textarea.setText(showExpression);
             } 
             if(isequal){
            	 showExpression = "6";
                 hiddenExpression = "6";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
		 seven.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "7";
                 hiddenExpression += "7";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "7";
                 hiddenExpression = "7";
                 textarea.setText(showExpression);
                 isequal=false;
             }
         });
                 ///////////////////////////////////////////////////////////////// eight button is clicked
		 eight.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "8";
                 hiddenExpression += "8";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "8";
                 hiddenExpression = "8";
                 textarea.setText(showExpression);
                 isequal=false;
             }
         
		 });
                 ///////////////////////////////////////////////////////////////// nine button is clicked
		 nine.setOnAction(e->{
                     
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {
                 showExpression += "9";
                 hiddenExpression += "9";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "9";
                 hiddenExpression = "9";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// Zero button is clicked
		 zero.setOnAction(e->{
                    
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {

                 showExpression += "0";
                 hiddenExpression += "0";
                 textarea.setText(showExpression);

             }
             if(isequal){
            	 showExpression = "0";
                 hiddenExpression = "0";
                 textarea.setText(showExpression);
                 isequal=false;
             }
		 });
                 ///////////////////////////////////////////////////////////////// dot button is clicked
		 dot.setOnAction(e->{
			 
			 char ch = ' ';
             if (!showExpression.equals("")) {
                 ch = showExpression.charAt(showExpression.length() - 1);
             }
             if ((ch != ')' && isSquare == false)) {

                 showExpression += ".";
                 hiddenExpression += ".";
                 textarea.setText(showExpression);
             }
             if(isequal){
            	 showExpression = "0.";
                 hiddenExpression = "0.";
                 textarea.setText(showExpression);
                 isequal=false;
             }
	
		 });
                 ///////////////////////////////////////////////////////////////// plus button is clicked
		 plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                   // fplus=1;
                if(isequal){
    	 showExpression += "+";
         hiddenExpression += "+";
         textarea.setText(showExpression);
         isequal=false;
     }
     else if(showExpression==""){
//    	 showExpression = "0+";
//         hiddenExpression = "0+";
//         textarea.setText(showExpression); 
     }
     else{
	 showExpression += "+";
     hiddenExpression += "+";
     textarea.setText(showExpression);
     isSquare = false;	 
     }
            }
                 catch(Exception e)
                {
                }
            }
        });
                 ///////////////////////////////////////////////////////////////// minus button is clicked
 minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                  //  fmin=1;
                if(isequal){
    	 showExpression += "-";
         hiddenExpression += "-";
         textarea.setText(showExpression);
         isequal=false;
     }
     else if(showExpression==""){
//    	 showExpression = "0-";
//         hiddenExpression = "0-";
//         textarea.setText(showExpression); 
     }
     else{
	 showExpression += "-";
     hiddenExpression += "-";
     textarea.setText(showExpression);
     isSquare = false;	 
     }
                
            }
                 catch(Exception e)
                {
                }
            }
        });
 ///////////////////////////////////////////////////////////////// div button is clicked
 div.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                 //fdiv=1;
	 char ch = showExpression.charAt(showExpression.length() - 1);
         if(isequal){
    	 showExpression += "/";
         hiddenExpression += "/";
         textarea.setText(showExpression);
         isequal=false;
     }
     
     else if (Character.isDigit(ch) || ch == ')') {
         showExpression += "/";
         hiddenExpression += "/";
         textarea.setText(showExpression);
         isSquare = false;
     }
     else if(showExpression==""){
//    	 showExpression = "0/";
//         hiddenExpression = "0/";
//         textarea.setText(showExpression); 
     }
                }
                 catch(Exception e)
                {
                }
                 
            }
        });
 ///////////////////////////////////////////////////////////////// mul button is clicked
 mul.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                
	 char ch = showExpression.charAt(showExpression.length() - 1);
    
      if(isequal){
    	 showExpression += "*";
         hiddenExpression += "*";
         textarea.setText(showExpression);
         isequal=false;
     }
      else if (Character.isDigit(ch) || ch == ')') {
         showExpression += "*";
         hiddenExpression += "*";
         textarea.setText(showExpression);
         isSquare = false;
     }
     else if(showExpression==""){
//    	 showExpression = "0*";
//         hiddenExpression = "0*";
//         textarea.setText(showExpression); 
     }
                }
                 catch(Exception e)
                {
                }
                 
            }

 });
 ///////////////////////////////////////////////////////////////// mod button is clicked
mod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                // fmod=1;
	 char ch = showExpression.charAt(showExpression.length() - 1);
         if(isequal){
    	 showExpression += "%";
         hiddenExpression += "%";
         textarea.setText(showExpression);
         isequal=false;
     }
         
     else if (Character.isDigit(ch) || ch ==')') {

         showExpression += "%";
         hiddenExpression += "%";
         textarea.setText(showExpression);
         isSquare = false;
     } 
     if(showExpression==""){
//    	 showExpression = "0%";
//         hiddenExpression = "0%";
//         textarea.setText(showExpression); 
     }
            }
                 catch(Exception e)
                {
                }
            }
        });
///////////////////////////////////////////////////////////////// sqrt button is clicked
 sqrt.setOnAction(new EventHandler<ActionEvent>(){  
   
            @Override
            public void handle(ActionEvent event) {  
                
     try {
      //  fsqrt=1;
           char ch = ' ';
     ch = showExpression.charAt(showExpression.length() - 1);
     if (!Character.isDigit(ch) && isSquare == false && ch != ')') {

         showExpression += "âˆڑ";
         hiddenExpression += "|";
         textarea.setText(showExpression);

     }
     }catch (Exception e) {
     }
 
            }
     
 });
textarea.setEditable(false);

///////////////////////////////////////////////////////////////// square button is clicked
 square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                   // fsquare=1;
                   char lastChar = showExpression.charAt(showExpression.length() - 1);
 
 if (Character.isDigit(lastChar)) {
     String number = "";
     String swapNumber = "";
     String str = textarea.getText();
     for (int i = str.length() - 1; i >= 0; i--) {
         char ch = str.charAt(i);
         if (Character.isDigit(ch)) {
             number += ch;
         } else {
             break;
         }
     }
     for (int i = number.length() - 1; i >= 0; i--) {
         char ch = number.charAt(i);
         swapNumber += ch;
     }
     hiddenExpression += "*" + swapNumber;
     showExpression += "^2";
     textarea.setText(showExpression);
     isSquare = true;	} 
                } catch (Exception e) {
                }
            }
     
	 
 
 });
 ///////////////////////////////////////////////////////////////// clear button is clicked
 clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                   
                 char ch = ' ';
     if (!showExpression.equals("")) {
         ch = showExpression.charAt(showExpression.length() - 1);
     }
     if (ch == ')') {
         countClose--;
     } else if (ch == '(') {
         countOpen--;
         if (countOpen == 0);
         isOpen = false;
     }

     String str = textarea.getText();
     String newStr = str.substring(0, showExpression.length() - 1);
     showExpression = newStr;
     hiddenExpression = hiddenExpression.substring(0, hiddenExpression.length() - 1);
     textarea.setText(showExpression);
	
                } catch (Exception e) {
                }
            }
     
	 
 
 });
   ///////////////////////////////////////////////////////////////// reset button is clicked
 reset.setOnAction(e->{
     
	 textarea.setText("");
     showExpression = "";
     hiddenExpression = "";
     isOpen = false;
     isSquare = false;
     countClose = 0;
     countOpen = 0;

 });
		 open.setOnAction(e->{
			 char ch1 = ' ';
             if (!showExpression.equals("")) {
                 ch1 = showExpression.charAt(showExpression.length() - 1);
             }
             if (((!Character.isDigit(ch1) && isSquare == false) && ch1 != ')') || ch1 == ' ') {
                 showExpression += "(";
                 hiddenExpression += "(";
                 textarea.setText(showExpression);
                 isOpen = true;
                 countOpen++;
             }
		 });
                 ///////////////////////////////////////////////////////////////// close brackets button is clicked
		 close.setOnAction(e->{
			 if (isOpen) {
                 showExpression += ")";
                 hiddenExpression += ")";
                 textarea.setText(showExpression);
                 countClose++;
             }
		 });
                 ///////////////////////////////////////////////////////////////// equal button is clicked
		
                 equal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                if (countClose != countOpen) {
                 textarea.setText("error expression");
                 showExpression = "";
                 hiddenExpression = "";
             } else {

                 EvaluteExpression ev = new EvaluteExpression();
                 hiddenExpression = ev.brackets(hiddenExpression);
                 textarea.setText(hiddenExpression);
                 showExpression = hiddenExpression;
//                 if(fdiv==1 || fmin==1|| fmod==1||fmul==1||fplus==1||fsqrt==1||fsquare==1){
//                 //showExpression = hiddenExpression;
//                 
//                 }else{
//                 showExpression ="";
//                 hiddenExpression="";
//                 }
                 
                 isequal=true;
             }
            }
                 catch(Exception e)
                {
                }
            }
        });
		return root;


	 }
	 
	public static void main(String[]args){
	 
		 Application.launch(args);
	 }
}

 class EvaluteExpression {
    ArrayList<String> contents;

    String item;
    EvaluteExpression check;

    public String brackets(String s) {
        check = new EvaluteExpression();
        while (s.contains(Character.toString('(')) || s.contains(Character.toString(')'))) {
            for (int i =  s.length()-1; i >=0; i--) {
                if (s.charAt(i) == ')') {
                    for (int j = i; j >= 0; j--) {
                        if (s.charAt(j) == '(') {
                            String in = s.substring(j + 1, i);
                            in = check.recognize(in);
                            s = s.substring(0, j) + in + s.substring(i + 1);
                            j = i = 0;
                        }
                    }
                }
            }

        }
        s = check.recognize(s);
        return s;
    }

    public String recognize(String s) {
        PutIt putIt = new PutIt();
        contents = new ArrayList<String>();
        item = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                item = s.charAt(i) + item;
                if (i == 0) {
                    putIt.put();
                }
            } else {
                if (s.charAt(i) == '.') {
                    item = s.charAt(i) + item;
                } else if (s.charAt(i) == '-' && (i == 0 || (!Character.isDigit(s.charAt(i - 1))))) {
                    item = s.charAt(i) + item;
                    putIt.put();
                } else {
                    putIt.put();
                    item += s.charAt(i);
                    putIt.put();
                    if (s.charAt(i) == '|') {
                        item += " ";
                        putIt.put();
                    }
                }
            }
        }
        contents = putIt.result(contents, "^", "|");
        contents = putIt.result(contents, "*", "/");
        contents = putIt.result(contents, "+", "-");
        return contents.get(0);
    }

    public class PutIt {

        public void put() {
            if (!item.equals("")) {
                contents.add(0, item);
                item = "";
            }
        }

        public ArrayList<String> result(ArrayList<String> arrayList, String op1, String op2) {
            int scale = 10;
            BigDecimal result = new BigDecimal(0);
            for (int c = 0; c < arrayList.size(); c++) {
                if (arrayList.get(c).equals(op1) || arrayList.get(c).equals(op2)) {
                    if (arrayList.get(c).equals("|")) {
                        result = new BigDecimal(Math.sqrt(Double.parseDouble(arrayList.get(c + 1))));
                    } else if (arrayList.get(c).equals("*")) {
                        result = new BigDecimal(arrayList.get(c - 1)).multiply(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("/")) {
                        result = new BigDecimal(arrayList.get(c - 1)).divide(new BigDecimal(arrayList.get(c + 1)), scale, BigDecimal.ROUND_DOWN);
                    } else if (arrayList.get(c).equals("+")) {
                        result = new BigDecimal(arrayList.get(c - 1)).add(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("-")) {
                        result = new BigDecimal(arrayList.get(c - 1)).subtract(new BigDecimal(arrayList.get(c + 1)));
                    } else if (arrayList.get(c).equals("%")) {
                         result = new BigDecimal(arrayList.get(c - 1)).remainder(new BigDecimal(arrayList.get(c + 1)));
                    }

                    try {
                        arrayList.set(c, (result.setScale(scale, RoundingMode.HALF_DOWN).
                                stripTrailingZeros().toPlainString()));
                        arrayList.remove(c + 1);
                        arrayList.remove(c - 1);
                    } catch (Exception ignored) {
                    }
                } else {
                    continue;
                }
                c = 0;
            }
            return arrayList;
        }
    }
}
