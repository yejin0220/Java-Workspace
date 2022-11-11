package com.kh.operator;

public class B_InDecrease {


	
	/*
	 * 증감연산자(단항연산자) ++ --
	 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
	 *      ++변수 (전위연산자) 변수++ (후위연산자)
	 * -- : 값을 1 감소시키는 연산자
	 *      --변수 (전위연산자) 변수-- (후위연산자)
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선증감 후처리.
	 * 변수(증감연산자) : 후위연산 -> 선처리 후증감.
	 */
	
	public void method1() {
		//전위연산 테스트
		//증감/감소를 가장 먼저 처리한 후에 남아있는 연산적용
		int num = 10;
		System.out.println("전위연산 적용 전 num : "+ num); //10
		System.out.println("1회 수행후 결과 : " + ++num);// 10에서 증감연산을 먼저실행하여 11로 num값을 증가시키고  최종적으로 11이 출력됨.
		System.out.println("2회 수행후 결과 : "+ ++num);// 현재 num=11이 담겨있음. 따라서 12가 출력됨.
		System.out.println("3회 수행후 결과 : "+ ++num);// 13
		
		System.out.println("최종 num : "+ num);
		
		System.out.println("=============================================");
		
		//후위 연산테스트
		//존재하는 연산을 먼저 처리한 후 증감/감소를 가장 마지막에 처리
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2 : "+num2); //10
		System.out.println("1회 수행후 결과 : "+ num2++);// 10출력 후 1증가 //즉, 출력당시에는 10이출력되고, 출력처리가 끝나고나서 11로 증감처리됨.
		System.out.println("2회 수행후 결과 : "+ num2++);// 11출력 후 1증가 num2 = 12 
		System.out.println("3회 수행후 결과 : "+ num2++);// 12출력 후 1증가 num2 = 13
		
		System.out.println("최종 num2 : "+num2);
	}
	
	public void method2() {
		// 전위연산
		// a의 증감처리를 가장 먼저 한 후에, b에 대입
		int a = 10;
		int b = ++a; // b = 11 , a= 11
		System.out.println("a : "+a +", b : "+ b);//
		
		// 후위연산
		// c의 값을 먼저 d에 대입한 후, c의 값을 증감 처리
		int c = 10;
		int d = c++; // d = 10 , c = 11
		System.out.printf("c : %d , d : %d \n", c , d);
		
		
		
		//========================
		//예측 
		int num = 20;
		System.out.println("현재 num : "+num); // 출력시 : 20 , num : 20   
		System.out.println("++num ? "+ ++num); // 출력시 21, num :21
		System.out.println("num++ ? "+ num++); // 출력시 : 값이 증감되지 않은 21의 값이 출력, num :22
		System.out.println("--num ? "+ --num); // 출력시 :21 , num : 21
		System.out.println("num-- ? "+ num--); // 출력시 : 값이 감소되지 않은 21의 값이 출력, num : 20
		
		System.out.println("최종 num ? "+num); // 출력시 : 20
		
		
	}
	
	
	
	public void method3() {
		
		//후위증감연산
		int num1 = 20;
		int result = num1++ *3; //대입연산자(=) 산술연산자가 다 처리된 후에 마지막으로 처리될 하나의 연산자
		//작업 순서 : result = 20*3 연산 후, num1 = num1+1의 증감작업을 진행
		
		System.out.println("num1 : "+num1);
		System.out.println("result : "+result);
		
		//전위증감연산
		int num2 = 20;
		int result2 = ++num2 * 3; // num2 = num2+1 연산 후, result2 = 21*3 연산
		
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
		
		
		
	}
	
	
	
	public void method4() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		//주석으로 어떻게 값이 출력될지 예상해보기.
		System.out.println(a++);  // 10이 출력되지만, a값은 11
		System.out.println((++a)+(b++)); // 12+20 : 32 가 출력되지만, b의값은 21 , a의 값은 12
		System.out.println((a++)+(--b)+(--c)); // 12+20+29= 61이 출력되지만, a값은 13/ b의 값은 20 / c의값은 29
		System.out.println("a : "+a+ ", b : "+b+ ", c : "+c); // a는 13 , b는 20, c는 29
		
		
			
		
		
	}
	
	
	public void quiz() {
		
		int a= 5;
		int b = 10;
		
		int c = (++a)+b; // 출력 : 16 / a : 6 , b : 10, c : 16
		int d = c / a;  // 출력 : 16/6 : 2 // a:6 , b:10, c:16 , d:  2
		int e = c % a;  // 출력 : 16/6의 나머지 : 4 // a:6 , b:10, c:16 , d:2 , e:4
		int f = e++;    // 출력 : 4 //  a:6 , b:10, c:16 , d:2 , e:5 , f:4
		int g = (--b) + (d--); //출력 : 9+2 : 11 // a:6 , b:9, c:16 , d:1 , e:5 , f:4, g:11
		int h = 2;             //  a:6 , b:9, c:16 , d:1 , e:5 , f:4, g:11, h=2
		
		
		int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // 출력 : 6+9/(16/4)*(11-1)%(6+2) -> 6+9/4*10%8-> 6
		//6+9/(15/4)*(11-1)%(6+2) ->  6
		//6+9/3*10%8 => 연산자 우선순위가 동일하다면 앞에서부터 시작해야함.
		//12
		
		System.out.println("a : "+a); //7
		System.out.println("b : "+b); //9		
		System.out.println("c : "+c); //15
		System.out.println("d : "+d); //1
		System.out.println("e : "+e); //6
		System.out.println("f : "+f); //4
		System.out.println("g : "+g); //10
		System.out.println("h : "+h); // 2
		System.out.println("i : "+i); //12
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
