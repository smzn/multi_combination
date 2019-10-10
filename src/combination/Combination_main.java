package combination;

import java.util.Arrays;

public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c種類のものから重複を許してn個選ぶ時の組合せ
		//cHn = c+n-1Cn
		//2H5 = 6C5 = 6通り(5,0),(4,1),(3,2),(2,3),(1,4),(0,5)
		int n = 6, c = 4; 
		
		Combination_lib clib = new Combination_lib(n,c);
		clib.GetRecursive(n,0, -1);
		int value[][] = clib.getValue();
		System.out.println("重複組合せ:個数" +value.length);
		System.out.println("重複組合せ:" +Arrays.deepToString(value));
	}

}
