import java.util.Scanner;

class MainApp {
    public static void main(String args[]) {
        new get("Tom", 14, 06, 1997,25, "tomHanders@gmail.com", 442131456,
                "Handers", 72, 105, 2543 )
                .printAccountInfo();


        System.out.println("|----------------------------------------|");
        new get("Brian", 26, 02, 1984,38, "Brian234Davis@gmail.com", 441412532,
                "Davis", 78, 131, 5673)
                .printAccountInfo();


        System.out.println("|----------------------------------------|");

        get edit = new get("Travis", 31, 04, 1991,31, "tavisSCOTT@gmail.com", 443890456,
                "Scott", 67, 123, 15387);


        edit.printAccountInfo();
        System.out.println("!!!!!!!!!!!!!!!!!!");
        System.out.println(" Not edit Account");
        System.out.println("!!!!!!!!!!!!!!!!!!");
        System.out.println("------------------------------------------");


        edit.setSurname("Scopp");
        edit.setWeight(70);
        edit.setPressure(115);
        edit.setSteps(7892);
        edit.printAccountInfo();


        System.out.println("!!!!!!!!!!!!!!!!!");
        System.out.println("  Account Edit");
        System.out.println("!!!!!!!!!!!!!!!!!");
    }

}

