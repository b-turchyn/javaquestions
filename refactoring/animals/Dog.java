package animals;
public class Dog extends Mammal implements Housepet {
    public Dog( String name ) {
        super( name, 4 );
    }
    
    public String speak( ) {
        return "Woof!";
    }
}
