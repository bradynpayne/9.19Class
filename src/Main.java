import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Keeper keeper = new Keeper();
//        Defender defender = new Defender();
//        keeper.go();
//        defender.go();

//        Friend friend1 = new Friend();
//        System.out.println(Friend.numOfFriends);
//        Friend friend2 = new Friend();
//        System.out.println(Friend.numOfFriends);

//        Student student1 = new Student(15, "Chris", false);
//        Student student2 = new Student(14, "Mike", true);

//        System.out.println(student1.attendance);
//        System.out.println(student2.name);

//        Human human1 = new Human("Brady", 65, 10);
//        human1.printAttributes();

//        HashMap<String, Integer> attendance = new HashMap<>();
//        attendance.put("Mike", 1);
//        attendance.put("Charlie", 3);
//        attendance.put("Jerald",5);
//        attendance.put("Jeff",6);
//
//        for(String i: attendance.keySet()) {
//            System.out.println(i);
//        }

//        HashMap<String, Boolean> attendance = new HashMap();
//        ArrayList<String> present = new ArrayList();
//        attendance.put("Mike", false);
//        attendance.put("Jeff", true);
//        attendance.put("Gerald", true);
//        attendance.put("Sam", false);
//
//        for(String i: attendance.keySet()) {
//            if (attendance.get(i) == true) {
//                present.add(i);
//            }
//        }
//        System.out.println(present);

//        try{
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter a whole number to divide");
//            int x = scanner.nextInt();
//            System.out.println("Enter a whole number to divide by");
//            int y = scanner.nextInt();
//            int z = x/y;
//            System.out.println("The result is:");
//            System.out.println(z);
//
//        } catch(ArithmeticException e) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Try again");
//            System.out.println("Enter a whole number to divide");
//            int x = scanner.nextInt();
//            System.out.println("Enter a whole number to divide by");
//            int y = scanner.nextInt();
//            System.out.print("The result is:");
//            int z = x/y;
//            System.out.println(z);
//
//        }

        Animal Rhino = new Animal("Joe");
        System.out.println(Rhino.getName());
        Rhino.setName("Bob");
        System.out.println(Rhino.getName());


    }
}