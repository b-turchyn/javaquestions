package animals;
public class Chicken extends Bird {
    public Chicken( String name ) {
        super( name );
    }

    public String speak( ) {
        return "Buk buk!";
    }
}