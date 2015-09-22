package animals;
public class Cat extends Mammal implements Housepet {
    public Cat( String name ) {
        super( name, 4 );
    }
    
    public String speak( ) {
        return "Meow!";
    }
}