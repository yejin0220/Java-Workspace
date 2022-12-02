package com.kh.chap01_list.part01_arryList.run;

import java.util.ArrayList;

import com.kh.chap01_list.part01_arryList.medel.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		
		
		/*
		 * 컬렉션(Collection)
		 * 자료구조가 내장되어 있는 클래스로 자바에서 제공하는 "자료구조"를 담당하는 "프레임워크"이다.
		 * 
		 * 자료구조?
		 * 방대한 데이터들을 효율적으로(구조적으로)다룰때 필요한 개념
		 * 
		 * 프레임워크
		 * 효율적인 기능들이 이미 정의되어 있는 틀(프레임워크)
		 * 
		 * 정리해보면
		 * 데이터들이 새로이 추가되거나, 삭제가 되거나, 수정이 되는 기능(알고리즘)들이 이미 정의 되어있는 틀이 있다.
		 * ==컬렉션
		 * => 다량의 데이터들을 관리하고자할 때 배열을 가지고 충분히 사용했었음 
		 * => 단, 배열의 단점들을 보완한 것이 컬렉션
		 * 
		 * 배열과 컬렉션의 차이점
		 *  -배열의 단점
		 *  1. 배열을 쓰고자 할 떄 먼저 크기를 지정해야함.
		 *     => 한 번 지정된 크기는 변경이 불가
		 *  	  새로운 값을 추가하고자 할때크기가 오버되는 경우, 새로운 크기의 배열을 만들고 기존의 내용들을 복사해주는 코드를 직접 구현해야함.
		 *  2. 배열 중간 위치에 새로운 데이터를 추가하거나 삭제해야 하는 경우, 기존의 값을을 땡겨주는 코드를 직접 짜야함.
		 *  3. 한 타입의 데이터들만 저장이 가능
		 *  
		 *  -컬렉션의 장점
		 *  1. 크기에 제약이 없다.
		 *     => 크기지정을 해 줄 필요도 없고 만일 크기 지정을 해놔도 알아서 크기가 늘어나면서 새로운 데이터를 추가해주는 코드가 이미 정의되어 있음
		 *  2. 중간에 값을 추가하거나 삭제하는 경우 값을 땡겨주는 코드가 이미 메소드로 정의되어있음
		 *  3. 기본적으로 여러 타입의 데이터들을 저장할 수 있음(단, 제네릭 설정을 통해서 한 타입의 데이터들만 들어올 수도 있음)
		 *  
		 *  
		 *  
		 *  방대한 데이터들을 담아두기만 하고, 조회만 할 목적 => 배열
		 *  방대한 데이터들이 빈번하게 추가, 삭제, 수정될 것 같다 => 컬렉션
		 *  
		 *  
		 *  컬렉션의 3가지 분류
		 *  
		 *  List 계열 => 담고자 하는 값(value)만 저장/ 값 저장시 순서유지됨(index의 개념이 있음)/중복값 허용
		 *  			ex) ArraysList, Vector, LinkedList =>ArrayList가 제일 많이 쓰임(90% 이상)
		 *  
		 *  Set 계열 =>  담고자 하는 값(value)만 저장/ 값 저장시 순서유지x(index의 개념이 없음)/중복값 허용x
		 *  			ex) HashSet, TreeSet
		 *  
		 *  Map 계열 => 키(Key)+담고자하는 값(value)세트로 저장 / 값 저장시 순서유지 x(index개념 없음)/Key중복 허용x
		 *  		   ex)HashMap, Properties
		 *  
		 *  
		 *  
		 *  
		 * 
		 * 
		 */
		
		
		
		ArrayList<Music> list = new ArrayList<>(); //선언만 해도, 내부적으로 크기 10짜리인 배열이 생성됨.
									//객체로 생성하는 부분은 <>만 넣어줘도 괜찮음
		
		System.out.println(list);
		
		/*
		 *제네릭(<E>--><Element의 약자)
		 *별도의 제네릭 제시없이 컬렉션 객체를 생성하게 되면
		 *해당 컬렉션에 다양한 타입의 데이터 값들이 담길 수 있음.(Defualt E == Object)
		 *
		 * 별도의 제내릭 설정으로 <Music>으로 하게 되면, (E == Music) 으로 바뀌게 됨
		 * 내가 만든 클래스를 타입으로 제시할 수 있음, 해당 어레dlfl스트에는 내가 설정한 타입의 객체만 담길 수 있음
		 * 
		 * 
		 * 제네릭을 설정하는 이유
		 * 1. 명시한 타입의 객체만 저장가능하도록 타입의 제한을 두기 위해서
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 떄 매번 형변환하는 절차를 없애기 위해서
		 * 
		 */
		
		//값을 입력하는 방법
		//1. ad(E e) : 해당 리스트의 끝에 전달된 e를 추가시켜주는 메소드(E e -> Element)
		//aee(매개변수 e) : 제네릭을 설정해두면 add의 매개변수는 내가 설정한 객체(Music)가 자동으로 들어감
		//따라서 add에는 무조건 Music객체만들어갈 수 있어야함.
		list.add(new Music("Cookie","뉴진스"));
		list.add(new Music("hype boy","뉴진스"));
		list.add(new Music("die for you","the weekends"));
		//list.add("흐흐") => 에러 : add에는 무조건 Music객체만 들어가야하기 때문에
		
		/*
		 * 출력시 입력한 순서가 유지되면서 값이 추가됨
		 * => 각 index에 담겨 있음
		 * 크기에 제약이 없음, 입력한만큼 크기가 늘어남.
		 * 다양한 타입의 값이 추가 가능(제네릭을 제거한다면 "흐흐"까지 다 출력됨)
		 */
		
		System.out.println(list);
		
		
		//2. add(int index, E e) : 리스트에 전달되는 index값 위치에 전달되는 e를 추가시켜주는 메소드 => 내가 원하는 idex위치에 값을 전달시켜줌
		list.add(1, new Music("바다의 왕자","박명수"));
		//index의 위치만 바뀜, index1번에 있던 값이 사라지는게 아니라 index2번으로 밀리는것 뿐.
		//중간에 값을 추가시 알아서 기존의 값들을 뒤로 밀어주는 작업이 내부적으로 진행됨.
		
		System.out.println(list);
		
		
		//3. set(int index, E e) : 리스트에 원하는 위치의 인덱스 값을 제시하면 전달하는 e값으로 변경해주는 메소드 
		list.set(0, new Music("피 땀 눈물","BTS"));
		//제시한 index의 값을 새로 입력한 값으로 바꿔줌
		
		System.out.println(list);
		
		
		//4. remove(int inex) : 리스트에서 해당 인덱스에 위치해 있는 값을 삭제시켜주는 메소드
		list.remove(1);
		//제시한 index에 위치해 있던 값을 삭제하고, 뒤에 있는 값을 앞으로 땡겨옴
		
		
		System.out.println(list);
		
		
		//5. size()	 : 리스트에 담겨있는 데이터의 개수를 반환해주는 메소드
		System.out.println("리스트에 담긴 데이터의 수는 ? : "+list.size());
		System.out.println("리스트의 마지막 인덱스는 ? : "+(list.size()-1)); //해당 리스트의 크기 -1(length안됨)
		
		
		//6. get(int index) : E => 리스트에 해당 index위치의 데이터를 반환해주는 메소드
		//제네릭 설정 전
//		Music m =(Music)list.get(0); => 다향성으로 인해 강제 형변환을 해줘야 함.
//		System.out.println(m.getTitle());
		
		
		//제네릭 설정 후
		Music m = list.get(0);
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(list.get(1).getTitle());
		
		
		System.out.println("======================================================================================");
		
		//반복문을 활용해서 0번~마지막인덱스까지 데이터를 출력해보기.
		//for반복문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("=====================================================================================");
		//for each문 : 향상된 반복문
		//for(   값을 담아줄 변수    :  순차적으로 접근할 배열 혹은 컬렉션    )
		for( Music o  : list) {
			System.out.println(o);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
