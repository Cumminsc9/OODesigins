package co.uk.tcummins.structural.designs.decorator;

/**
 * Created by Tom on 20/09/2016.
 */
public class ShapeDecorator implements Shape
{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    public void draw()
    {
        decoratedShape.draw();
    }
}
