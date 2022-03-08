package User;
import Country.Country_Instance;
import java.util.Scanner;
public class User_Process {

	static final int num_of_country = 10;
	static Country_Instance con_inst = new Country_Instance(num_of_country);
	// 사용자가 진행할 내용이 담긴 클래스
	// main
	public static void main(String[] args) {
		
		// setting
		String[] list_of_name = {"Korea", "Japan", "United Kingdom", "Jamaica", "Philippines", "China", "Taiwan", "Mexico", "Norway", "France"}; 
		String[] most_three_countried = {list_of_name[0], list_of_name[1], list_of_name[2]};
		String[] list_of_unit = {"KRW", "JPY", "GBP", "JMD", "PHP", "CNY", "TWD", "MXN", "NOK", "EUR"};
		for(int i=0;i<num_of_country;i++)
			con_inst.Set_country_name(i, list_of_name[i]);
		
		Scanner sc = new Scanner(System.in);
		int pickindex;
		int nextindex;
		float money_amount;
		int curr_month;
		boolean most_three_flag = false;
		
		System.out.println("환율 변환기에 오신 것을 환영합니다.");
		
		con_inst.Show_Country_list(most_three_flag);
		System.out.print("변환을 시작할 국가(화폐단위)를 선택하십시오. : ");
		//  자료구조 안 index로 쓰인다. -1
		pickindex = sc.nextInt()-1;
		
		
		
		System.out.println("------------------------------");
		System.out.println("설정되었습니다.");
		System.out.println(String.format("설정하신 국가는 %d. %s 입니다.", pickindex+1, con_inst.Get_country_name(pickindex)));
		System.out.println("------------------------------");
		
		System.out.print("환전하실 화폐의 양을 입력하여 주십시오. : ");
		money_amount = (float)sc.nextDouble();
		
		System.out.println("설정되었습니다.");
		System.out.println(String.format("설정하신 화폐의 양은 %f %s입니다.", money_amount, list_of_unit[pickindex]));
		
		System.out.println("------------------------------");
		System.out.print("현재 달 수를 입력하여 주십시오.(1-12) : ");
		curr_month = sc.nextInt();
		
		if(curr_month >= 6 && curr_month <= 8) {
			most_three_flag = true;
			System.out.println(String.format("6-8월에 해당되므로 지원하는 국가는 %s, %s, %s 입니다.", most_three_countried[0], most_three_countried[1], most_three_countried[2]));
		}
		else {
			System.out.println("6-8월에 해당되지 않으므로 모든 국가를 지원합니다.");
		}
		
		
		while(true) {
			con_inst.Show_Country_list(most_three_flag);
			System.out.print("어느 국가로 변환하시겠습니까? index를 입력하여 주십시오. : ");
			nextindex = sc.nextInt()-1;
			if(!(most_three_flag &&  nextindex < 0 || nextindex > 3))
				break;
			System.out.println("잘못된 입력입니다. 해당 범위 내에서 입력하십시오.");	
		}
		
		float converted_amount = (int)con_inst.Get_Rate(money_amount, pickindex, nextindex);
		System.out.println("------------------------------");
		System.out.println(String.format("변환 전 화폐 국가 : %s, 금액 : %f %s, 변환 후 화폐 국가 : %s, 금액 : %f %s", list_of_name[pickindex], money_amount, list_of_unit[pickindex], list_of_name[nextindex], converted_amount, list_of_unit[nextindex]));
		
		sc.close();
	}
}
