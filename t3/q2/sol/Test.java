public class Test{
  
	public static void main(String args[]){
    Circle testCircle1 = new Circle();
    Circle testCircle2 = new Circle(35, 2, 4);
    Cylinder testCylinder1 = new Cylinder();
    Cylinder testCylinder2 = new Cylinder(8, 20, 3, 3);

    System.out.println("Area of Circle 1 = " + testCircle1.area());
	
    System.out.println("Area of Circle 2 = " + testCircle2.area());
	
    System.out.println("Surface Area of Cylinder 1 = " + testCylinder1.area());
	
    System.out.println("Surface Area of Cylinder 2 = " + testCylinder2.area());

    System.out.println("Volume of Cylinder 1 = " + testCylinder1.volume());
	
    System.out.println("Volume of Cylinder 2 = " + testCylinder2.volume());
	}
}
