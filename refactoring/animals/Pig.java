package animals;
public class Pig extends Mammal {
    public Pig( String name ) {
        super( name, 4 );
    }
    
    public String speak( ) {
        return "Oink!";
    }
}