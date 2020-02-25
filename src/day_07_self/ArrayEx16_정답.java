package day_07_self;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9으로 변경되어 모든 값이 9이되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 */

public class ArrayEx16_정답 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] arr = new int[4];
		int[] check = new int[4];
		
		int i = 0;
		while(i < 4) {
			int r = ran.nextInt(4);
			
			if(check[r] == 0) {
				check[r] = 1;
				arr[i] = r + 1;
				i += 1;
			}
		}

		int cnt = 1;
		
		int j = 0;
		while(j < 4) {
			
			for(int k=0; k<4; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			
			System.out.print("입력 : ");
			int idx = scan.nextInt();
			
			if(arr[idx] == cnt) {
				arr[idx] = 9;
				cnt += 1;
				j += 1;
			}
		}
		
	}
}