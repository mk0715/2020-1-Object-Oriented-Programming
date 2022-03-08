package Country;

public class Country_Instance {
	// �� ���� ����, �迭 ��Ƴ���
	
	// �� ���� ȯ�� ��ȯ���� ��� �迭
		// ���� ����ó�� ���� ����
		float[][] Exchange_Rate_arr;
		int num_of_country;
		Country_Exchange[] countries;
		
		public Country_Instance(int numofcon) {
			num_of_country = numofcon;
			// �ʱⰪ 0���� ����
			Exchange_Rate_arr = new float[numofcon][numofcon];
			// rate �迭�� [0.1, 20.1] �ȿ��� ���Ƿ� ����
			for(int i=0;i<numofcon;i++)
				for(int j=0;j<numofcon;j++) {
					if(i==j)
						Exchange_Rate_arr[i][j] = 1.0f;
					else
						Exchange_Rate_arr[i][j] = (float)Math.random()*20+0.1f;
				}
			countries = new Country_Exchange[numofcon];
		}
		
		public void Set_country_name(int idx, String name) {
			countries[idx] = new Country_Exchange(name);
		}
		
		public String Get_country_name(int idx) {
			return countries[idx].GetName();
		}
		
		public void Set_Rate(int startidx, int endidx, float rate) {
			// st -> ed
			Exchange_Rate_arr[startidx][endidx] = rate;
		}
		
		public float Get_Rate(float amount, int stindex, int edindex) {
			return amount*Exchange_Rate_arr[stindex][edindex];
		}
		
		public void Show_Country_list(boolean three_flag) {
			
			if(!three_flag)
				for(int i=0;i<num_of_country;i++)
					System.out.println(String.format("%d. %s", i+1, countries[i].GetName()));
			else {
				for(int i=0;i<3;i++)
					System.out.println(String.format("%d. %s", i+1, countries[i].GetName()));
			}
			
		}

}
