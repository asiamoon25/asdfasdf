package algorithm;

import java.util.Scanner;

public class Thai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int thai = Integer.parseInt(scanner.next());

        int newYear = thai - 543;

        System.out.println(newYear);

    }
}
