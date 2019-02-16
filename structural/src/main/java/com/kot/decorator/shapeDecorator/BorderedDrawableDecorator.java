package com.kot.decorator.shapeDecorator;

public class BorderedDrawableDecorator implements Drawable {

    private final Drawable drawableToDecorate;

    public BorderedDrawableDecorator(Drawable drawableToDecorate) {
        this.drawableToDecorate = drawableToDecorate;
    }

    @Override
    public void draw() {
        drawBorder(drawableToDecorate);
        drawableToDecorate.draw();
        drawBorder(drawableToDecorate);

    }

    private void drawBorder(Drawable drawableToDecorate) {
        System.out.println("-----BORDER-------");
    }
}
