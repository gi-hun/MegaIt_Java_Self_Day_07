/*
 * # 1 to 50[1단계] : 1 to 4
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 1부터 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 * 예)
 * 4 2 3 1
 * 입력 : 3
 * 4 2 3 9
 * 입력 : 1
 * 4 9 3 9
 * ...
 */

package day_07_self;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx16 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		int[] check = new int[4];
			
		//랜덤 숫자 저장 하는 반복문
		for(int i=0; i<4; i++)
		{
			int num = ran.nextInt(4)+1;
				
			arr[i] = num;
			if(check[num-1] == 0)
			{
				check[num-1] = 1;
			}
			else
			{
				i--;
			}
		}
			
		
		int count = 1;
			
		for(int j=0;j<5;j++)
		{
			for(int k=0;k<4;k++)
			{
				System.out.print(arr[k] + " ");		//arr[0], arr[1], arr[2], arr[3]
			}
			System.out.println();
			
			System.out.println("입력: ");
			int idx = sc.nextInt();
				
			if(arr[idx] == count)
			{
				arr[idx] = 9;
				count++;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}
}
