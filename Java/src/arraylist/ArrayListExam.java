package arraylist;

public class ArrayListExam {

	public static void main(String[] args) { //21.04.13 복습
		MyList list = new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		list.set(3, 50);
		list.set(1, 0);
		
		for(int i=0; i<list.size(); i++) {
			String v = Integer.toString(list.get(i));
			System.out.println(v);
		}
		
		//test
		
	}

}
