package demo.lab3.Exam2;

public class String {
    public static void main(String[] args) {
        // 2 String;
        //Declare variable String name
        java.lang.String names;
        //Assign "Learn Java By Example" to variable name
        names="Learn Java By Example";
        //get length of string;
        System.out.printf("%d\n",names.length());
        //Compare name with "learn"
        if (names.equals("learn")){
            System.out.printf("true\n");
        }else {
            System.out.printf("false\n");
        }
        if (names.equals("Learn Java By Example")){
            System.out.printf("True\n");
        }else {
            System.out.printf("false\n");
        }
        //Compare name with a string insensitive
        if (names.equalsIgnoreCase("Learn Java BY EXAMPLE")){
            System.out.printf("True\n");
        }else {
            System.out.printf("false\n");
        }
    }
}
