package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * 배열 복사
	 * -얕고 깊음은 배열 주소를 토대로 판단함
	 * -얕은 복사 : 배열의 주소값만 복사 (복사한 배열에 동일한 주소값만 복사)
	 * 
	 * -깊은 복사 : 동일한 새로운 배열을 하나 더 만들어서 실제 내부값들을 복사 => 각각 배열들이 고유한 주소값을 가지고 있어야함.
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public void method1() {
		//배열복사	
		
		//1. 원본 배열 셋팅
		int [] origin = {1, 2, 3, 4, 5}; //-> 데이터 복사하기
		
		System.out.println("================================== 원본 배열 출력===========================");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
		
		//단순하게 origin을 다시 copy본 배열 대입
		//실질적으로 copy에 담겨 있는 값은 origin의 주소
		int [] copy = origin;
		System.out.println("\n================================== 카피본 배열 출력===========================");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		
	
		copy[2] = 99;
		   
		   System.out.println("\n==복사본 배열 수정 후 ==");
		   System.out.println("==원본 배열 출력==");
		   for(int i =0; i < origin.length; i++) {
		      System.out.print(origin[i] + " ");
		      
		}
		   System.out.println("\n ==카피본 출력==");
		   for(int i =0; i < origin.length; i++) {
		      System.out.print(copy[i] + " ");
		   }
		   //복사본 배열만 가지고 수정을 했는데도 원본배열도 함께 수정이된다.
		      //이유는 얕은복사가 이루어졌기때문에 => 배열의 주소값이 복사되어
		      //원본과 복사본은 사실상 동일한 데이터를 공유하고있다.
		   System.out.println("\n원본배열 해시코드"+origin.hashCode());
		   System.out.println("복사본 해시코드"+copy.hashCode());
		   
		   }
	
	
	
	
	//깊은 복사
	public void method2( ) {
		
		//1. for문을 활용
		//새로운 배열을 생성한 후 각 인덱스별로 내부값을 일일이 대입하는 방법.
		
		int [] origin = {1, 2, 3, 4, 5};
		
		int [] copy = new int[origin.length]; // origin의 길이만큼 복사본 만들기
		
		for(int i = 0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		//복사가 잘 이루어졌는지 출력
		for(int i = 0; i<copy.length; i++) {
			System.out.println(copy[i]);
		}
		
		
		
		copy[2] = 99;
		   
		   System.out.println("\n==복사본 배열 수정 후 ==");  
		   System.out.println("==원본 배열 출력==");
		   for(int i =0; i < origin.length; i++) { 
		      System.out.print(origin[i] + " ");    //1 2 3 4 5
		      
		}
		   System.out.println("\n ==카피본 출력==");
		   for(int i =0; i < origin.length; i++) {   // 1 2 99 4 5 
		      System.out.print(copy[i] + " ");
		   }
		   
		   System.out.println("\n원본배열 해시코드"+origin.hashCode());
		   System.out.println("복사본 해시코드"+copy.hashCode());
		   
		   }
		
		
		// => copy의 2번째 인덱스 값이 수정되어있기 때문에 원본배열의 값은 그대로이고, copy배열의 값만 수정되었음
	
	
	
	
	
	
	//자바에서 제공하는 다양한 메서드 사용해서 배열을 복사하기
	public void method3() {
		//2. 새로운 배열을 생성한 후 System클래스에서 arraycopy메서드를 이용
		
		int [] origin = {1, 2, 3, 4, 5};
		
		int [] copy = new int [10];
		
		
		//Systen.arraycopy(원본배열명, 원본배열의 복사를 시작할 인덱스, 복사본 배열명, 복사본 배열의 복사될 시작 인덱스, 복사할 갯수
	   //  System.arraycopy(origin, 0, copy, 0, 5); //1,2,3,4,5의 값이 copy인덱스의 0~4까지 대입되어 있고, 나머지는 0의 값 대입
	                                              // 1 2 3 4 5 0 0 0 0 0 
	     
//	     for(int i= 0; i <copy.length; i++) {
//	    	 System.out.print(copy[i] + " ");
//	     }
		
	     //0 0 1 2 3 4 5 0 0 0 으로 추출해보기
//	     System.arraycopy(origin, 0, copy, 2, 5);
//	     
//	     for(int i= 0; i <copy.length; i++) {
//	    	 System.out.print(copy[i]+" "); 
//	     }
//	    
//		
//		
		//0345000000으로 추출
//		System.arraycopy(origin, 2, copy, 1 , 3);
//		for(int i= 0; i<copy.length; i++) {
//			System.out.print(copy[i]+" ");
//		}
//		
		
		System.arraycopy(origin, 2, copy, 9 , 2);
		for(int i= 0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}  //인덱스의 범위를 벗어남
		
		
		
	}
		
		public void method4() {
			//3. Arrays 클래스에서 제공하는 copyOf 메소드를 이용한 복사
			
			int [] origin = {1,2,3,4,5};
			
		//복사본 배열 = ArrayscopyOf(원본배열명, 복사할 갯수)
			int [] copy = Arrays.copyOf(origin, 7); //copy 배열의 크기를 == 복사할 갯수

			for(int i= 0; i <copy.length; i++) {
				System.out.print(copy[i]+" ");
			}
			
			/*
			 * 2. System.arraycopy 메소드 : 몇번 인덱스 부터, 몇개를 어느 위치의 인덱스에 복사할 것인지 세밀하게 지정가능.
			 * 
			 * 3. ArrayscopyOf 메소드 : 무조건 원본배열의 0번 인덱스 부터 내가 제시한 갯수만큼 복사가 진행됨
			 *                        내가 제시한 길이가 원본배열보다 크다면 나머지에는 0의 값으로 채워서 복사해줌
			 *                        
			 * 
			 * 
			 */
			
			
			
			
		}
		
		public void method5() {
			//4. clone메소드 사용
			
			int [] origin = { 1,2,3,4,5};
			
			//복사본 배열 = 원본배.clone();
			int [] copy = origin.clone();
			//인덱스 직접 지정x, 복사할 갯수 지정x
			//무조건 원본배열과 동일한 녀석이 반환됨.
			
			System.out.println(Arrays.toString(origin));
			System.out.println(Arrays.toString(copy));
			
			/*Arrays.toString(배열)
			 * -> 값의 앞과 뒤에 []로 감싸주고, ','를 넣어서 하나의 문자로 연이어서 출력해주는 메서드
			 */
			
			System.out.println("원본배열의 해시코드 : "+origin.hashCode());
			System.out.println("복사본배열의 해시코드 : "+copy.hashCode());
		}
		
		
		
		
		
		
		
		
		
		
	}


