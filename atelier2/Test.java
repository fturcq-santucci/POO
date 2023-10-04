package atelier2;

public class Test {

    public static void main(String[] args){

        Personne plusJeune = new Personne("Super", "Mario", 15 , 05, 2000, 01, "je", "20000", "saisPas");
        Personne plusVieux = new Personne("Super", "Luigi", 10 , 11, 1500, 01, "je", "20000", "saisPas");

        System.out.println("-------------------------------------------------------------------------------");


        System.out.print(plusJeune.plusAgeQue(plusVieux));

        System.out.println("                    ");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.print(plusJeune.plusAge(plusVieux,plusJeune));

        System.out.println("                    ");
        System.out.println("--------------------------------------------------------------------------------");
    }
    
}
