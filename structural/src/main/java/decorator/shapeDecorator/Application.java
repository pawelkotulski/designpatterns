package decorator.shapeDecorator;

public class Application {
    public static void main(String ... args){
        Circle circle = new Circle();
        draw(circle);

        BorderedDrawableDecorator borderCircle = new BorderedDrawableDecorator(circle);
        draw(borderCircle);
    }

    private static void draw(Drawable drawable) {
        drawable.draw();
    }
}
