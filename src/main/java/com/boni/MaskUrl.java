package com.boni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaskUrl {

	public static void main(String[] args) {
		
		List<String> urls = new ArrayList<>();
		urls.add("/users/Maria/info/location/data/data1");
		urls.add("/users/Marcelo/info/birthday/data/data2");
		urls.add("/users/Messi/info/football/data/data3");
		MaskUrl maskUrl = new MaskUrl();
		String mask = maskUrl.maskUrlFromList(urls);
		System.out.println("Masked url:"+mask);
	}
	
	public String maskUrlFromList(List<String> listOfUrl){
		String result = "";
		
		for(int i=1;i<listOfUrl.size();i++){
			List<String> url1Parts = new ArrayList<String>(result!=""?Arrays.asList(result.split("/")):Arrays.asList(listOfUrl.get(i-1).split("/")));
			List<String> url2Parts = new ArrayList<String>(Arrays.asList(listOfUrl.get(i).split("/")));
			
			url1Parts.removeAll(url2Parts);
			
			int index = 1;
			
			for(String diffString:url1Parts){
				result = result!=""?result.replace(diffString, "*diff_string"+index+"*"):listOfUrl.get(i-1).replace(diffString, "*diff_string"+index+"*");
				index++;
			}
			
		}
		
		return result;
	}
	
}
