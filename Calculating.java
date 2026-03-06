public class Calculating {
    public static void main(String[] args) {

        int[] myArray = {4,7,3,5,1};  //

        int small = myArray[0]; //small=8

        for(int i = 1; i < myArray.length; i++){  //n
            if(myArray[i] < small){      //n-1
                small = myArray[i];      //n-1
                System.out.println(small);       //n-1
            }
        }

        System.out.println("Smallest value: " + small);
    }
}