public class shapeFactory extends AbstractFactory {

	@Override
	// Use getShape method to get object of type shape
	public Shape getShape ( String shapeType ) {
		if ( shapeType == null ) {
			return null;
		}

		if ( shapeType.equalsIgnoreCase ( "Circle" ) ) {
			return new ShapeCircle();

		} else if ( shapeType.equalsIgnoreCase ( "Rectangle" ) ) {
			return new ShapeRectangle();

		} else if ( shapeType.equalsIgnoreCase ( "Square" ) ) {
			return new ShapeSquare();
		}

		return null;
	}

	@Override
	Color getColor ( String color ) {
		return null;
	}
}