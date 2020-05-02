package khankazanraees.company;

public class Main {

    public static void main(String[] args) {

        //Enter a Number here
        String str = "1111";

        //Used to add another iteration
        str += "$";

        // Example: 8885 => Answer: 3815

        int counter = 1;
        String temp = "";

        char[] arr = str.toCharArray();
        int length = arr.length;

        for (int i = 1; i < length; i++) {

            if (arr[i] == arr[i - 1]) {
                counter++;
            } else {
                temp += counter;
                temp += arr[i - 1];
                counter = 1;
            }

        }

        System.out.println(temp);

    }


}
