/*
 * # 1 to 50[1�ܰ�] : 1 to 4
 * 1. arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
 * 2. ����ڴ� 1���� ������� �ش� ��ġ ���� �Է��Ѵ�.
 * 3. ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
 * ��)
 * 4 2 3 1
 * �Է� : 3
 * 4 2 3 9
 * �Է� : 1
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
			
		//���� ���� ���� �ϴ� �ݺ���
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
			
			System.out.println("�Է�: ");
			int idx = sc.nextInt();
				
			if(arr[idx] == count)
			{
				arr[idx] = 9;
				count++;
			}
		}
		System.out.println("���α׷� ����");
		
		
	}
}
