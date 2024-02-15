package ru.artem.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

@SpringBootApplication
public class TodolistApplication {
	static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		int num1 = GetDigit();
		int num2 = GetDigit();
		char operation = GetOperation();
		int result = calc(num1,num2,operation);
		System.out.println("result "+result);
	}

	public static int GetDigit(){
		int num;

		try {
			num = inp.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error");
			inp.next();
			num = GetDigit();
		}

		return num;
	}

	public static char GetOperation(){
		char operation;

		try {
			operation = inp.next().charAt(0);
		} catch (NoSuchElementException e) {
			System.out.println("Error");
			inp.next();
			operation = GetOperation();
		}

		return operation;
	}

	public static int calc(int num1, int num2, char operation){
		int result;
		if(operation == '+'){
			result = num1 + num2;
		} else if(operation == '-'){
			result = num1 - num2;
		} else if(operation == '*'){
			result = num1 * num2;
		} else if(operation == '/'){
			result = num1 / num2;
		} else {
			System.out.println("Error");
			result = calc(num1, num2, GetOperation());
		}

		return result;
	}
}
