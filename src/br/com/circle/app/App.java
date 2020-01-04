package br.com.circle.app;

import java.util.Scanner;

import br.com.circle.classes.Circle;

public class App {

    public static void main(String []args){
    
    	Circle c = new Circle();
        System.out.print("I`ve implemented: ");
        
        // Getting interface's name
        @SuppressWarnings("rawtypes")
		Class[] theInterfaces = c.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getSimpleName();
            System.out.println(interfaceName);
        }
        
        // user can type some number
        System.out.print("Please inform radius size and press <Enter>: ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble(); // converting typed number into double
        c.setRadius(n);
        //System.out.printf("%6.2f\n", c.area()); // formating to double(6,2)
        System.out.println(c.area());
      	sc.close();
    }

}
