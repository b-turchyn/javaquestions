package animals;
public class Cow extends Mammal {
    public Cow( String name ) {
        super( name, 4 );
    }
    
    public String speak( ) {
        return "Mooooo!";
    }
}