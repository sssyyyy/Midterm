package ku.opensrcsw._MidTerm;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class midterm {
	public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
	Scanner in =new Scanner(System.in);
    System.out.print("Enter the keyword you are looking for: ");
    String words=in.next();
    
	JSONParser jsonParser = new JSONParser();
    JSONObject obj= (JSONObject) jsonParser.parse(new FileReader("midterm.json"));
    JSONObject jsonObj=(JSONObject)obj;
    JSONArray infoArray=(JSONArray) jsonObj.get("poem");
   //JSONArray array=(JSONArray) infoArray.gets(words);
    
    for(int i=0;i<infoArray.size();i++)
    { 
    System.out.print("item_"+i+": ");
    JSONObject items =(JSONObject)infoArray.get(i);
    System.out.println(items.get("item"));

    }

	}

}
