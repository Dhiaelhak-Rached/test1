interface test{
void bark();
}
public class App implements test{
    public static void main(String[] args) throws Exception {
        test t1 =new App();
        t1.bark();
    }

 @Override
 public void bark(){
System.out.println("hola amigos");
 }
}
