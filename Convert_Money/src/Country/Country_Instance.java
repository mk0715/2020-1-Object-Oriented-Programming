package Country;

public class Country_Instance {
	// 쓸 전역 변수, 배열 모아놓음
	
	// 각 나라간 환율 변환율이 담긴 배열
		// 전역 변수처럼 쓰일 예정
		float[][] Exchange_Rate_arr;
		int num_of_country;
		Country_Exchange[] countries;
		
		public Country_Instance(int numofcon) {
			num_of_country = numofcon;
			// 초기값 0으로 세팅
			Exchange_Rate_arr = new float[numofcon][numofcon];
			// rate 배열은 [0.1, 20.1] 안에서 임의로 결정
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
