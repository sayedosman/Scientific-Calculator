package main.java.scientific_calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.math.*;
import java.util.*;

public class Scientific_Calculator extends Application {

    TextArea textarea;
    String showExpression = "";
    String hiddenExpression = "";
    boolean isSquare = false;
    boolean isOpen = false;
    int countOpen = 0;
    int countClose = 0;

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setMaxSize(400, 200);

        textarea = new TextArea();
        textarea.setMaxSize(400, 50);
        textarea.setTranslateY(-75);
        textarea.setEditable(false);
        root.getChildren().add(textarea);

        Button seven = new Button("7");
        seven.setMaxSize(50, 30);
        seven.setTranslateX(-160);
        seven.setTranslateY(-25);
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "7";
                    hiddenExpression += "7";
                    textarea.setText(showExpression);
                }
            }
                catch(Exception e)
                {
                }
                    
            }
        });
        root.getChildren().add(seven);

        Button eight = new Button("8");
        eight.setMaxSize(50, 30);
        eight.setTranslateX(-100);
        eight.setTranslateY(-25);
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "8";
                    hiddenExpression += "8";
                    textarea.setText(showExpression);
                }
                }
                 catch(Exception e)
                {
                }
                 
            }
        });
        root.getChildren().add(eight);

        Button nine = new Button("9");
        nine.setMaxSize(50, 30);
        nine.setTranslateX(-40);
        nine.setTranslateY(-25);
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "9";
                    hiddenExpression += "9";
                    textarea.setText(showExpression);
                }
                }
                 catch(Exception e)
                {
                }
                 
            }
        });
        root.getChildren().add(nine);

        Button division = new Button("/");
        division.setMaxSize(50, 30);
        division.setTranslateX(20);
        division.setTranslateY(-25);
        division.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = showExpression.charAt(showExpression.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
                    showExpression += "/";
                    hiddenExpression += "/";
                    textarea.setText(showExpression);
                    isSquare = false;
                }
                }
                 catch(Exception e)
                {
                }
                 
            }
        });
        root.getChildren().add(division);

        Button delete = new Button("←");
        delete.setMaxSize(50, 30);
        delete.setTranslateX(80);
        delete.setTranslateY(-25);
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
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
            }
                 catch(Exception e)
                {
                }
                 
            }
        });
        root.getChildren().add(delete);

        Button reset = new Button("reset");
        reset.setMaxSize(50, 30);
        reset.setTranslateX(140);
        reset.setTranslateY(-25);
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                textarea.setText("");
                showExpression = "";
                hiddenExpression = "";
                isOpen = false;
                isSquare = false;
                countClose = 0;
                countOpen = 0;

            }
                 catch(Exception e)
                {
                }
            }
                 
        });

        root.getChildren().add(reset);

        Button four = new Button("4");
        four.setMaxSize(50, 30);
        four.setTranslateX(-160);
        four.setTranslateY(10);
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try
                {
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "4";
                    hiddenExpression += "4";
                    textarea.setText(showExpression);
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(four);

        Button five = new Button("5");
        five.setMaxSize(50, 30);
        five.setTranslateX(-100);
        five.setTranslateY(10);
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "5";
                    hiddenExpression += "5";
                    textarea.setText(showExpression);
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(five);

        Button six = new Button("6");
        six.setMaxSize(50, 30);
        six.setTranslateX(-40);
        six.setTranslateY(10);
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "6";
                    hiddenExpression += "6";
                    textarea.setText(showExpression);
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(six);

        Button multiplication = new Button("*");
        multiplication.setMaxSize(50, 30);
        multiplication.setTranslateX(20);
        multiplication.setTranslateY(10);
        multiplication.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = showExpression.charAt(showExpression.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
                    showExpression += "*";
                    hiddenExpression += "*";
                    textarea.setText(showExpression);
                    isSquare = false;
                }
                }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(multiplication);

        Button openPar = new Button("(");
        openPar.setMaxSize(50, 30);
        openPar.setTranslateX(80);
        openPar.setTranslateY(10);
        openPar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
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
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(openPar);

        Button closePar = new Button(")");
        closePar.setMaxSize(50, 30);
        closePar.setTranslateX(140);
        closePar.setTranslateY(10);
        closePar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                if (isOpen) {
                    showExpression += ")";
                    hiddenExpression += ")";
                    textarea.setText(showExpression);
                    countClose++;
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(closePar);

        Button one = new Button("1");
        one.setMaxSize(50, 30);
        one.setTranslateX(-160);
        one.setTranslateY(45);
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "1";
                    hiddenExpression += "1";
                    textarea.setText(showExpression);
                }
            }
             catch(Exception e)
                {
                }
            }
                
        });
        root.getChildren().add(one);

        Button two = new Button("2");
        two.setMaxSize(50, 30);
        two.setTranslateX(-100);
        two.setTranslateY(45);
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "2";
                    hiddenExpression += "2";
                    textarea.setText(showExpression);
                }

            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(two);

        Button three = new Button("3");
        three.setMaxSize(50, 30);
        three.setTranslateX(-40);
        three.setTranslateY(45);
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {
                    showExpression += "3";
                    hiddenExpression += "3";
                    textarea.setText(showExpression);

                }
            }
                 catch(Exception e)
                {
                }
            }

        });
        root.getChildren().add(three);

        Button minus = new Button("-");
        minus.setMaxSize(50, 30);
        minus.setTranslateX(20);
        minus.setTranslateY(45);
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                showExpression += "-";
                hiddenExpression += "-";
                textarea.setText(showExpression);
                isSquare = false;
