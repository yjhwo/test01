package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 6);
		RectTriangle rectTriangle = new RectTriangle(6, 2);
		
		List<Shape> list = new ArrayList<Shape>(2);
		list.add(rectangle);
		list.add(rectTriangle);
		
		
		for(int i=0; i<list.size(); i++){
			System.out.println("area: "+list.get(i).getArea());
			System.out.println("perimeter: "+list.get(i).getPerimeter());
			
			if(list.get(i) instanceof Resizable){
				((Resizable)list.get(i)).resize(0.5);
				System.out.println("new area: "+list.get(i).getArea());
				System.out.println("new Perimeter: "+list.get(i).getPerimeter());
			}
			
		}
	}

}
