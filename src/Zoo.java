public class Zoo {
    Animal[] animals;
    String nom;
    String ville;
    int nbCage;
public Zoo(int nbrAnimals,String name,String city,int nbrCage ){
    animals=new Animal[nbrAnimals];
    this.nom=name;
    ville=city;
    nbCage=nbrCage;
}
  public void DisplayZoo(){
    for(int i = 0;i<animals.length;i++){
        if (animals[i]==null){
            break;
        }
    animals[i].DisplayAnimal();

    }
    System.out.println(nom);
    System.out.println(ville);
    System.out.println(nbCage);
  }
  boolean addAnimal( Animal an){
int i=0;
while(animals[i]!= null){
    i++;
}
animals[i]=an;
    return true;

}
public boolean removeAnimal(Animal an){
    int i=0;
    for(i = 0;i<animals.length;i++){
        if (animals[i].equals(an)){
            break;
        }
    }  
    for(int j=i;j<animals.length;j++){
        animals[j]=animals[j+1];
    }
    return true;
}
}
// connect to mongodb 
