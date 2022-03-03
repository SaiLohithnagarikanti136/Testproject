package day3.ey;

class LinearSearch{
	public static int LinearSearch(int list[], int key) {
		int n = list.length;
	for (int i=0;i<list.length;i++) { 
		if(key == list[i]) 
			return i;
	}
		return -1;

	}
	
public static void main(String[] args) {
	int[] list = { 2,3,4,8,7};
	int key = 8;
	int index = LinearSearch(list,key);
	if (index == -1) {
		System.out.println("number not found ");
	}
	else { 
		System.out.println("number found at index number:- " + index);
	}
}
	}
	



