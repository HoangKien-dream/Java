package demo.lab3.Exam1;

public class Arrays {
    public static void main(String[] args) {
        // 1 Arrays;
        //Declare an array of String;
        String name[];
        //Declare an array of int;
        int ages[];
        //Assign an array of int (length = 5) to array ages
        ages = new int[5];
        //Get length of ages
        System.out.printf("%d\n",ages.length);
        //Access element at index 5 of ages
//        ages[5]=5; // số index= số mảng - 1; => không có index tại vị trí thứ 5
        //Acces elêmnt at index 2 of ages
        ages[2]=102;
        System.out.printf("%d\n", ages[2]);
    }
}
