/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */


package day_07_self;

import java.util.Scanner;

public class ArrayEx17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] game = new int[9];
		
		int count1 = 1;
		int count2 = 1;
		
		while(true)
		{
			for(int i=0; i<9;i++)
			{
				if(game[i] == 1)
				{
					System.out.print("[X]");
					if((i==2) || (i==5))
					{
						System.out.println("");
					}
				}
				else if(game[i] == 2)
				{
					System.out.print("[O]");
					if((i==2) || (i==5))
					{
						System.out.println("");
					}
				}
				else
				{
					System.out.print("[ ]");
					if((i==2) || (i==5))
					{
						System.out.println("");
					}
				}
				
			}
			System.out.println(" ");
			
			System.out.println("[p1]인덱스 입력: ");		//X
			int p1 = sc.nextInt();
			System.out.println("[p2]인덱스 입력: ");		//O
			int p2 = sc.nextInt();
			
			//승리를 위한 조건: 1) game[i-1] == game[i] == game[i+1] 2) p1 = {(p1+1) + (p1-1)}/2 -> 현재 인덱스 번호 = {(전 인덱스 번호)+(다음 인덱스 번호)}/2
			
			for(int i=0; i<9; i++)
			{
				//1)game[i-1] == game[i] == game[i+1]
				if((game[i-1] == game[i])&&(game[i] == game[i+1]))
				{
					//2) p1 = {(p1+1) + (p1-1)}/2 -> 현재 인덱스 번호 = {(전 인덱스 번호)+(다음 인덱스 번호)}/2
					//p1의 입력값을 새로운 배열을 생성하여 넣는다. 그 후 1)과정이랑 동일하게 하면?
				}
			}
		}
		
		
	}
}
