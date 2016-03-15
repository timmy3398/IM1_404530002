package main;
  
  class Rectangle{
	  
	 
	   int width, height, x, y;
	
	  Rectangle(){}
	  
	  
	  Rectangle(int _height, int _width, int _x, int _y){
	 
		  this.height =_height;
	  this.width= _width;
	  this.x = _x;
	  this.y = _y;}
	  
	  int getHeight(){ return this.height;}
	  
	  
	  int getWidth(){return this.width;}
	  
	 
	  public String toString(){
		  
		  return "java.Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
	  }
		  
  }
	  
  public class rectangleTester {
 
	  public static void main(String[] args){
	  
		  double Area,Perimeter;
		  
		  Rectangle a= new  Rectangle(18, 57, 15, 25);
		  Rectangle b= new  Rectangle(47, 60, 0, 12);
		  
		  
		  Perimeter = (a.getWidth() + a.getHeight()+a.getWidth() + a.getHeight());
		  
		  Area = a.getWidth() * a.getHeight();
		  	
		   		System.out.println(a.toString());
		   		System.out.println("Area = " + Area);
		   		System.out.println("Perimeter = " + Perimeter );
		   		
		   	 System.out.println("\n");
		   		Perimeter = (b.getWidth() + b.getHeight()+b.getWidth()+b.getHeight());
		   		
		   		Area = b.getWidth() * b.getHeight();
		   	 	
		   	  		System.out.println(b.toString());
		   	  		System.out.println("Area = " + Area);
		   	  	System.out.println("Perimeter = " + Perimeter); 
		   	
		   	 System.out.println("\n");
		   	  	
		   	  	System.out.println("End of Output!");
  }  
 
  } 
	  
