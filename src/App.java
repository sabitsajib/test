import com.sun.source.tree.WhileLoopTree;

import javax.print.DocFlavor;


public class App {
    public static void main(String[] args){
        greet( " sabit" , "how area you today ?");

    }
    static void greet(String name , String question ){
        System.out.println("hello" + name + "!");
        System.out.println(question);

    }
}
























public class App {
    public static void main(String[] args) {
        int[] array = {5, 10, 7, 3, 15};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("The number of even elements in the array is: " + count);
    }
}




















//
//6.public class App{
//    public static void main(String[] args) {
//        int[] array = {5, 10, 7, 3, 15};
//
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                count++;
//            }
//        }
//
//        System.out.println("The number of odd elements in the array is: " + count);
//    }
//}






















//5.public class App {
//    public static void main(String[] args) {
//        int[] array = {5, 10, 7, 3, 15};
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        double average = (double) sum / array.length;
//
//        System.out.println("The average of elements in the array is: " + average);
//    }
//}




























//4.public class App {
//    public static void main(String[] args) {
//        int[] array = {5, 10, 7, 3, 15};
//
//        int smallest = array[0];
//        int largest = array[0];
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < smallest) {
//                smallest = array[i];
//            }
//
//            if (array[i] > largest) {
//                largest = array[i];
//            }
//        }
//
//        int sum = smallest + largest;
//        System.out.println("The smallest element in the array is: " + smallest);
//        System.out.println("The largest element in the array is: " + largest);
//        System.out.println("The sum of the smallest and largest elements is: " + sum);
//    }
//}


























//3,public class App{
//    public static void main(String[] args) {
//        int[] array = {5, 10, 7, 3, 15};
//
//        int smallest = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < smallest) {
//                smallest = array[i];
//            }
//        }
//
//        System.out.println("The smallest element in the array is: " + smallest);
//    }
//}


















//2.public class App {
//    public static void main(String[] args) {
//        int[] array = {5, 10, 7, 3, 15};
//
//        int largest = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > largest) {
//                largest = array[i];
//            }
//        }
//
//        System.out.println("The largest element in the array is: " + largest);
//    }
//}















public class App {
   public static void main(String[] args) {
       int[] array = {2, 4, 6, 8, 10};

       int sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum += array[i];
       }

       System.out.println("The sum of all elements in the array is: " + sum);
   }
}




















//public class App {
//    public static void main(String[] args) {



//        System.out.println("Loan Calculator".toUpperCase());
//        System.out.println();
//
//
//        int amount = 100;
//        int years = 5;
//        double interstRate = 10.0;
//
//        if (amount > 0 && years > 0 && interstRate > 0) {
//            System.out.println("calculating loan based on:");
//            System.out.println("Initial Amount:  " + amount);
//            System.out.println("Number of Years: " + years);
//            System.out.println("Interest Rate:   " + interstRate + "%");
//
//            double interestrateMultiplier = 1 + interstRate / 100;
//
//            double year1amountDue = amount * interestrateMultiplier;
//            double year2amountDue = year1amountDue * interestrateMultiplier;
//            double year3amountDue = year2amountDue * interestrateMultiplier;
//            double year4amountDue = year3amountDue * interestrateMultiplier;
//            double year5amountDue = year4amountDue * interestrateMultiplier;
//
//            String totalAmountDue = Double.toString(year5amountDue);
//            int indexOfDecimalPoint = totalAmountDue.indexOf(".");
//            String totalAmountDataFormatted = totalAmountDue.substring(0, indexOfDecimalPoint + 3);
//            System.out.println("Total Amount Due: " + totalAmountDataFormatted);
//
//        } else {
//            System.out.print("invalid value - can not calculate replacement amount ");


//        Boolean ishappy = true;
//        Boolean isRich = false;
//
//        if (ishappy && isRich) {
//            System.out.println("happy....");
//            System.out.println("happy");
//        }else  if (ishappy && !isRich){
//            System.out.println("money is nothing");
//        }else  if (ishappy && !isRich) {
//            System.out.println("money is nothing");
//        }else  if (ishappy && !isRich) {
//            System.out.println("money is nothing");
//        }
//            else {
//            System.out.println("bad....");


//         int choice = 99;
//
//         switch (choice){
//             case 1:
//                 System.out.println("you chose option 1 - load the file ");
//                 break;
//             case 2:
//                 System.out.println("you chose option 2 - save the file ");
//                 break;
//             case 3:
//                 System.out.println("you chose option 3 - Quitting - bye ");
//                 break;
//             default:
//                 System.out.println("try again");
//
//
//
//             }
//
//             System.out.println("Done");


//        String mood = "sad";
//
//        System.out.println(mood.equals("happy") ? ("I am happy too!") : ("sorry for everything"));







