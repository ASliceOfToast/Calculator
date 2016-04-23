package main.java.cs1302.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller implements Initializable{

	private int res = 0;
	private String op = null;
	
	@FXML
	private Label b0;

	@FXML
	private Label result;

	@FXML
	private Label operation;

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
		res = 0;
		op = null;
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
		else operation.setText(operation.getText().substring(0,operation.getText().length()-1));
	}

	public void division(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"/");
	}

	public void multiplication(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"*");
	}

	public void subtraction(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"-");
	}

	public void addition(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"+");
	}

	public void exponentiation(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"^");
	}

	public void factorial(ActionEvent event){
		if (operation.getText().equals("OPERATION")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("^")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("/")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("*")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("-")||operation.getText().substring(operation.getText().length()-1,operation.getText().length()).equals("+")){
			System.out.println("STOP TRYING TO BREAK EVERYTHING");
		}
		else operation.setText(operation.getText()+"!");
	}


}