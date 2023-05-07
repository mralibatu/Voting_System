public class Main {
    public static void main(String[] args) {
        Party[] parties = new Party[3];

        parties[0] = new Party("A",0);
        parties[1] = new Party("B",1);
        parties[2] = new Party("C",2);

        Person[] allperson = new Person[5];

        System.out.println("1. citizen : ");
        allperson[0] = new Turkish("Batuhan",21);
        allperson[0].Vote(0,parties);

        System.out.println("2. citizen : ");
        allperson[1] = new Foreign("Andrew",23);
        allperson[1].Vote(1,parties);

        System.out.println("3. citizen : ");
        allperson[2] = new Turkish("Ali",60);
        allperson[2].Vote(2,parties);

        System.out.println("4. citizen : ");
        allperson[3] = new Turkish("Murat",55);

        System.out.println("5. citizen : ");
        allperson[4] = new Turkish("Dogukan",12);
        allperson[4].Vote(2,parties);



        for (int i = 0; i < allperson.length; i++) {
            allperson[i].PrintInfo();
            System.out.println();
        }
        System.out.println("\n\n");
        for (int i = 0; i < parties.length; i++) {
            parties[i].PrintInfo();
            System.out.println();
        }
    }
}
