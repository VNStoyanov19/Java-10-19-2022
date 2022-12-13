public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    private void setLength(double length) {
        this.length = 1;
        if(length > 0) this.length = length;
    }

    private void setWidth(double width) {
        this.width = 1;
        if(width > 0) this.width = width;
    }

    private void setHeight(double height) {
        this.height = 1;
        if(height > 0) this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateSurfaceArea() {
        return 2*(length*width + length*height + width*height);
    }

    public double calculateLateralSurfaceArea(){
        return 2*height*(length + width);
    }

    public double calculateVolume(){
        return length*height*width;
    }

    @Override
    public String toString() {
        return "Surface area:" + calculateSurfaceArea() +
                "\nLateral Surface Area: " + calculateLateralSurfaceArea() +
                "\nVolume: " + calculateVolume();
    }
}
