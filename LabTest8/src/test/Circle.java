package test;
   //Circle class
    public class Circle 
    {
    	//Data member
    double pi=3.14;
	int r;
	double area;
	//Constructor
	public Circle(int r) 
	{
		super();
		this.r = r;
	}
	//Area method
	public double Area()
	{
		return area=pi*r*r;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
   Circle c1=new Circle(4);//first object creation
   System.out.println("Area Of First Circle:- "+c1.Area());//calling method
   Circle c2=new Circle(20);//second object creation
   System.out.println("Area Of Second Circle:- "+c2.Area());//calling method
    }
  }
