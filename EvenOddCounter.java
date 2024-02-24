//write a program to find the count of even numbers and odd numbers from 10 to 20

public class EvenOddCounter {
    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Count of even numbers from " + evenCount);
        System.out.println("Count of odd numbers from " + oddCount);
    }
}