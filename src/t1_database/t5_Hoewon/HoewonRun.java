package t1_database.t5_Hoewon;

import java.util.Scanner;

// 회원관리프로그램 최종본?(20250715_1727)
public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HoewonService service = new HoewonService();
		
		boolean run = true;
		
		while(run) {
			System.out.print("\n==> 1:회원가입  2:전체조회  3:개별조회  4:회원수정  5:회원삭제  0:종료? ");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:	// 회원가입
					service.setHoewonInput();
					break;
				case 2:	// 전체조회
					service.getHoewonList();
					break;
				case 3:	// 개별조회
					service.getHoewonSearch();
					break;
				case 4:	// 수정처리
					service.setHoewonUpdate();
					break;
				case 5:	// 삭제처리
					service.setHoewonDelete();
					break;
				default:
					service.connClose();
					run = false;
			}
		}
		System.out.println("\n작업을 종료합니다1^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다2^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다3^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다4^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다5^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다6^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다7^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다8^.^^.^^.^^.^^.^^.^^.^^.^......");
		System.out.println("\n작업을 종료합니다9^.^^.^^.^^.^^.^^.^^.^^.^......");
		
		scanner.close();
	}
}
