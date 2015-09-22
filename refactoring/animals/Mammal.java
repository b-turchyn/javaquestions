package animals;


public abstract class Mammal extends Animal {
    private Integer legs;

    public Mammal( String name, Integer legs ) {
        super( name );
        this.legs = legs;
    }

    public Integer getLegs( ) {
        return legs;
    }

}
