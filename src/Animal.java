public class Animal {
    String famille;
    String name;
    int age;
    boolean estMamifere;


    public Animal(String family,String name,int age,boolean isMammal ){
        famille=family;
        this.name=name;
        this.age=age;
        estMamifere=isMammal;
    }
    public void DisplayAnimal(){
        System.out.println(name);
        System.out.println(famille);
        System.out.println(age);
    }

}
