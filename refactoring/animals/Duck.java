package animals;
public class Duck extends Bird {
    public Duck( String name ) {
        super( name );
    }
    
    public String speak( ) {
        return "Quack!";
    }
}