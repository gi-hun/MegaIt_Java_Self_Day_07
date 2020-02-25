package day_07_self;

import java.util.Scanner;

/*
 * # 미니마블
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  [p2]1~3 입력 : 1
 *  1 2 3 4 5 6 7 8 
 *  0 1 0 0 0 0 0 0 
 *  0 0 0 2 0 0 0 0 
 *  
 *  [p1]1~3 입력 : 3
 *  [p1]이 p2를 잡았다!
 *  1 2 3 4 5 6 7 8 
 *  0 0 0 0 1 0 0 0 
 *  2 0 0 0 0 0 0 0 
 */

public class ArrayEx18_정답 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;
		
		boolean run = true;
		while(run) {
			
			for(int i=0; i<8; i++) {
				System.out.print(game[i] + " ");
			}
			System.out.println();

			for(int i=0; i<8; i++) {
				System.out.print(p1[i] + " ");
			}
			System.out.print("[" + win1 + "바퀴]");
			System.out.println();
			
			for(int i=0; i<8; i++) {
				System.out.print(p2[i] + " ");
			}
			System.out.print("[" + win2 + "바퀴]");
			System.out.println("\n");
			
			if(turn % 2 == 0) {
				System.out.print("[p1]1~3 입력 : ");
				int move = scan.nextInt();
				
				p1[idx1] = 0;
				idx1 = idx1 + move;
				
				if(idx1 >= 8) {
					win1 += 1;
				}
				
				idx1 = idx1 % 8;
				
				p1[idx1] = 1;
			}
			else if(turn % 2 == 1) {
				System.out.print("[p2]1~3 입력 : ");
				int move = scan.nextInt();
				
				p2[idx2] = 0;
				idx2 = idx2 + move;
				
				if(idx2 >= 8) {
					win2 += 1;
				}
				
				idx2 = idx2 % 8;
				
				p2[idx2] = 2;
			}
			
			if(idx1 == idx2 && idx1 != 0 && turn % 2 == 0) {
				System.out.println("[p1]이 p2를 잡았다!");
				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;
			}
			else if(idx1 == idx2 && idx2 != 0 && turn % 2 == 1) {
				System.out.println("[p2]가 p1을 잡았다!");
				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;
			}
			turn += 1;
			
			if(win1 == 3) {
				System.out.println("[p1]승리!");
				break;
			}else if(win2 == 3) {
				System.out.println("[p1]승리!");
				break;
			}
		}
		
	}
}