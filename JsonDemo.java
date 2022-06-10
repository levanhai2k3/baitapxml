package xml;

import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("username", "lvhai");
		jo.put("password", "lvhai");
		System.out.println(jo);
		System.out.println(jo.get("username"));
	}
}
