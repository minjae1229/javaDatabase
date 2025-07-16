package t1_database.t2_Hoewon;

import java.util.Scanner;

public class HoewonService {
	Scanner scanner = new Scanner(System.in);
	HoewonDAO dao = new HoewonDAO();
	HoewonVO vo = null;

	// 회원 가입 처리
	public void setHoewonInput() {
		String name = "", gender ="", address ="";
		int age;
		
		// 각 필드에 유효성 검사 할 것.
		System.out.print("회원 가입할 성명을 입력하세요? ");
		name = scanner.next();
		// name에 대한 유효성 검사..

		System.out.print("회원 가입할 나이를 입력하세요? ");
		age = scanner.nextInt();
		System.out.print("회원 가입할 성별을 입력하세요? ");
		gender = scanner.next();
		System.out.print("회원 가입할 주소를 입력하세요? ");
		address = scanner.next();

		// 유효성 검사가 끝나면 변수를 vo객체에 담아준다.
		vo = new HoewonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setAddress(address);

		dao.setHoewonInput(name);

		System.out.println("==> 회원가입완료 ");
	}
	// 개별 조회
	public void setHoewonList() {
	// '홍길동' hoewon자료 검색
		System.out.print("검색할 성명을 입력하세요? ");
		String name = scanner.next();

		vo = dao.getNameSearch(name);

		System.out.println("==> 검색 결과 : ");
		if (vo != null)
			System.out.println("vo : " + vo);
		else
			System.out.println("검색한 자료가 없습니다.");
	}
	public void getHoewonSearch() {
		// TODO Auto-generated method stub
		
	}
	// 회원 삭제
	public void setHoewonDelete() {
		// 회원 삭제
		System.out.print("삭제할 성명을 입력하세요? ");
		String name = scanner.next();

		int res = dao.setHoewonDelete(name);

		if (res != 0)
			System.out.println("==> 삭제 완료 ");
		else
			System.out.println("==> 삭제할 자료가 없습니다. ");

	}
	public void connClose() {
		dao.connClose();
	}

}
