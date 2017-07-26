public class colorFactory extends AbstractFactory {

	@Override
	// Use getColor method to get object of type shape
	public Color getColor ( String colorType ) {
		if ( colorType == null ) {
			return null;
		}

		if ( colorType.equalsIgnoreCase ( "Blue" ) ) {
			return new ColorBlue();

		} else if ( colorType.equalsIgnoreCase ( "Red" ) ) {
			return new ColorRed();

		} else if ( colorType.equalsIgnoreCase ( "Yellow" ) ) {
			return new ColorYellow();
		}

		return null;
	}

	@Override
	public Shape getShape ( String shapeType ) {
		return null;
	}
}