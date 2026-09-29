public class Main {
    public static void main(String[] args) {

        animal lion = new animal("Felidae", "Simba", 5, true);
        animal dolphin = new animal("Delphinidae", "Flipper", 8, true);
        animal eagle = new animal("Accipitridae", "Aquila", 3, false);


        /*zoo myZoo = new zoo("Belvedere", "Tunis", 20);*/
        zoo myZoo = new zoo("Belvedere", "Tunis");

        myZoo.displayzoo();


        System.out.println(myZoo);
        System.out.println(myZoo.toString());


        System.out.println(lion);
        System.out.println(dolphin);
        System.out.println(eagle);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dolphin));
        System.out.println(myZoo.addAnimal(eagle));


        for (int i = 1; i < 30; i++) {
            animal a = new animal("Test", "Animal" + i, i, true);
            boolean ok = myZoo.addAnimal(a);
            if (!ok) {
                System.out.println("Ajout impossible : " + a.name + " (zoo plein)");
            }
        }
        System.out.println("Nombre d'animaux : " + myZoo.animalCount);

        myZoo.afficheranimaux();


        System.out.println("Recherche du lion : " + myZoo.searchanimals(lion));


        animal lion2 = new animal("Felidae", "Simba", 5, true);
        System.out.println("Recherche du lion2 : " + myZoo.searchanimals(lion2));

        animal panda = new animal("Ursidae", "Panda", 4, true);
        System.out.println("Recherche du panda : " + myZoo.searchanimals(panda));



        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion));

        animal lion3 = new animal("Felidae", "akaza", 5, true);
        System.out.println(myZoo.addAnimal(lion3));


        for (int i = 1; i <= 30; i++) {
            animal a = new animal("Test", "Animal" + i, i, true);
            if (!myZoo.addAnimal(a)) {
                System.out.println("Refusé : " + a.name);
            }
        }
        System.out.println("Nombre d'animaux : " + myZoo.animalCount);
        myZoo.afficheranimaux();


        System.out.println("Suppression de dolphin : " + myZoo.removeAnimal(dolphin));
        System.out.println("Suppression de dolphin encore : " + myZoo.removeAnimal(dolphin));
        System.out.println("Suppression du panda : " + myZoo.removeAnimal(panda));
        myZoo.afficheranimaux();



        zoo zoo2 = new zoo("Friguia Park", "Sousse");
        zoo2.addAnimal(new animal("Felidae", "Panthere", 5, true));
        zoo2.addAnimal(new animal("Hominidae", "Singe", 3, true));

        zoo zoo3 = new zoo("Hammamet Zoo", "Nabeul");


        System.out.println("myZoo plein ? " + myZoo.isZooFull());
        System.out.println("zoo2 plein ? " + zoo2.isZooFull());

        zoo plusGrand = myZoo.comparerZoo(myZoo, zoo2);
        System.out.println("Plus grand (myZoo vs zoo2) : " + plusGrand.name);

        plusGrand = myZoo.comparerZoo(zoo2, zoo3);
        System.out.println("Plus grand (zoo2 vs zoo3)  : " + plusGrand.name);
    }
}