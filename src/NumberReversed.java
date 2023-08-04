public class NumberReversed {

    public int reverse(int x) {

        int remainder = 0;
        long reversedNumber = 0;
        int finalNum = 0;
        System.out.println("Our original number is: " + x);

        //We're going to reverse the given integer x. Use modulus of the number to get
        //a remainder, and the remainder will be the first number of the reversed number.
        //We will then divide the number by 10 and continue until we reach 0 as our original number.
        while(x != 0){
            remainder = x % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            x = x / 10;

            if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
                return 0;
            }
        }
        System.out.println("Our reversed number is: " + reversedNumber);
        finalNum = (int)reversedNumber;
        return finalNum;
    }
}
