package programmers.level_0;

/*
	등차수열의 특정한 항만 더하기
	
	* 문제 설명
	두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
	첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
	이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
	
	* 제한사항
	1 ≤ a ≤ 100
	1 ≤ d ≤ 100
	1 ≤ included의 길이 ≤ 100
	included에는 true가 적어도 하나 존재합니다.
*/


public class lessons_181931 {

	// included_len은 배열 included의 길이입니다.
	int solution(int a, int d, boolean included[]) {
        int sum = 0;
        for(int i = 1; i <= included.length; i++){
            if(included[i - 1] == true)
                sum += (a + (i - 1) * d);
        }
        return sum;
	}
	
	public static void main(String[] args) {
		lessons_181931 lessons = new lessons_181931();
		boolean[] b = {true, false, false, true, true};
		lessons.solution(3,	4, b);
	}

}
