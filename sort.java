public class main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		int temp = 0;

		int arr[] = new int[] { 22,1,19,0,7};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}}
			}
		
		int i = 0;
		for (i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
