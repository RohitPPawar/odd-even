package docker_test.Odd_even;

public class Main
{
    public static void main( String[] args )
    {
      System.out.println(chechInputIsEvenNumber(12));
    }
    
    public static boolean chechInputIsEvenNumber(int number) {
    	return number % 2 == 0;
    }
}
