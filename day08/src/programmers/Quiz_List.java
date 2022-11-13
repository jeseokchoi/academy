package programmers;

import java.util.ArrayList;

// 코딩테스트 연습 -> 2019 카카오 개발자 겨울 인턴십 -> 크레인 인형뽑기 게임

public class Quiz_List {
	
    static int solution(int[][] board, int[] moves) {
        int answer = 0;
        // moves를 참조하여 인형을 순서대로 뽑아서 출력하기
        
        ArrayList<Integer> basket = new ArrayList<Integer>();
        
        for(int i = 0; i < moves.length; i++) {		
        	int doll = 0;							
        	int index = moves[i] - 1;				
        	for(int j = 0; j < board.length; j++) {	
        		if(board[j][index] != 0) {		
        			doll = board[j][index];		
        			board[j][index] = 0;		
        			break;						
        		}
        	}
        	System.out.print(doll + " ");	
        	
            if(doll != 0) {					
            	basket.add(doll);
        	}
        									
        	int size = basket.size();
        	if(size >= 2 && basket.get(size - 1) == basket.get(size - 2)) {
        		System.out.println("중복된 인형 터트리기"); 										
        		basket.remove(size - 1);
        		basket.remove(size - 2);
        		answer += 2;	
        	}
        	
        	System.out.println(basket);
        }
        System.out.println();
        return answer;
    }
    
    public static void main(String[] args) {
    	int[][] board = {
    			{0, 0, 0, 0, 0}, 
    			{0, 0, 1, 0, 3}, 
    			{0, 2, 5, 0, 1}, 
    			{4, 2, 4, 4, 2}, 
    			{3, 5, 1, 3, 1}
    	};
    	int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
    	int answer = solution(board, moves);
    	System.out.println(answer == 4);
    	

    	}		
   }