/* 
 * # ƽ����
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]�ε��� �Է� : 6
 * === ƽ���� ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]�¸�
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
			
			System.out.println("[p1]�ε��� �Է�: ");		//X
			int p1 = sc.nextInt();
			System.out.println("[p2]�ε��� �Է�: ");		//O
			int p2 = sc.nextInt();
			
			//�¸��� ���� ����: 1) game[i-1] == game[i] == game[i+1] 2) p1 = {(p1+1) + (p1-1)}/2 -> ���� �ε��� ��ȣ = {(�� �ε��� ��ȣ)+(���� �ε��� ��ȣ)}/2
			
			for(int i=0; i<9; i++)
			{
				//1)game[i-1] == game[i] == game[i+1]
				if((game[i-1] == game[i])&&(game[i] == game[i+1]))
				{
					//2) p1 = {(p1+1) + (p1-1)}/2 -> ���� �ε��� ��ȣ = {(�� �ε��� ��ȣ)+(���� �ε��� ��ȣ)}/2
					//p1�� �Է°��� ���ο� �迭�� �����Ͽ� �ִ´�. �� �� 1)�����̶� �����ϰ� �ϸ�?
				}
			}
		}
		
		
	}
}
