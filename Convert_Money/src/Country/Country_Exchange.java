package Country;

public class Country_Exchange {
	
	// 국가별 나라 이름 저장
	String cont_name="";
	
	public Country_Exchange(String name) {
		// TODO Auto-generated constructor stub
		cont_name = name;
	}
	
	public void SetName(String name) {
		cont_name = name;
	}
	
	public String GetName() {
		return cont_name;
	}

}
