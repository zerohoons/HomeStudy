package Study_level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Problem8 {
	public static void main(String[] args) {
		try {
			
		String urls = "https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&appid=c7a83f1b9651f1b7e92ec7ee9f558b81";
		URL url = new URL(urls);
		BufferedReader bf;
		String line;
		String result = "";
		
		bf = new BufferedReader(new InputStreamReader(url.openStream()));
		
		while((line = bf.readLine()) != null) {
			result = result.concat(line);
		}

		JSONParser jps = new JSONParser();
		JSONObject job = (JSONObject)jps.parse(result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
