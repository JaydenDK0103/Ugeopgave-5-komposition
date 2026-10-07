import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
/*
        // Opret bygning
        Building building = new Building("Kontorbygning");


        //Mødelokale

        Room meetingRoom = new Room("Mødelokale");

        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(60));
        meetingRoom.addLamp(new Lamp(100));

        meetingRoom.addWindow(new Window(120, 90));
        meetingRoom.addWindow(new Window(120, 90));

        building.addRoom(meetingRoom);


        //Køkken

        Room kitchen = new Room("Køkken");

        kitchen.addLamp(new Lamp(40));
        kitchen.addLamp(new Lamp(40));

        kitchen.addWindow(new Window(60, 60));

        building.addRoom(kitchen);


        //Kontor

        Room office = new Room("Kontor");

        office.addLamp(new Lamp(75));
        office.addLamp(new Lamp(75));
        office.addLamp(new Lamp(90));

        office.addWindow(new Window(100, 120));

        building.addRoom(office);


        // Print hele bygningen
        building.printBuilding();


        // Svar på spørgsmålene
        System.out.println();
        System.out.println("Hvor mange lamper er der i hele bygningen?");
        System.out.println(building.getTotalLampCount());

        System.out.println();

        System.out.println("Hvad er det samlede wattal?");
        System.out.println(building.getTotalWatt() + "W");

 */
        ArrayList<Animal> animals = new ArrayList<>();//Når du aldrig vil oprette et generisk `Animal` objekt direkte, kun specifikke typer som `Lion` og `Wolf`.
        animals.add(new Lion("Simba",150));
        animals.add(new Wolf("Grey",100));
        animals.add(new Rabbit("Bun",200));
        animals.add(new Wolf("Shadow",170));

        for (int i = 0; i < animals.size(); i += 2) {
            Animal a1 = animals.get(i);
            Animal a2 = animals.get(i + 1);

            Contest contest = new Contest(a1, a2);

            while (contest.getWinner() == null) {
                contest.playRound();
            }

            Animal winner = contest.getWinner();
            System.out.println("Vinder: " + winner.getName());
            System.out.println();
        }
    }
}

//Sp1 del 3
/*
Komposition (has-a):
Jeg bruger komposition, når jeg laver et Character-objekt og gemmer flere
Character-objekter i et Character[] team. Teamet består altså af flere
Character-objekter.

Nedarving (is-a):
Jeg bruger ikke nedarving i den kode, jeg har lavet. Jeg har kun klassen
Character, som bruges til både hero og Shadow.

Der er derfor heller ikke flere klasser, der ligner hinanden eller deler
felter og metoder. Hvis jeg senere skulle lave forskellige typer characters,
kunne de arve fra en fælles superklasse, som kunne hedde Character.
*/
