import java.util.Collections;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrayNames = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int reverse=arrayNames.length - 1; reverse > 0;reverse--){
           
			System.out.print(arrayNames[reverse]+" ");
        }
	}

}
