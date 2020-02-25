/*
 * # �̴ϸ���
 * 1. �÷��̾�� p1�� p2 2���̴�.
 * 2. �����ư��� 1~3 ������ ���ڸ� �Է��� �̵��Ѵ�.
 * 3. �̵��ϴٰ� ���� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
 *    ��� �÷��̾�� ������ �Ǿ� �������� �ǵ��ư���.
 * 4. ���� 3������ ���� �̱��.
 *    
 *  [p2]1~3 �Է� : 1
 *  1 2 3 4 5 6 7 8 
 *  0 1 0 0 0 0 0 0 
 *  0 0 0 2 0 0 0 0 
 *  
 *  [p1]1~3 �Է� : 3
 *  [p1]�� p2�� ��Ҵ�!
 *  1 2 3 4 5 6 7 8 
 *  0 0 0 0 1 0 0 0 
 *  2 0 0 0 0 0 0 0 
 */

package day_07_self;

import java.util.Scanner;

public class ArrayEx18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int count1 = 0;
		int count2 = 0;		
		
		while(true)
		{	
			for(int i=0;i<8;i++)
			{
				System.out.print(game[i]+" ");
			}
			System.out.println("");
			
			for(int i=0;i<8;i++)
			{
				System.out.print(p1[i]+" ");
			}
			System.out.print("["+count1+"] ����");
			System.out.println("");
			
			for(int i=0;i<8;i++)
			{
				System.out.print(p2[i]+" ");
			}
			System.out.print("["+count2+"] ����");
			System.out.println("");
			
			if(turn%2==0)
			{
				System.out.print("[p1]1~3 �Է�:");
				int num1 = sc.nextInt();
				
				p1[idx1] = 0;
				idx1 = idx1 + num1;
				
				if(idx1 >= 8)
				{
					count1++;
				}
				
				idx1 = idx1%8;
				
				p1[idx1] = 1;
			}
			else if(turn%2==1)
			{
				System.out.print("[p2]1~3 �Է�:");
				int num2 = sc.nextInt();
				
				p2[idx2] = 0;
				idx2 = idx2 + num2;
				
				if(idx2 >= 8)
				{
					count2++;
				}
				
				idx2 = idx2%8;
				
				p2[idx2] = 1;
			}
			
			if(idx1 == idx2 && turn%2 == 0 )		//p1�� p2 �������
			{
				System.out.println("p1�� p2�� ��Ҵ�");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 1;
			}
			else if(idx1 == idx2 && turn%2 == 0 )		//p1�� p2 �������
			{
				System.out.println("p2�� p1�� ��Ҵ�");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			turn++;
			
			if(count1 >= 3)
			{
				System.out.println("p1�� �¸��Ͽ����ϴ�.");
				break;
			}
			else if(count2 >= 3)
			{
				System.out.println("p2�� �¸��Ͽ����ϴ�.");
				break;
			}
			
		}
	}
}
