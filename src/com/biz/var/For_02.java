package com.biz.var;

public class For_02 {

	public static void main(String[] args) {
		
		int num = 100;
		// 변수 i값이 0부터 (num-1)까지 1씩 증가하고 있따
		// 변화되는 i 값을 콘솔에 보여라
        for(int i = 0 ;  i  < 10 ; num i++) {
			System.out.println(i);	
        }
        // 변수 n값이 0부터 10-1까지 1씩 증가하고 있따
        // 변수되는 n 값을 변수 num에 계속 더하라
        // num = num + 0+1+2+3+4+5+6+7+8+9
        
	    for(int n = 0 ;  n  < 10 ;  n++) {
			num += n;
			}
	    
	    
	    int[] nums = new int[10];
	    //정수형 데이터 10개를 담을 수있는 배열 10개를 
	    // nums 이름으로 생성하라
	    
	    num[5] = 10;
	    //정수형 배열 nums의 5번 요소에
	    // 정수 10을 저장하라
	    
	    nums[3] = nums[5 + nums[6];
	    // 정수형배열 nums의
	    // 5번요소와 6번 요소값을 더하여
	    // 정수형 배열 nums의 3번 요소에 저장하라
	    	
	    
	}

}
