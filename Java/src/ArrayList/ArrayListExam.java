package ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i=0; i<list.size(); i++) {
			String v = Integer.toString(list.get(i));
			System.out.println(v);
		}
	}

}