//                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(minus);

        Button square = new Button("X^2");
        square.setMaxSize(50, 30);
        square.setTranslateX(80);
        square.setTranslateY(45);
        square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
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
                    isSquare = true;
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(square);

        Button squareRoot = new Button("√");
        squareRoot.setMaxSize(50, 30);
        squareRoot.setTranslateX(140);
        squareRoot.setTranslateY(45);
        squareRoot.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                ch = showExpression.charAt(showExpression.length() - 1);
                if (!Character.isDigit(ch) && isSquare == false && ch != ')') {

                    showExpression += "√";
                    hiddenExpression += "|";
                    textarea.setText(showExpression);

                }
                }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(squareRoot);

        Button zero = new Button("0");
        zero.setMaxSize(50, 30);
        zero.setTranslateX(-160);
        zero.setTranslateY(80);
        zero.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {

                    showExpression += "0";
                    hiddenExpression += "0";
                    textarea.setText(showExpression);

                }
                }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(zero);

        Button point = new Button(".");
        point.setMaxSize(50, 30);
        point.setTranslateX(-100);
        point.setTranslateY(80);
        point.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = ' ';
                if (!showExpression.equals("")) {
                    ch = showExpression.charAt(showExpression.length() - 1);
                }
                if ((ch != ')' && isSquare == false)) {

                    showExpression += ".";
                    hiddenExpression += ".";
                    textarea.setText(showExpression);
                }

            }
                 catch(Exception e)
                {
                }
                
            }
        });
        root.getChildren().add(point);

        Button mod = new Button("%");
        mod.setMaxSize(50, 30);
        mod.setTranslateX(-40);
        mod.setTranslateY(80);
        mod.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = showExpression.charAt(showExpression.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {

                    showExpression += "%";
                    hiddenExpression += "%";
                    textarea.setText(showExpression);
                    isSquare = false;
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(mod);

        Button add = new Button("+");
        add.setMaxSize(50, 30);
        add.setTranslateX(20);
        add.setTranslateY(80);
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                char ch = showExpression.charAt(showExpression.length() - 1);
                if (Character.isDigit(ch) || ch == ')') {
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
        root.getChildren().add(add);

        Button equal = new Button("=");
        equal.setMaxSize(110, 30);
        equal.setTranslateX(110);
        equal.setTranslateY(80);
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
                    showExpression = "";
                    hiddenExpression = "";
                }
            }
                 catch(Exception e)
                {
                }
            }
        });
        root.getChildren().add(equal);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Scientific Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class EvaluteExpression {

    ArrayList<String> contents;
    String item;
    EvaluteExpression check;

   
    public String brackets(String s) {
        check = new EvaluteExpression();
        while (s.contains(Character.toString('(')) || s.contains(Character.toString(')'))) {
            for (int i = 0; i < s.length(); i++) {
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


    public static void main(String[] args) {
        launch(args);
    }

}
