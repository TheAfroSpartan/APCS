/*
 * 
 * PURPOSE: Demonstrate our understanding math methods
 * 
 * @author: Andrew Owens
 * 
 * @version:10/29/18
 * 
 */
import java.util.Scanner;


public class CirclePoints {

	public static void main(String[] args){
		
		double value1;
		double value2;
		double value3;
		double value4;
		double value5;
		double value6;
		double value7;
		double value8;
		double value9;
		double value10;
		double value11;
		double value12;
		double value13;
		double value14;
		double value15;
		double value16;
		double value17;
		double value18;
		double value19;
		double value20;
		double value21;
		double value22;
		double value23;
		double value24;
		double value25;
		double value26;
		double value27;
		double value28;
		double value29;
		double value30;
		double value31;
		double value32;
		double value33;
		double value34;
		double value35;
		double value36;
		double value37;
		double value38;
		double value39;
		double value40;
		double value41;
		double value42;
		double value43;
		double value44;
		double value45;
		double value46;
		double value47;
		double value48;
		double value49;
		double value50;
		double value51;
		double value52;
		double value53;
		double value54;
		double value55;
		double value56;
		double value57;
		double value58;
		double value59;
		
		double yValue;
		double xValue1;
		double xValue2;
		double xValue3;
		double xValue4;
		double xValue5;
		double xValue6;
		double xValue7;
		double xValue8;
		double xValue9;
		double xValue10;
		double xValue11;
		double xValue12;
		double xValue13;
		double xValue14;
		double xValue15;
		double xValue16;
		double xValue17;
		double xValue18;
		double xValue19;
		double xValue20;
	
		Scanner userin = new Scanner(System.in);
		
		System.out.println("Please enter the radius.");
		double radius = userin.nextDouble();
		
		System.out.println("Please enter the x value");
		double xValue = userin.nextDouble();
		
		System.out.println("Please enter the increment");
		double increment = userin.nextDouble();
		
		System.out.println("Points on a Circle with a Radius of " + radius);
		System.out.printf("%5s", "x1");
		System.out.printf("%8s", "y1");
		System.out.printf("%8s", "x1");
		System.out.printf("%8s%n", "y2");
		System.out.println("****************************************");
		
		value1 = Math.pow(radius, 2);
		value2 = Math.pow(xValue, 2);
		value3 = Math.abs(value1 - value2);
		yValue = Math.sqrt(value3);
		
		System.out.printf("%6.2f\t" , xValue);
		System.out.printf("%6.2f\t", yValue);
		System.out.printf("%6.2f\t" , xValue);
		System.out.printf("%6.2f%n",  yValue);
		
		xValue1 = xValue - increment;
		xValue2 = xValue1 - increment;
		xValue3 = xValue2 - increment;
		xValue4 = xValue3 - increment;
		xValue5 = xValue4 - increment;
		xValue6 = xValue5 - increment;
		xValue7 = xValue6 - increment;
		xValue8 = xValue7 - increment;
		xValue9 = xValue8 - increment;
		xValue10 = xValue9 - increment;
		xValue11 = xValue10 - increment;
		xValue12 = xValue11 - increment;
		xValue13 = xValue12 - increment;
		xValue14 = xValue13 - increment;
		xValue15 = xValue14 - increment;
		xValue16 = xValue15 - increment;
		xValue17 = xValue16 - increment;
		xValue18 = xValue17 - increment;
		xValue19 = xValue18 - increment;
		xValue20 = xValue19 - increment;
		
			value1 = Math.pow(radius, 2);
			value2 = Math.pow(xValue1, 2);
			value3 = Math.abs(value1 - value2);
			yValue = Math.sqrt(value3);
			
			System.out.printf("%6.2f\t" , xValue1);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue1);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value4 = Math.pow(radius, 2);
			value5 = Math.pow(xValue2, 2);
			value6 = Math.abs(value4 - value5);
			yValue = Math.sqrt(value6);
			
