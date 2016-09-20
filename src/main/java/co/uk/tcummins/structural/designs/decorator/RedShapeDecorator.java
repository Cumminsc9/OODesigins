package co.uk.tcummins.structural.designs.decorator;

/**
 * Created by Tom on 20/09/2016.
 */
public class RedShapeDecorator extends ShapeDecorator
{

    public RedShapeDecorator( Shape decoratedShape )
    {
        super( decoratedShape );
    }

    @Override
    public void draw() {

        decoratedShape.draw();
        setRedBorder( decoratedShape );
    }

    private void setRedBorder( Shape decoratedShape )
    {
        System.out.println( "Border Colour : Red" );
    }
}
