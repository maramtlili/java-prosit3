public class zoo {

    animal[] animals;
    String name;
    String city;
    /*int nbrCages;*/
    final int nbrCages = 25;
    int animalCount;


   /* public zoo(String name, String city, int nbrCages ) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new animal[25];
    }*/
   public zoo(String name, String city) {
       this.name = name;
       this.city = city;
       this.animals = new animal[nbrCages];
   }


    public void displayzoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }


    @Override
    public String toString() {
        return "Zoo : " + name + ", ville : " + city + ", cages : " + nbrCages;
    }

   /* public boolean addAnimal(animal a) {
        if (animalCount >= animals.length)
        {
            return false;
        }
        animals[animalCount] = a;
        animalCount++;
        return true;
    }*/
   public boolean addAnimal(animal a) {
       // Capacité maximale : zoo plein
       if (animalCount >= nbrCages) {
           return false;
       }
       // Unicité : cet animal existe déjà dans le zoo
       if (searchanimals(a) != -1) {
           return false;
       }
       animals[animalCount] = a;
       animalCount++;
       return true;
   }
    public void afficheranimaux()
    {
        System.out.println("Animaux du zoo " + name + " (" + animalCount + "/" + nbrCages + ") :");
        if (animalCount == 0) {
            System.out.println("  (aucun animal)");
            return ;
        }
        for (int i = 0; i < animalCount; i++) {
            System.out.println("  " + i + " -> " + animals[i]);
        }

    }

   /*public int searchanimals( animal a)
    {
        for(int i=0 ; i < animalCount ;i++) {
            if (animals[i].name.equals(a.name)) {
                System.out.println("cette animale est d'indice " + animals[i].name);
                return i;
            }
            else
            {
                System.out.println("cette animale n'existe pas ");

            }
        }
        return  -1;
    }*/
    public int searchanimals(animal a) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(a.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(animal a) {
        int index = searchanimals(a);
        if (index == -1) {
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    public zoo comparerZoo(zoo z1, zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        }
        return z2;
    }
}