public class shapeFactoryDemo {
	public static void main ( String[] args ) {
		shapeFactory factory = new shapeFactory();
		String[] shapeTypes = new String[] {"rectangle", "square", "circle"};

		for ( int i = 0; i < shapeTypes.length; i++ ) {
			Shape shape = factory.getShape ( shapeTypes[i] );
			shape.draw();
		}
	}
}