import java.util.Random;

public class Fight {

    // Инициировать битву
    public static void fight(Warrior warrior1, Warrior warrior2){

        while(warrior1.getHealth() > 0 && warrior2.getHealth() > 0){

            Random r = new Random();
            int whoBeats = r.nextInt(2) + 1;

            if(whoBeats % 2 == 0){
                warrior2.beat(warrior1);
                System.out.println("Юнит '2' атакует! "
                        + "\n Здоровье Юнита '1' : " + warrior1.getHealth());
            }
            else {
                warrior1.beat(warrior2);
                System.out.println("Юнит '1' атакует! "
                        + "\n Здоровье Юнита '2' : " + warrior2.getHealth());
            }

        }

        if (warrior1.getHealth() > 0) System.out.println("Победу одержал Юнит '1' !!!");
        else System.out.println("Победу одержал Юнит '2' !!!");

    }

}
