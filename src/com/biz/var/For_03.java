package com.biz.var;

public class For_03 {

	public static void main(String[] args) {
		
		// 변수 i 값이 5부터 12-1까지 1씩 증가하는 동안
		// for() {} 코드를 반복 실행하라
        for(int i = 5 ;  n  < 12 ;  i++) {
			
		} 
        // 변수 i값이 10부터 (5-1)까지 1씩 증가하는 동안
        // for() { } 코드를 반복 실행하라
        // 어떤 값이 10에서 시작하여 1씩 증가 하는데
        // 5가 될수 있을까? => 불가능
        // 따라서 for () { }의 코드는 한번도 실행되지 않는다
        for(int i = 10 ;  i  < 5 ;  i++) {
			
		}
        
        // for() 명령문에 {} 앞에 ;를 넣으면
        // for() 는 보이지 않는 반복은 수행하지만
        // {} 안의 코드는 for() 와는 관계 없는 코드가 된다.
        for(int i = 0 ;  i < 10000 ;  i++) {
        	
        	System.out.println("대한민국");
			
		}
        
        // if() 명령문에 {} 앞에 ;를 넣으면
        // if() 명령문은 외톨이가  된다
        // if() 명령문을 외톨이로 만들지 마세요!!!
        if(3 != 3);
        System.out.println("3은 3이 아니다");
	}

	}

}
