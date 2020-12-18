
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("fizzbuzz "); //Printing fizzbuzz if number is divisible by both 3 and 5
            } else if (i % 5 == 0) {
                System.out.printf("buzz "); //Printing buzz if number is divisible 5
            } else if (i % 3 == 0) {
                System.out.printf("fizz "); //Printing fizz if number is divisible 3
            } else{
                System.out.printf("%d ", i); //Else printing the number itself

            } 
        }
        System.out.printf("\n");

	}

}
