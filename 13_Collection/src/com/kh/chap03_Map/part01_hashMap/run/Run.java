package com.kh.chap03_Map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snak;

public class Run {

	public static void main(String[] args) {
		
		
		HashMap<String, Snak> hm = new HashMap<>();
		
		//<String ->key, Snak -> value>
		/*
		 * 컬레션의 계층구조를 보면 List나 Set계열은 Collection을 구현한 클래스 => 데이터를 추가할때 add메소드를 사용
		 * 단, Map계열은 데이터를 추가할 때 put메소드를 사용해야한다(key+value 세트로 추가).
		 * 
		 * 
		 */
		
		
		//1. put(K key, V vlaue) => map공간에 key+value세트로 추가해주는 메소드
		hm.put("다이제", new Snak("초코맛", 1500));
		hm.put("칸초", new Snak("단맛", 900));
		hm.put("포카칩", new Snak("짠맛", 1000));
		hm.put("포테이토칩", new Snak("짠맛", 1000));
		
		System.out.println(hm);
		
		//hashmap의 특징 
		//1. 저장 순서 유지가 안된다.
		//2. value값이 동일하다고 해도, key값이 중복되지 않기 때문에 잘 저장됨.
		
		
		hm.put("포카칩", new Snak("매운맛",1200));
		System.out.println(hm);
		//포카칩=Snak [flaver=짠맛, calory=1000] => 포카칩=Snak [flaver=매운맛, calory=1200] 으로 변경되어 출력 됨
		//중복된 key값은 vlaue값으로 덮어씌우기 됨.
		//만약"포카칩2"로 이름을 설정한다면 => 포카칩2=Snak [flaver=매운맛, calory=1200가 새롭게 생성되어 출력됨
		
		
		
		
		//2. get(Object key) : V => 컬렉션에서 해당 키값의 value값을 돌려주는 메소드
		System.out.println(hm.get("다이제"));
		
		Snak s = hm.get("칸초"); //제네릭 설정을 <Snak>으로 해두었기 때문에 Snak타입의 객체로 강제형변환 하는 과정이 생략되었다.
		System.out.println(s);
		
		
		
		//3. size()	 => 컬렉션에 담겨있는 값의 갯수
		System.out.println("size : "+hm.size());
		
		//4. replace(K key, V value) => 컬렉션에서 해당 key값을 찾아내서 새로 전달된 value로 변경해주는 메소드
		hm.replace("포테이토칩", new Snak("겁나짠맛", 1500));
		System.out.println(hm);
		
		
		
		//5. remove(Object key) => 컬렉션에 해당 key값을 찾아서 key+value값을 동시에 지워주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		
		System.out.println("==================================================================");
		
		//순차적으로 HashMap안에 담겨있는 값에 접근하고자 할때?
		//for문은 아예 사용할 수없음(향상된 반복문도 마찬가지)
		//List와 Map은 다른 계열이기 때문에 ArrayList에 담은 후 출력할 수 없음
		//ArrayList list = new ArrayList(hm) =>불가
		
		//Iterator()는 List와 Set계열에서만 쓰는 메소드이기 때문에 바료 사용 불가
		//Iterator it = hm.Iterator() =>불가
		
		//Map을 Set으로 변경해주는 메소드가 있음
		//HashMap => Set계열로 바꿔서 Iteratir호출가능
		
		//1. keySet()을 이용하는 방법
		//1) hm 에 있는 key값들만 set에 담기
		Set<String> keySet =hm.keySet();
		System.out.println(keySet);
		
		//2) 1번과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> itKey =keySet.iterator();
		
		//3) 반복자를 이용해서 순차적으로 값 뽑기
		while(itKey.hasNext()) {
			String Key = itKey.next();
			Snak value = hm.get(Key);
			System.out.println("key : "+Key);
			System.out.println("value : "+value);
		}
		
		
		
		
		System.out.println("==================================================================");
		
		//2. entrySet()이용하는 방법
		//1)hm에 있는 key+value값 모두 (Entry)set에 담기
		//Entry => 집합형태를 의미
		Set<Entry<String, Snak>> entrySet=hm.entrySet();
		
		//2)방금 만든 entrySet에 있는 것들을 Iterator에 담기.
		
		Iterator<Entry<String, Snak>> itEntry=entrySet.iterator();
		
		//3)반복자를 이용해서 순차적으로 값을 뽑기
		while(itEntry.hasNext()) {
			Entry<String, Snak> entry =itEntry.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
