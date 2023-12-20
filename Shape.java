package HW1;

public class Shape {

    public Double getCalculatePerimeter(double a){
        return null;
    };
    public Double getCalculatePerimeter(double a, double b){
        return null;
    };
        public Double getCalculateArea(double a){
        return null;
    };  
        public Double getCalculateArea(double a, double b){
        return null;
    };        

public static class Circle extends Shape {
        protected double radius;
    
        @Override
        public Double getCalculateArea(double radius) {
            double result = Math.round(Math.PI*Math.pow(radius, 2));
            return result;
        }
    
        @Override
        public Double getCalculatePerimeter(double radius) {
            double result = Math.round(2*Math.PI*radius);
            return result;
        }
    }

public static class Rectangle extends Shape {
    protected double length, width;
  
    @Override
    public Double getCalculateArea(double length, double width) {
        double result = Math.round(length*width);
        return result;
    }

    @Override
    public Double getCalculatePerimeter(double length, double width) {
        double result = Math.round(2*(length+width));
        return result;
    }
    
    public static class Square extends Rectangle{

    @Override
    public Double getCalculateArea(double side) {
        return super.getCalculateArea(side, side);
    }

    @Override
    public Double getCalculatePerimeter(double side) {
        return super.getCalculatePerimeter(side, side);
    }
}
}
}