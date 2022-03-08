package User;
import Country.Country_Instance;
import java.util.Scanner;
public class User_Process {

	static final int num_of_country = 10;
	static Country_Instance con_inst = new Country_Instance(num_of_country);
	// ����ڰ� ������ ������ ��� Ŭ����
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
		
		System.out.println("ȯ�� ��ȯ�⿡ ���� ���� ȯ���մϴ�.");
		
		con_inst.Show_Country_list(most_three_flag);
		System.out.print("��ȯ�� ������ ����(ȭ�����)�� �����Ͻʽÿ�. : ");
		//  �ڷᱸ�� �� index�� ���δ�. -1
		pickindex = sc.nextInt()-1;
		
		
		
		System.out.println("------------------------------");
		System.out.println("�����Ǿ����ϴ�.");
		System.out.println(String.format("�����Ͻ� ������ %d. %s �Դϴ�.", pickindex+1, con_inst.Get_country_name(pickindex)));
		System.out.println("------------------------------");
		
		System.out.print("ȯ���Ͻ� ȭ���� ���� �Է��Ͽ� �ֽʽÿ�. : ");
		money_amount = (float)sc.nextDouble();
		
		System.out.println("�����Ǿ����ϴ�.");
		System.out.println(String.format("�����Ͻ� ȭ���� ���� %f %s�Դϴ�.", money_amount, list_of_unit[pickindex]));
		
		System.out.println("------------------------------");
		System.out.print("���� �� ���� �Է��Ͽ� �ֽʽÿ�.(1-12) : ");
		curr_month = sc.nextInt();
		
		if(curr_month >= 6 && curr_month <= 8) {
			most_three_flag = true;
			System.out.println(String.format("6-8���� �ش�ǹǷ� �����ϴ� ������ %s, %s, %s �Դϴ�.", most_three_countried[0], most_three_countried[1], most_three_countried[2]));
		}
		else {
			System.out.println("6-8���� �ش���� �����Ƿ� ��� ������ �����մϴ�.");
		}
		
		
		while(true) {
			con_inst.Show_Country_list(most_three_flag);
			System.out.print("��� ������ ��ȯ�Ͻðڽ��ϱ�? index�� �Է��Ͽ� �ֽʽÿ�. : ");
			nextindex = sc.nextInt()-1;
			if(!(most_three_flag &&  nextindex < 0 || nextindex > 3))
				break;
			System.out.println("�߸��� �Է��Դϴ�. �ش� ���� ������ �Է��Ͻʽÿ�.");	
		}
		
		float converted_amount = (int)con_inst.Get_Rate(money_amount, pickindex, nextindex);
		System.out.println("------------------------------");
		System.out.println(String.format("��ȯ �� ȭ�� ���� : %s, �ݾ� : %f %s, ��ȯ �� ȭ�� ���� : %s, �ݾ� : %f %s", list_of_name[pickindex], money_amount, list_of_unit[pickindex], list_of_name[nextindex], converted_amount, list_of_unit[nextindex]));
		
		sc.close();
	}
}
