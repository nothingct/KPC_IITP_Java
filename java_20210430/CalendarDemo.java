package java_20210430;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 
		 * 달력 만들기 1. 1년 1월 1일 은 월요일 
		 * 2. 1년은 365일 이고, 윤년은 366일 -2월 29일 
		 * 3. 윤년은 4년마다 발생하고
		 * 그중에서 100배수는 제외하고 400배수는 제외하지 않는다. 
		 * 4. 2021년 4월 30일은 무슨 요일 일까요? 
		 * 힌트 ) 2020년까지 총일수 3월까지 총일수, 30을 더해서
		 * 	7로 나눈 나머지가 1이면 월요일, 2이면 화요일,,,,,
		 */
		int year = 2021;
		int month = 4;
		int day = 30;

		int today = 0;
		int lastYear = year - 1;
		// 1년은 365일이므로, 2020년까지의 총 일수를 구할 수 있다.
		today += 365 * lastYear;
		// 이 중 윤년이 제외되었으므로 윤년의 개수만큼 일수를 더해줘야 한다.
		today += (lastYear % 4 - lastYear % 100 + lastYear % 400);
		// 올 해 지난 달까지의 일수를 더해준다.
		// 1월 31, 2월 28, 3월 31(올해는 윤년이 아니므로 2월은 28일까지)
		today += (31 + 28 + 31);
		// 오늘까지의 일수를 더해준다.
		today += day;
		// 7로 나눈 나머지가 오늘의 요일이다.
		today %= 7;
		String msg = "";
		if (today == 0) {
			msg = "일요일";
		} else if (today == 1) {
			msg = "월요일";
		} else if (today == 2) {
			msg = "화요일";
		} else if (today == 3) {
			msg = "수요일";
		} else if (today == 4) {
			msg = "목요일";
		} else if (today == 5) {
			msg = "금요일";
		} else {
			msg = "토요일";
		}
		System.out.println("오늘은 " + msg + "입니다.");
	}
}
