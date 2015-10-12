package iterator;

import java.util.Scanner;

public class HanbitMain {
	public static void main(String[] args) {
		HanbitEni hb = new HanbitEni(10); // 총 정원수 10명, 반은 두개
		hb.add(new Student("빅데이터","길동"));
		hb.add(new Student("빅데이터","유신"));
		hb.add(new Student("빅데이터","순신"));
		hb.add(new Student("자바","순환"));
		hb.add(new Student("자바","준규"));
		hb.add(new Student("자바","정환"));
		hb.add(new Student("자바","혜숙"));
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("빅테이터반은 3명이며 길동,유신,순신학생이 있고... 자바반은 3명이며 순환,준규,혜숙학생이 있습니다.");
		while (true) {
			System.out.println("1. 학생추가 2. 학생조회(이름) 3.학생조회(과목) 4.총학생수 5.종료");
			int test = scanner.nextInt();
			switch (test) {
			case 1: System.out.println("추가할 학생의 수업명과 이름을 적어주세요.");
			
			break;
			case 2:break;
			case 3:break;
			case 4:break;
			case 5:return;
			default: break;
			}
		}
		
		
		/**
		 * 1. HanbitENi의배열버전
		 * 2. HanbitENid의 ArrayList버전
		 * 3. HanbitENi의 HashMap 버전
		 */
	}
}
