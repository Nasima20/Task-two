package JavaP;

public interface Shape {



    void calculateArea(double Length, double Width);
    void calculatePerimeter(double Length, double Width);}
class Circle implements Shape {


        @Override
        public void calculateArea(double Length, double Width) {
             double RechangleArea = Length * Width;
            System.out.println(" RechangleArea with lenght"+" "+Length+" "+"and width"+" "+" "+Width+" "+"is equal to "+" "+RechangleArea);
        }

        @Override
        public void calculatePerimeter(double Length, double Width) {
            double RectanglePerimeter = 2 * (Length + Width);
            System.out.println("RectanglePerimeter is with length"+" "+Length+" "+"and width"+Width+" "+"eqaual to"+" "+RectanglePerimeter);
        }
    }
    class Square implements Shape{

        @Override
        public void calculateArea(double Length, double Width) {

            double RechangleArea = Length * Width;
            System.out.println(" RechangleArea with lenght"+" "+" "+Length+" "+"and width"+" "+Width+" "+"is equal to "+" "+RechangleArea);
        }

        @Override
        public void calculatePerimeter(double Length, double Width) {
            double RectanglePerimeter = 2 * (Length + Width);
            System.out.println("RectanglePerimeter is with length"+" "+Length+" "+"and width"+" "+Width+" "+"eqaual to"+" "+RectanglePerimeter);
        }

        public static void main(String[] args) {
           Circle c=new Circle();
           c.calculateArea(2,3.4);
           c.calculatePerimeter(3,5);
            System.out.println("********************************88");
           Square s=new Square();
           s.calculateArea(1,2);
           s.calculatePerimeter(2,4);

           }
        }




//11.	Create an Interface 'Shape' with undefined methods as
// calculateArea and calculatePerimeter. Create 2 classes Circle & Square that implements
// functionality defined in the Shape Interface. Test your code.