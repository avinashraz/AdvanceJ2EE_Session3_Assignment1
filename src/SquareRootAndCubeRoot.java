import java.util.Scanner;

public class SquareRootAndCubeRoot {Scanner scanner = new Scanner(System.in);
public double squareRoot(){
	double numberOne= scanner.nextDouble();
	double result = Math.sqrt(numberOne);
	return result;
}
public double cubeRoot(){
	double numberTwo= scanner.nextDouble();
	double result1 = Math.cbrt(numberTwo);
	return result1;
}
public static void main (String[] args){
	SquareRootAndCubeRoot sc = new SquareRootAndCubeRoot ();
	System.out.println("Enter value of number for which you want Square root");
	System.out.println("The Square root of given number is "+sc.squareRoot());
	System.out.println();
	System.out.println("Enter value of number for which you want Cube root");
	System.out.println("The Cube root of given number is "+sc.cubeRoot());
}

}
