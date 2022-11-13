package programmers;

import java.util.Arrays;

public class Quiz42576 {
    static String solution(String[] participant, String[] completion) {
    	String answer = "";
    	
    	Arrays.sort(participant);		// 참가자 정렬
    	Arrays.sort(completion);		// 완주자 정렬
    	   	
		for (int i = 0; i < completion.length; i++) {		// 두 배열을 비교하며 다른 이름을 찾아냄
			if (!participant[i].equals(completion[i])) {	// 각 배열의 같은 인덱스끼리 비교한다.
				answer = participant[i];					// 여기서 밝히지 못한 경우
				break;										
			} else {										// else 조건을 사용해 answer로 return해준다
				answer = participant[completion.length];
			}
		}
        return answer;
    }
	
    public static void main(String[] args) {
    	String[] p1 = {"leo", "kiki", "eden"};
    	String[] c1 = {"eden", "kiki"};
    			
    	String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
    	String[] c2 = {"josipa", "filipa", "marina", "nikola"};
    			
    	String[] p3 = {"mislav", "stanko", "mislav", "ana"};
    	String[] c3 = {"stanko", "ana", "mislav"};
    	
    	System.out.println(solution(p1, c1).equals("leo"));
    	System.out.println(solution(p2, c2).equals("vinko"));
    	System.out.println(solution(p3, c3).equals("mislav"));
    	
    	

    	
    	
    		}
    	}
	

