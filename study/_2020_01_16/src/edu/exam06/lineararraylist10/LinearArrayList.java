package edu.exam06.lineararraylist10;

/*
선형배열리스트
; 리스트 (순서가 있다)
배열 : 공간이 한정
      삽입/삭제에 비용이 많이든다
     순차적 검색에는 가장 빠르다
   index를 알면 바로 찾아갈 수 있다
   구현이 상대적으로 쉽다
*/

public class LinearArrayList {
	
	static Student[] stArr = new Student[10];// 저장 참조 배열
	static int stNum = 0;					// 저장된 인원

	// 추가
	public static void add(Student st) {
		if(stNum == stArr.length) {
			System.out.println("더 이상 추가 못함");
			return;
		}
		stArr[stNum++] = st;
	}
	// 삽입
	public static void insert(int idx, Student st) {
		if(idx > stNum) {
			System.out.println("이곳에는 삽입 불가");
			return;
		}
		if(stNum == stArr.length) {
			System.out.println("더 이상 삽입 못함");
			return;
		}
		// 삽입위치 뒤의 모든 값들을 한 칸씩 뒤로 복사한다
		for(int i=stNum-1;i>=idx;i--)
			stArr[i+1] = stArr[i];
		
		stArr[idx] = st;	// 현재 idx에 삽입한다
		stNum++;			// 1명 증가시킨다.
	}
	// 삭제

	public static void delete(int idx) {
		if(idx > stNum) {
			System.out.println("이곳은 삭제 불가");
			return;
		}
		
		if(idx == stNum-1) {	// 맨뒤를 삭제할 경우
			stArr[idx] = null;
		}
		else {					// 중간을 삭제할 경우
			for(int i=idx;i<stNum-1;i++)
				stArr[i] = stArr[i+1];	// 뒤의 값을 앞으로 당긴다
		}
		
		stNum--;
	}
	// 수정
	public static void update(int idx, Student st) {
		if(idx > stNum) {
			System.out.println("이곳은 수정 불가");
			return;
		}
		stArr[idx] = st;
	}
	// 검색
	// keyword : 인덱스, 학번
	public static void search(String keyword, int value) {
		System.out.println("=========<검색>============");
		if(keyword.equals("인덱스")) {
			if(value > stNum) {
				System.out.println("이곳은 검색 불가");
				return;
			}
			stArr[value].infoStudent();
		}else if(keyword.equals("학번")) {
			for(int i=0;i<stNum;i++) {
				if(stArr[i].stNum == value) {
					stArr[i].infoStudent();
					break;
				}
			}
		}
	}
	public static void search(String stName) {
		System.out.println("=========<검색>============");
		for(int i=0;i<stNum;i++) {
			if(stName.equals(stArr[i].stName)) {
				stArr[i].infoStudent();
				break;
			}
		}
	}
	public static void search(Student st) {
		System.out.println("==========<검색>===========");
		for(int i=0;i<stNum;i++) {
			if(st.stNum == stArr[i].stNum && 
			   st.stName.equals(stArr[i].stName)) {
				stArr[i].infoStudent();
				break;
			}
		}
	}
	// 전체출력
	public static void showAll() {
		System.out.println("==========<전체 출력>===========");
		for(int i=0;i<stNum;i++)
			stArr[i].infoStudent();
	}

	public static void main(String[] args) {
		// 학생 추가
		add(new Student(1111, "홍길동"));
		add(new Student(2222, "임꺽정"));
		add(new Student(3333, "장길산"));
		showAll();
		
		// 학생 삽입
		insert(1, new Student(4444, "홍경래"));
		showAll(); // 학생 전체 보기

		// 학생 삭제
		delete(2);	// 중간 학생 삭제
		showAll();
		delete(2);	// 맨 뒤의 학생 삭제
		showAll();

		// 수정
		update(0, new Student(5555, "허균"));
		showAll();

		add(new Student(1111, "홍길동"));
		add(new Student(2222, "임꺽정"));
		add(new Student(3333, "장길산"));
		// 검색
		search("인덱스", 1);
		search("학번", 5555);
		search("장길산");
		search(new Student(2222, "임꺽정"));
	}
}






