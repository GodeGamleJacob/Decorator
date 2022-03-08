package FilEksempler;

public class GetShapeFactory {

    public Shape shapeFactory(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangel();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }
}
