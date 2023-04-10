
import java.util.Scanner;

public class ZoomManagement {
    Scanner sc=new Scanner(System.in);

    //String nbCage=sc.nextLine();
    //String zooName=sc.nextLine();


    public static void main(String[] args) {
        Zoo myzoo=new Zoo(20,"myzoo","Sousse",20);
        Animal lion = new Animal("mm","lion",15,true);
        ZoomManagement z =new ZoomManagement();
       // System.out.println(z.zooName+"comporte"+z.nbCage);
        
        myzoo.addAnimal(lion);
        myzoo.DisplayZoo();
        myzoo.removeAnimal(lion);
        myzoo.DisplayZoo();

    }



}
