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

public class Controller implements Initializable{
	
	boolean useIterative = true;
	boolean visibleBinary = true;

	@FXML
	private Label b0;

	@FXML
	private Label result;

	@FXML
	private Label operation;

	@FXML
	private Button btnRecursion;

	@FXML
	private Rectangle solidSnakeShit;

	@Override
	public void initialize(URL location, ResourceBundle resources){
		//idk why this is here
	}

	

	public void btn0Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("0");
		}
		else {

			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"0");
		}
	}		
	
	public void killMe(ActionEvent event) {
		System.out.println("MURDERER!");
		System.exit(0);
	}
	
	public void b0Pressed(ActionEvent event) {
		b0.setText("1");
	}

	public void clear(ActionEvent event) {
		operation.setText("OPERATION");
		result.setText("RESULT");
	}
	
	public void btn1Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("1");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"1");
		}
	}

	public void btn2Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("2");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"2");
		}
	}
	
	public void btn3Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("3");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"3");
		}
	}
	
	public void btn4Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("4");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"4");
		}
	}

	public void btn5Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("5");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"5");
		}
	}

	public void btn6Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("6");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"6");
		}
	}

	public void btn7Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("7");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"7");
		}
	}

	public void btn8Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("8");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"8");
		}
	}

	public void btn9Pressed(ActionEvent event) {
		if (operation.getText().equals("OPERATION")){
			operation.setText("9");
		}
		else{
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("!")){
				System.out.println("STOP TRYING TO BREAK EVERYTHING. Put another operation before adding numbers");
			}
			else operation.setText(operation.getText()+"9");
		}
	}

	public void backspace(ActionEvent event){
		if (operation.getText().length()==1||operation.getText().equals("OPERATION"))
			operation.setText("OPERATION");
		else {
			if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals(" ")){
				if(operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals(">")){
					operation.setText(operation.getText().substring(0,operation.getText().length()-4));
				}
				else operation.setText(operation.getText().substring(0,operation.getText().length()-3));
			}
			else operation.setText(operation.getText().substring(0,operation.getText().length()-1));
		}
	}

	public void division(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" / ");
	}

	public void multiplication(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" * ");
	}

	public void subtraction(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" - ");
	}

	public void addition(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" + ");
	}

	public void exponentiation(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" ^ ");
	}

	public void factorial(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" ! ");
	}

	public void calculate(ActionEvent event){
		//fact, exp, mul, div, add, sub
		String noose = operation.getText();
		if(!(Character.isDigit(noose.charAt(noose.length()-1))||noose.substring(noose.length()-1,noose.length()).equals("!")))
			result.setText("ERROR");
		else{

		}
	}

	public void shiftLeft(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" << ");

	}

	public void shiftRight(ActionEvent event){
		if (operation.getText().equals("OPERATION")/*||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals(">>")||operation.getText().substring(operation.getText().length()-2,operation.getText().length()).equals("<<")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")*/){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+" >> ");

	}

	public void recursion(ActionEvent event){
		if(useIterative){
			useIterative=false;
			btnRecursion.setText("Use Iterative");
		}
		else{
			useIterative=true;
			btnRecursion.setText("Use Recursion");
		}
	}

	public void datSolidSnakeShit(ActionEvent event){
		if(visibleBinary){
			visibleBinary=false;
			solidSnakeShit.setVisible(true);
		}
		else{
			visibleBinary=true;
			solidSnakeShit.setVisible(false);
		}
	}

}