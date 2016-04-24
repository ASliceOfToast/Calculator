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
import javafx.scene.input.MouseEvent;

public class Controller implements Initializable{
	
	ArrayList<String> entered = new ArrayList<String>();
	boolean useIterative = true;
	boolean visibleBinary = true;
	IterativeMath iterativeMath = new IterativeMath();
	RecursiveMath recursiveMath = new RecursiveMath();
	int answer=0;
	String bString="0000000000000000000000000000000";

	@FXML
	private Label b0;
	@FXML
	private Label b1;
	@FXML
	private Label b2;
	@FXML
	private Label b3;
	@FXML
	private Label b4;
	@FXML
	private Label b5;
	@FXML
	private Label b6;
	@FXML
	private Label b7;
	@FXML
	private Label b8;
	@FXML
	private Label b9;
	@FXML
	private Label b10;
	@FXML
	private Label b11;
	@FXML
	private Label b12;
	@FXML
	private Label b13;
	@FXML
	private Label b14;
	@FXML
	private Label b15;
	@FXML
	private Label b16;
	@FXML
	private Label b17;
	@FXML
	private Label b18;
	@FXML
	private Label b19;
	@FXML
	private Label b20;
	@FXML
	private Label b21;
	@FXML
	private Label b22;
	@FXML
	private Label b23;
	@FXML
	private Label b24;
	@FXML
	private Label b25;
	@FXML
	private Label b26;
	@FXML
	private Label b27;
	@FXML
	private Label b28;
	@FXML
	private Label b29;
	@FXML
	private Label b30;
	
	
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
	
