package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); //맵생성
		List<EC> list = new ArrayList<>(); //리스트생성
		list.add(new EC(1234, "2023-01-04", "하이트맥주", "삼성", "37918777768", 55900));
		list.add(new EC(2345, "2022-12-12", "꼬깔콘", "롯데", "35691777745", 23600));
		list.add(new EC(3456, "2023-01-01", "노트북", "현대", "36160777782", 2600000));
		
		map.put("list", list);
		EC ec = new EC();
		ec.print(map);
	}

	
}
