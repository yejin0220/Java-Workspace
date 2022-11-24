package com.kh.chap01_beforeVsafter.after.model.vo;

			 //자식			 //부모
			 //후손			 //조상
			 //하위			 //상위
public class Desktop extends Product {

		private boolean allInOne;
		
		public Desktop() {
			//super() => JVM이 기본생성자 호출하면 자동으로 넣어줌, 넣어도 되고 안넣어도 상관은 없음.
			
			
		}
		
		public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
			//super :  부모클래스의 주소값을 보관하고 있음(즉, super. 으로 부모클래스에 접근이 가능함)
			
			// brand, pCode, pName,price를 부모클래스의 Product에 있는필드에 초기화(값을 대입) 하는 방법
			
			//해결방법1. 부모클래스의 필드를 자식까지는 접근가능하도록 접근제한자를 변경
			//			private => protected로 변경
			//super.brand = brand;
			//super.pCode = pCode;
			//super.pName = pName;
			//super.price = price;
			
			//해결방법2. 부모클래스에서 접근할 수 있는(public) setter메서드 활동
			//super.setBrand(brand);
			//super.setpCode(pCode);
			//super.setpName(pName);
			//super.setPrice(price);
			
			
			//해결방법3. 부모생성자 호출하기(배개변수있는 생성자 호출), 단 첫줄에 기술되어야 한다!
			super(brand, pCode, pName, price); //반드시 첫줄에 기술되어야 오류 나지 않음.
			this.allInOne=allInOne;
			
			
		}
		
		public void setAllInOne(boolean allInOne) {
			this.allInOne=allInOne;
		}
		
		public boolean getAllInOne() {
			return allInOne;
		}
		
		public String information() { //동일한 이름, 동일한 자료형, 동일한 매개변수가 product에 정의 되어있음
			return super.information()+", allInOne : "+allInOne; 
			//오버라이딩 : 부모클래스의 메소드를 내 입맛대로 재 정의하는 것.
			//이미 부모클래스에 "brand : "+brand+"pCode : "+pCode+"pName : "+pName+"price : "+price가 작성되어 있음 추가로 allInOne의 정보를 입력하고자 한다면 부모클래스 메소드 호출 후 추가로 작성해주기.
			//실행시 자식클래스에 재정의된 메소드가 호출됨.
			
		}
}