			System.out.printf("%6.2f\t" , xValue2);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue2);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value7 = Math.pow(radius, 2);
			value8 = Math.pow(xValue3, 2);
			value9 = Math.abs(value7 - value8);
			yValue = Math.sqrt(value9);
			
			System.out.printf("%6.2f\t" , xValue3);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue3);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value10 = Math.pow(radius, 2);
			value11 = Math.pow(xValue4, 2);
			value12 = Math.abs(value10 - value11);
			yValue = Math.sqrt(value12);
			
			System.out.printf("%6.2f\t" , xValue4);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue4);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value13 = Math.pow(radius, 2);
			value14 = Math.pow(xValue5, 2);
			value15 = Math.abs(value13 - value14);
			yValue = Math.sqrt(value15);
			
			System.out.printf("%6.2f\t" , xValue5);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue5);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value16 = Math.pow(radius, 2);
			value17 = Math.pow(xValue6, 2);
			value18 = Math.abs(value16 - value17);
			yValue = Math.sqrt(value18);
			
			System.out.printf("%6.2f\t" , xValue6);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue6);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value19 = Math.pow(radius, 2);
			value20 = Math.pow(xValue7, 2);
			value21 = Math.abs(value19 - value20);
			yValue = Math.sqrt(value21);
			
			System.out.printf("%6.2f\t" , xValue7);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue7);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value22 = Math.pow(radius, 2);
			value23 = Math.pow(xValue8, 2);
			value24 = Math.abs(value22 - value23);
			yValue = Math.sqrt(value24);
			
			System.out.printf("%6.2f\t" , xValue8);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue8);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value25 = Math.pow(radius, 2);
			value26 = Math.pow(xValue9, 2);
			value27 = Math.abs(value25 - value26);
			yValue = Math.sqrt(value27);
			
			System.out.printf("%6.2f\t" , xValue9);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue9);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value28 = Math.pow(radius, 2);
			value29 = Math.pow(xValue10, 2);
			value30 = Math.abs(value28 - value29);
			yValue = Math.sqrt(value30);
			
			System.out.printf("%6.2f\t" , xValue10);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue10);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value31 = Math.pow(radius, 2);
			value32 = Math.pow(xValue11, 2);
			value33 = Math.abs(value31 - value32);
			yValue = Math.sqrt(value33);
			
			System.out.printf("%6.2f\t" , xValue11);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue11);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value34 = Math.pow(radius, 2);
			value35 = Math.pow(xValue12, 2);
			value36 = Math.abs(value34 - value35);
			yValue = Math.sqrt(value36);
			
			System.out.printf("%6.2f\t" , xValue12);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue12);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value37 = Math.pow(radius, 2);
			value38 = Math.pow(xValue13, 2);
			value39 = Math.abs(value37 - value38);
			yValue = Math.sqrt(value39);
			
			System.out.printf("%6.2f\t" , xValue13);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue13);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value40 = Math.pow(radius, 2);
			value41 = Math.pow(xValue14, 2);
			value42 = Math.abs(value40 - value41);
			yValue = Math.sqrt(value42);
			
			System.out.printf("%6.2f\t" , xValue14);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue14);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value42 = Math.pow(radius, 2);
			value43 = Math.pow(xValue15, 2);
			value44 = Math.abs(value42 - value43);
			yValue = Math.sqrt(value44);
			
			System.out.printf("%6.2f\t" , xValue15);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue15);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value45 = Math.pow(radius, 2);
			value46 = Math.pow(xValue16, 2);
			value47 = Math.abs(value45 - value46);
			yValue = Math.sqrt(value47);
			
			System.out.printf("%6.2f\t" , xValue16);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue16);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value48 = Math.pow(radius, 2);
			value49 = Math.pow(xValue17, 2);
			value50 = Math.abs(value48 - value49);
			yValue = Math.sqrt(value50);
			
			System.out.printf("%6.2f\t" , xValue17);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue17);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value51 = Math.pow(radius, 2);
			value52 = Math.pow(xValue18, 2);
			value53 = Math.abs(value51 - value52);
			yValue = Math.sqrt(value53);
			
			System.out.printf("%6.2f\t" , xValue18);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue18);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value54 = Math.pow(radius, 2);
			value55 = Math.pow(xValue19, 2);
			value56 = Math.abs(value54 - value55);
			yValue = Math.sqrt(value56);
			
			System.out.printf("%6.2f\t" , xValue19);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue19);
			System.out.printf("%2s","-");
			System.out.printf("%.2f%n",  yValue);
			
			value57 = Math.pow(radius, 2);
			value58 = Math.pow(xValue20, 2);
			value59 = Math.abs(value57 - value58);
			yValue = Math.sqrt(value59);
			
			System.out.printf("%6.2f\t" , xValue20);
			System.out.printf("%6.2f\t", yValue);
			System.out.printf("%6.2f\t" , xValue20);
			System.out.printf("%6.2f%n",  yValue);
	}

}
