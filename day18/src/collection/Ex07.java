package collection;

import java.util.HashMap;

public class Ex07 {
	public static void main(String[] args) {
		// 기상청 중기 예보 서비스(String serviceKey, String pageNo, String stnId...등등 포함해야한다) 
		String url = "https://apis.data.go.kr/1360000/MidFcstInfoService/getMidFcst";	// 함수라고 본다
		
		String serviceKey = "K7G5hCA%2FRqnmALDK%2F7POZXDGSgTgQFRIcOqpF8HUf9rqLn17QSaJ4Q0Ox732h%2BF%2FgxuyB3bXrdEWApNVwrOtWA%3D%3D";
		String pageNo = "1";
		String numOfRows = "10";
		String dataType = "JSON";
		String stnId = "108";
		String tmFc = "202211070600";	// yyyyMMddHHmm
		
		HashMap<String, String> param = new HashMap<String, String>();
		
		param.put("serviceKey", serviceKey);
		param.put("pageNo", pageNo);
		param.put("numOfRows", numOfRows);
		param.put("dataType", dataType);
		param.put("stnId", stnId);
		param.put("tmFc", tmFc);
		
		url += "?";	// 파라미터입니다
		for(String key : param.keySet()) {	// 반복문을 통해 여러자료들(입력된 자료들)을 돌려서 주소를 만든다
			String value = param.get(key);
			url += key + "=" + value + "&";
		}
		System.out.println(url);
		
	}
}
