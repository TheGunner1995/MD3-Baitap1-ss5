public class BaiTap1 {
    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public BaiTap1() {
    }
    public double getArea(double radius){
       double area = Math.PI * radius*radius;
       return area;
    }
}
