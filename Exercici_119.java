import java.util.Scanner;

public class Exercici_119 {

    public static void main(String[] args) {

        final Scanner teclat = new Scanner(System.in);
        int exercit, total, temp;

        while (true) {
            exercit = teclat.nextInt();
            if (exercit == 0) break;
            total = 0;
            while (true) {
                if (exercit == 0) break;
                if (exercit < 4) { total += exercit * 5; break; }
                temp = (int) Math.sqrt(exercit);
                exercit -= (temp * temp);
                total += (temp - 2) * (temp - 2);
                total += (((temp - 2) * 4) * 2) + 12;
            }
            System.out.println( total );
            System.out.println("Hola sóc l'ivan Esteban02");
        }

    }

}
