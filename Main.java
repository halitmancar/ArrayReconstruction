
public class Main {

	public static void main(String[] args) {
		int[] arr = {1,3,5,3,5,7,8,1,4,1,8,7,5,9,0,66,43,5,2};
		int[] newArr = new int[arr.length];
		int currentElement = 1;
		newArr[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			for(int a=0;a<i;a++) {
				if(arr[i] == arr[a]) {
					break;
				} else if(arr[i] != arr[a] && a==i-1) {
					newArr[currentElement] = arr[i];
					currentElement++;
				}
			} 
		}
		int[] lastArr = new int[currentElement];
		for(int d=0; d<lastArr.length;d++) {
			lastArr[d] = newArr[d];
			System.out.println(newArr[d]);
		}

	}

}