	/*
	 * Method clears and resets operation and result while also clearing the entered arraylist
	 */
	public void clear(ActionEvent event) {
		operation.setText("OPERATION");
		result.setText("RESULT");
		entered.clear();
		answer = 0;
		bString ="0000000000000000000000000000000";
		b0.setText(""+bString.charAt(30));
		b1.setText(""+bString.charAt(29));
		b2.setText(""+bString.charAt(28));
		b3.setText(""+bString.charAt(27));
		b4.setText(""+bString.charAt(26));
		b5.setText(""+bString.charAt(25));
		b6.setText(""+bString.charAt(24));
		b7.setText(""+bString.charAt(23));
		b8.setText(""+bString.charAt(22));
		b9.setText(""+bString.charAt(21));
		b10.setText(""+bString.charAt(20));
		b11.setText(""+bString.charAt(19));
		b12.setText(""+bString.charAt(18));
		b13.setText(""+bString.charAt(17));
		b14.setText(""+bString.charAt(16));
		b15.setText(""+bString.charAt(15));
		b16.setText(""+bString.charAt(14));
		b17.setText(""+bString.charAt(13));
		b18.setText(""+bString.charAt(12));
		b19.setText(""+bString.charAt(11));
		b20.setText(""+bString.charAt(10));
		b21.setText(""+bString.charAt(9));
		b22.setText(""+bString.charAt(8));
		b23.setText(""+bString.charAt(7));
		b24.setText(""+bString.charAt(6));
		b25.setText(""+bString.charAt(5));
		b26.setText(""+bString.charAt(4));
		b27.setText(""+bString.charAt(3));
		b28.setText(""+bString.charAt(2));
		b29.setText(""+bString.charAt(1));
		b30.setText(""+bString.charAt(0));
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
		
		
		int temp=0;
		try{
			if(useIterative){
				result.setText(""+ReversePolishNotation.evaluate(iterativeMath,postFixArray));
				answer = ReversePolishNotation.evaluate(iterativeMath,postFixArray);
			}
			else{
				answer = ReversePolishNotation.evaluate(iterativeMath,postFixArray);
				result.setText(""+ReversePolishNotation.evaluate(recursiveMath,postFixArray));
			}
		}
		catch(MalformedPostfixException gay){
			result.setText("FORMAT ERROR");
		}
		catch(ArithmeticException alsogay){
			result.setText("MATH ERROR");
		}
		catch(StackOverflowError gayest){
			result.setText("DOWNLOAD MORE RAM");
		}
		bString = Integer.toBinaryString(answer);
		temp = 31-bString.length();
		for(int i=0;i<temp;i++){
			bString="0"+bString;
		}
		
		b0.setText(""+bString.charAt(30));
		b1.setText(""+bString.charAt(29));
		b2.setText(""+bString.charAt(28));
		b3.setText(""+bString.charAt(27));
		b4.setText(""+bString.charAt(26));
		b5.setText(""+bString.charAt(25));
		b6.setText(""+bString.charAt(24));
		b7.setText(""+bString.charAt(23));
		b8.setText(""+bString.charAt(22));
		b9.setText(""+bString.charAt(21));
		b10.setText(""+bString.charAt(20));
		b11.setText(""+bString.charAt(19));
		b12.setText(""+bString.charAt(18));
		b13.setText(""+bString.charAt(17));
		b14.setText(""+bString.charAt(16));
		b15.setText(""+bString.charAt(15));
		b16.setText(""+bString.charAt(14));
		b17.setText(""+bString.charAt(13));
		b18.setText(""+bString.charAt(12));
		b19.setText(""+bString.charAt(11));
		b20.setText(""+bString.charAt(10));
		b21.setText(""+bString.charAt(9));
		b22.setText(""+bString.charAt(8));
		b23.setText(""+bString.charAt(7));
		b24.setText(""+bString.charAt(6));
		b25.setText(""+bString.charAt(5));
		b26.setText(""+bString.charAt(4));
		b27.setText(""+bString.charAt(3));
		b28.setText(""+bString.charAt(2));
		b29.setText(""+bString.charAt(1));
		b30.setText(""+bString.charAt(0));
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

	/*
	 * Toggles binary label 0 and changes result accordingly.
	 */
	public void b0(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(30))==0){
			int temp=0;
			b0.setText("1");
			answer+=1;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b0.setText("0");
			answer-=1;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 1 and changes result accordingly.
	 */
	public void b1(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(29))==0){
			int temp=0;
			b1.setText("1");
			answer+=2;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b1.setText("0");
			answer-=2;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 2 and changes result accordingly.
	 */
	public void b2(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(28))==0){
			int temp=0;
			b2.setText("1");
			answer+=4;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b2.setText("0");
			answer-=4;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 3 and changes result accordingly.
	 */
	public void b3(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(27))==0){
			int temp=0;
			b3.setText("1");
			answer+=8;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b3.setText("0");
			answer-=8;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 4 and changes result accordingly.
	 */
	public void b4(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(26))==0){
			int temp=0;
			b4.setText("1");
			answer+=16;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b4.setText("0");
			answer-=16;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 5 and changes result accordingly.
	 */
	public void b5(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(25))==0){
			int temp=0;
			b5.setText("1");
			answer+=32;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b5.setText("0");
			answer-=32;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 6 and changes result accordingly.
	 */
	public void b6(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(24))==0){
			int temp=0;
			b6.setText("1");
			answer+=64;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b6.setText("0");
			answer-=64;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 7 and changes result accordingly.
	 */
	public void b7(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(23))==0){
			int temp=0;
			b7.setText("1");
			answer+=128;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b7.setText("0");
			answer-=128;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 8 and changes result accordingly.
	 */
	public void b8(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(22))==0){
			int temp=0;
			b8.setText("1");
			answer+=256;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b8.setText("0");
			answer-=256;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 9 and changes result accordingly.
	 */
	public void b9(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(21))==0){
			int temp=0;
			b9.setText("1");
			answer+=512;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b9.setText("0");
			answer-=512;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 10 and changes result accordingly.
	 */
	public void b10(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(20))==0){
			int temp=0;
			b10.setText("1");
			answer+=1024;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b10.setText("0");
			answer-=1024;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 11 and changes result accordingly.
	 */
	public void b11(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(19))==0){
			int temp=0;
			b11.setText("1");
			answer+=2048;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b11.setText("0");
			answer-=2048;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 12 and changes result accordingly.
	 */
	public void b12(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(18))==0){
			int temp=0;
			b12.setText("1");
			answer+=4096;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b12.setText("0");
			answer-=4096;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 13 and changes result accordingly.
	 */
	public void b13(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(17))==0){
			int temp=0;
			b13.setText("1");
			answer+=8192;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b13.setText("0");
			answer-=8192;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 14 and changes result accordingly.
	 */
	public void b14(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(16))==0){
			int temp=0;
			b14.setText("1");
			answer+=16384;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b14.setText("0");
			answer-=16384;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 15 and changes result accordingly.
	 */
	public void b15(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(15))==0){
			int temp=0;
			b15.setText("1");
			answer+=32768;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b15.setText("0");
			answer-=32768;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 16 and changes result accordingly.
	 */
	public void b16(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(14))==0){
			int temp=0;
			b16.setText("1");
			answer+=65536;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b16.setText("0");
			answer-=65536;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 17 and changes result accordingly.
	 */
	public void b17(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(13))==0){
			int temp=0;
			b17.setText("1");
			answer+=131072;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b17.setText("0");
			answer-=131072;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 18 and changes result accordingly.
	 */
	public void b18(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(12))==0){
			int temp=0;
			b18.setText("1");
			answer+=262144;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b18.setText("0");
			answer-=262144;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 19 and changes result accordingly.
	 */
	public void b19(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(11))==0){
			int temp=0;
			b19.setText("1");
			answer+=524288;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b19.setText("0");
			answer-=524288;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 20 and changes result accordingly.
	 */
	public void b20(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(10))==0){
			int temp=0;
			b20.setText("1");
			answer+=1048576;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b20.setText("0");
			answer-=1048576;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}
	/*
	 * Toggles binary label 21 and changes result accordingly.
	 */
	public void b21(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(9))==0){
			int temp=0;
			b21.setText("1");
			answer+=2097152;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b21.setText("0");
			answer-=2097152;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 22 and changes result accordingly.
	 */
	public void b22(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(8))==0){
			int temp=0;
			b22.setText("1");
			answer+=4194304;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b22.setText("0");
			answer-=4194304;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 23 and changes result accordingly.
	 */
	public void b23(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(7))==0){
			int temp=0;
			b23.setText("1");
			answer+=8388608;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b23.setText("0");
			answer-=8388608;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

		/*
	 * Toggles binary label 04 and changes result accordingly.
	 */
	public void b24(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(6))==0){
			int temp=0;
			b24.setText("1");
			answer+=16777216;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b24.setText("0");
			answer-=16777216;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 25 and changes result accordingly.
	 */
	public void b25(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(5))==0){
			int temp=0;
			b25.setText("1");
			answer+=33554432;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b25.setText("0");
			answer-=33554432;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 26 and changes result accordingly.
	 */
	public void b26(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(4))==0){
			int temp=0;
			b26.setText("1");
			answer+=67108864;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b26.setText("0");
			answer-=67108864;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}
	
	/*
	 * Toggles binary label 27 and changes result accordingly.
	 */
	public void b27(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(3))==0){
			int temp=0;
			b27.setText("1");
			answer+=134217728;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b27.setText("0");
			answer-=134217728;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 28 and changes result accordingly.
	 */
	public void b28(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(2))==0){
			int temp=0;
			b28.setText("1");
			answer+=268435456;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b28.setText("0");
			answer-=268435456;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 29 and changes result accordingly.
	 */
	public void b29(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(1))==0){
			int temp=0;
			b29.setText("1");
			answer+=536870912;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b29.setText("0");
			answer-=536870912;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}

	/*
	 * Toggles binary label 30 and changes result accordingly.
	 */
	public void b30(MouseEvent event){
		if(Character.getNumericValue(bString.charAt(0))==0){
			int temp=0;
			b30.setText("1");
			answer+=1073741824;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
		else{
			int temp=0;
			b30.setText("0");
			answer-=1073741824;
			bString = Integer.toBinaryString(answer);
			temp = 31-bString.length();
			for(int i=0;i<temp;i++){
				bString="0"+bString;
			}
			result.setText(""+answer);
		}
	}


}