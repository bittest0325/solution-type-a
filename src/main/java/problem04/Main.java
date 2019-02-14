package problem04;

import java.util.Random;
import java.util.Scanner;

// 숫자 야구 게임
public class Main {
	// 도전 횟수
	static int N;
	
	public static void main(String[] args) {
		baseballNo();
		
		// 사용자가 입력
		Scanner sc = new Scanner(System.in);
		
		int[] userAnswer = new int[3];
		for(int i=0; i<3; i++) {
			userAnswer[i] = sc.nextInt();
		}
		
		answerCheck(userAnswer, baseballNo());
	}
	
	
	// 사용자가 입력한 숫자들과 컴퓨터가 저장한 숫자들 체크
	private static void answerCheck(int[] userAnswer, int[] baseballNo) {
		// 사용자가 숫자 입력하여 비교하는 메서드 진입 시 도전 횟수 증가
		N++;
		
		// 스트라이크
		int S=0;
		// 볼
		int B=0;
		// 아웃
		int O=0;
		
		for( int i=0; i<3; i++ ) {
			if( userAnswer[i]==baseballNo[i] ) S++;
		}
		
		for( int i=0; i<3; i++ ) {
			for( int j=0; j<3; j++ ) {
				
				if( i!=j && userAnswer[i] == baseballNo[j] ) {
					B++;
					continue;
				}
				else if( userAnswer[i] != baseballNo[j] ) {
					O++;
					continue;
				}
			}
		}
		
		System.out.println(N+" - "+"S:"+S+", B:"+B+", O:"+O);
	}

	
	// 컴퓨터가 랜덤으로 숫자 3개 생성하여 메모리에 기록하는 메서드
	private static int[] baseballNo() {
		int[] a = new int[3];
		
		Random random = new Random();
		boolean check = true;
		
		while(check) {
			// 앞자리에는 0이 들어갈 수 없음
			a[0] = random.nextInt(9)+1;
			a[1] = random.nextInt(10);
			a[2] = random.nextInt(10);
			
			if(a[0] != a[1] && a[0] != a[2] && a[1] != a[2]) {
				check = false;
				//System.out.println(a[0]+" "+a[1]+" "+a[2]);
			}
		}
		
		return a;
	}
	
	
	
	
	
}