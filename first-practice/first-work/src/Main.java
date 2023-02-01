public class Main {
    public static void main(String[] args) {
//     Addition
        System.out.println(3 + 3);
//        Multiplication
        System.out.println(5 * 10);
//        Division
        System.out.println(40 / 5);
//        Remainder
        System.out.println(11 % 2);
//        String
        String name = "Esrat";
        System.out.println(name);
//        Adding string Variables
        String firstName = "Esrat";
        String lastName = "Hossan";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
//        Adding integer variable
        int x = 10;
        int y = 40;
        System.out.println(x + y);
//        Declare same type variable multiple time
        int a = 10, b = 40, c = 50;
        System.out.println(a+b+c);
//        Widening Casting
        int myInt = 8;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
//        Boolean Expression
        int myAge = 23;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        }
            else{
                System.out.println("Not old enough to vote!");
            }
//            If Else Conditions
        int time = 30;
            if (time < 18){
                System.out.println("Good Morning");
            }
            else{
                System.out.println("Good Evening");
            }



    }
}