package com.Currency_Converter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Currency_Converter {

	 public static void main(String[] args) {
	        double rupee,dollar,pound,code,euro,KWD;
	        DecimalFormat f=new DecimalFormat("##.###");
	        Scanner nobi=new Scanner(System.in);
	        System.out.println("*** Welcome to Webeduclick Currency Converter project *** \n 1.Rupees \n 2.Dollar \n 3.Pound \n 4.Euro \n 5.Kuwaiti dinar");
	        System.err.print(" Enter the currency code = ");
	        code=nobi.nextInt();
	        if(code== 1){
	            System.err.println("enter amount in repees: ");
	            rupee=nobi.nextDouble();
	            dollar=rupee/77.34;
	            System.out.println("Dollar : " +f.format(dollar));
	            pound =rupee/94.46;
	            System.out.println("pound : " +f.format(pound));
	            euro =rupee/80.36;
	            System.out.println("Euro : " +f.format(euro));
	            KWD =rupee/251.92;
	            System.out.println("Kuwaiti dinar :" +f.format(KWD));
	            
	        }
	        else if( code == 2){
	            System.err.println("enter amount in dollar :");
	            dollar =nobi.nextDouble();
	            rupee=dollar *77.34;
	            System.out.println("Rupees :" +f.format(rupee));
	            pound =dollar * 0.82;
	            System.out.println("Pound :" +f.format(pound));
	            euro =dollar * 0.96;
	            System.out.println("Euro : " +f.format(euro));
	            KWD =dollar * 0.31;
	            System.out.println("Kuwaiti dinar :" +f.format(KWD));
	           
	        }
	        else if(code == 3){
	            System.err.println("enter amount in pound:");
	            pound = nobi.nextDouble();
	            rupee=pound *94.43;
	            System.out.println("Rupees :" +f.format(rupee));
	            dollar =pound * 1.22;
	            System.out.println("dollar :" +f.format(dollar));
	            euro =pound * 1.17;
	            System.out.println("Euro : " +f.format(euro));
	            KWD =pound * 0.3748;
	            System.out.println("Kuwaiti dinar :" +f.format(KWD));
	           
	        }
	        else if(code == 4){
	            System.err.println("enter amount in Euro:");
	            euro = nobi.nextDouble();
	            rupee=euro *80.43;
	            System.out.println("Rupees :" +f.format(rupee));
	            dollar =euro * 1.04;
	            System.out.println("dollar :" +f.format(dollar));
	            pound =euro * 0.85;
	            System.out.println("pound : " +f.format(pound));
	            KWD =euro * 0.318949;
	            System.out.println("Kuwaiti dinar :" +f.format(KWD));
	        }
	        else if(code == 5){
	            System.err.println("enter amount in KWD:");
	            KWD = nobi.nextDouble();
	            rupee=KWD *251.96;
	            System.out.println("Rupees :" +f.format(rupee));
	            dollar =KWD * 3.26;
	            System.out.println("dollar :" +f.format(dollar));
	            pound =KWD * 2.67;
	            System.out.println("pound : " +f.format(pound));
	            euro=KWD * 3.13;
	            System.out.println("Euro :" +f.format(euro));            
	            
	        }
	        
	        else
	             System.err.println("Invaild Code!");
	        System.err.println("Process finished with exit code 0");
	        nobi.close();
	    }
}
