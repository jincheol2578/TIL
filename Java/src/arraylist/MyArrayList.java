package arraylist;

public class MyArrayList implements MyList {

	private int[] arr = new int[0];
	
	@Override
	public void add(int j) {
		int[] temp = new int[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = j;
		arr =temp;
	}

	@Override
	public int get(int v) {
		return arr[v];
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public void set(int i, int j) {
		arr[i] = j;
		// TODO Auto-generated method stub
		
	}


}
