package animals;


public abstract class Bird extends Animal {

    public Bird( String name ) {
        super( name );
    }

    @Override
    public Integer getLegs( ) {
        return 2;
    }
}
