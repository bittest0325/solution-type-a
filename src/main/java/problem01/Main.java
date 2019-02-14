package problem01;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		// 박수 카운트
		int clapCount = 0;
		// 입력받은 파라미터 number를 배열화
		int[] numberArr = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
		// 배열화 확인
		// System.out.println(Arrays.toString(numberArr));
		
		// 배열 사이즈 (몇 자리수 인지 확인이 가능)
		int numberArrLength = numberArr.length;
		
		for( int i=0; i<numberArrLength; i++ ) {
			// 배열의 값이 0이 아니고, /3 의 나머지가 0일 때
			if( numberArr[i] != 0 && numberArr[i] % 3 == 0 ) {
				// 박수 카운트 1 증가
				clapCount++;
			}
		}
		
		return clapCount;
	}
}