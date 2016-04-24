package main.java.cs1302.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.ImageView;
import java.util.*;

public class Controller implements Initializable{
	
	ArrayList<String> entered = new ArrayList<String>();
	boolean useIterative = true;
	boolean visibleBinary = true;
	IterativeMath iterativeMath = new IterativeMath();
	RecursiveMath recursiveMath = new RecursiveMath();

	@FXML
	private Label b0;

	@FXML
	private Label result;

	@FXML
	private Label operation;

	@FXML
	private Button btnRecursion;

	@FXML
	private ImageView solidSnakeShit;

	@Override
	public void initialize(URL location, ResourceBundle resources){
		//idk why this is here
	}

	
	/*
	 * method bound to the 0 button adding 0 to the arraylist and displaying it
	 */
	public void btn0Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("0");
			entered.add("0");
		}
		else {

			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"0");
				entered.add("0");
			}
		}
	}		
	
	/*
	 * This method kills the program
	 */
	public void killMe(ActionEvent event) {
		System.out.println("MURDERER!");
		System.exit(0);
	}
	
	public void b0Pressed(ActionEvent event) {
		b0.setText("1");
	}

	/*
	 * Method clears and resets operation and result while also clearing the entered arraylist
	 */
	public void clear(ActionEvent event) {
		operation.setText("OPERATION");
		result.setText("RESULT");
		entered.clear();
	}
	
	/*
	 * method bound to the 1 button adding 1 to the arraylist and displaying it
	 */
	public void btn1Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("1");
			entered.add("1");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"1");
				entered.add("1");
			}
		}
	}

	/*
	 * method bound to the 2 button adding 2 to the arraylist and displaying it
	 */
	public void btn2Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("2");
			entered.add("2");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"2");
				entered.add("2");
			}
		}
	}
	
	/*
	 * method bound to the 3 button adding 3 to the arraylist and displaying it
	 */
	public void btn3Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("3");
			entered.add("3");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"3");
				entered.add("3");
			}
		}
	}
	
	/*
	 * method bound to the 4 button adding 4 to the arraylist and displaying it
	 */
	public void btn4Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("4");
			entered.add("4");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"4");
				entered.add("4");
			}
		}
	}

	/*
	 * method bound to the 5 button adding 5 to the arraylist and displaying it
	 */
	public void btn5Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("5");
			entered.add("5");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"5");
				entered.add("5");
			}
		}
	}

	/*
	 * method bound to the 6 button adding 6 to the arraylist and displaying it
	 */
	public void btn6Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("6");
			entered.add("6");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"6");
				entered.add("6");
			}
		}
	}

	/*
	 * method bound to the 7 button adding 7 to the arraylist and displaying it
	 */
	public void btn7Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("7");
			entered.add("7");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"7");
				entered.add("7");
			}
		}
	}

	/*
	 * method bound to the 8 button adding 8 to the arraylist and displaying it
	 */
	public void btn8Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("8");
			entered.add("8");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"8");}
				entered.add("8");
		}
	}

	/*
	 * method bound to the 9 button adding 9 to the arraylist and displaying it
	 */
	public void btn9Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("9");
			entered.add("9");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else {
				operation.setText(operation.getText()+"9");
				entered.add("9");
			}
		}
	}

	/*
	 * This method removes the last entered operator or digit from operations and from the arraylist
	 */
	public void backspace(ActionEvent event){
		if (operation.getText().length()==1||operation.getText().equals("OPERATION")){
			operation.setText("OPERATION");
			entered.clear();
		}
		else {
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals(" ")){
				if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals(">")){
					operation.setText(operation.getText().substring(0,operation.getText().length()-4));
				}
				else operation.setText(operation.getText().substring(0,operation.getText().length()-3));
			}
			else operation.setText(operation.getText().substring(0,operation.getText().length()-1));

			entered.remove(entered.size());
		}
	}
	
	/*
	 * method bound to the / button adding / to the arraylist and displaying it
	 */
	public void division(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" / ");
			entered.add(" / ");
		}
		else {
			operation.setText(operation.getText()+" / ");
			entered.add(" / ");
		}
	}

	/*
	 * method bound to the * button adding * to the arraylist and displaying it
	 */
	public void multiplication(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" * ");
			entered.add(" * ");
		}
		else {
			operation.setText(operation.getText()+" * ");
			entered.add(" * ");
		}
	}

	/*
	 * method bound to the - button adding - to the arraylist and displaying it
	 */
	public void subtraction(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" - ");
			entered.add(" - ");
		}
		else {operation.setText(operation.getText()+" - ");
			entered.add(" - ");
		}
	}

	/*
	 * method bound to the + button adding + to the arraylist and displaying it
	 */
	public void addition(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" + ");
			entered.add(" + ");
		}
		else {
			operation.setText(operation.getText()+" + ");
			entered.add(" + ");
		}
	}

	/*
	 * method bound to the ^ button adding ^ to the arraylist and displaying it
	 */
	public void exponentiation(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" ^ ");
			entered.add(" ^ ");
		}
		else {
			operation.setText(operation.getText()+" ^ ");
			entered.add(" ^ ");
		}
	}

	/*
	 * method bound to the ! button adding ! to the arraylist and displaying it
	 */
	public void factorial(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" ! ");
			entered.add(" ! ");
		}
		else {
			operation.setText(operation.getText()+" ! ");
			entered.add(" ! ");
		}
	}

	/*
	 * This method utilizes the arraylist to perform the necessary calculations and displays it in result
	 */
	public void calculate(ActionEvent event){
		//fact, exp, mul, div, add, sub
		/*String[] postFixArray;
		String[] fuck = new String[entered.size()];
		fuck = entered.toArray(fuck);
		postFixArray=ReversePolishNotation.infixToPostfix(fuck);
		if(useIterative){
			result.setText(""+ReversePolishNotation.evaluate(iterativeMath,postFixArray));
		}
		else{
			result.setText(""+ReversePolishNotation.evaluate(recursiveMath,postFixArray));
		}*/

		String[] fuck = operation.getText().split(" ");
		String[] postFixArray=ReversePolishNotation.infixToPostfix(fuck);
		if(useIterative){
			try{
				try{
					result.setText(""+ReversePolishNotation.evaluate(iterativeMath,postFixArray));
				} catch (ArithmeticException e){
					result.setText("MATH ERROR");
				}
			} catch (MalformedPostfixException e){
				result.setText("FORMAT ERROR");
			}
		}
		else{
			result.setText(""+ReversePolishNotation.evaluate(recursiveMath,postFixArray));
		}
	}

	/*
	 * method bound to the << button adding << to the arraylist and displaying it
	 */
	public void shiftLeft(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" << ");
			entered.add(" << ");
		}
		else {
			operation.setText(operation.getText()+" << ");
			entered.add(" << ");
		}

	}

	/*
	 * method bound to the >> button adding >> to the arraylist and displaying it
	 */
	public void shiftRight(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			operation.setText(" >> ");
			entered.add(" >> ");
		}
		else {
			operation.setText(operation.getText()+" >> ");
			entered.add(" >> ");
		}

	}

	/*
	 * method bound to the recursion button that switches between modes
	 */
	public void recursion(ActionEvent event){//switches recursion
		if(useIterative){
			useIterative=false;
			btnRecursion.setText("Use Iterative");
		}
		else{
			useIterative=true;
			btnRecursion.setText("Use Recursion");
		}
	}//switches recursion


	/*
	 * method bound to the hide binary button that covers the binary with an image to hide it.
	 */
	public void datSolidSnakeShit(ActionEvent event){
		if(visibleBinary){
			visibleBinary=false;
			solidSnakeShit.setVisible(true);
			solidSnakeShit.setMouseTransparent(false);
		}
		else{
			visibleBinary=true;
			solidSnakeShit.setVisible(false);
			solidSnakeShit.setMouseTransparent(true);
		}
	}//covers binary

}