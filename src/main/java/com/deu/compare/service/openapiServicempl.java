package com.deu.compare.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import com.deu.compare.dao.exchangeMapper;
import com.deu.compare.domain.apiVO;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
//public class openapiServicempl{
public class openapiServicempl implements openapiService {
	private exchangeMapper mapper;

	@Override
	public void getAPI() {
	//public static void main(String[] args) {
		BufferedReader br = null;
		/*ArrayList<String> list_cur_unit = new ArrayList<String>();
		ArrayList<String> list_deal_bas_r = new ArrayList<String>();
		ArrayList<String> list_cur_nm = new ArrayList<String>();
		*/
		String krw = " ";
		Date now = new Date();
		apiVO api = new apiVO();
		
		try {
			
			String authKey = "tBL5aEtw3MXerx4hmMVFEj123QJoqc25";
			String urlstr = "https://www.koreaexim.go.kr/site/program/financial/exchangeJSON?authkey="+authKey+"&data=AP01";
			URL url = new URL(urlstr);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String result = "";
			String line;
			
			while ((line = br.readLine()) != null) {
	            result = result + line;
	        }

			JsonParser jsonParser = new JsonParser();
			JsonArray jsonArray = (JsonArray) jsonParser.parse(result);
			
			for (int i = 0; i < jsonArray.size(); i++) {
				JsonElement jele = jsonArray.get(i);

				String cur_unit = jele.getAsJsonObject().get("cur_unit").getAsString();
				String deal_bas_r = jele.getAsJsonObject().get("deal_bas_r").getAsString();				
				if(cur_unit.equals("USD")) {
					krw = deal_bas_r;
					break;
				}
			}
			
			api.setCur_unit("USD");
			api.setKrw(krw);
			
			mapper.apiInsert(api);
			
			}
		catch (Exception e) {
		}
	}
}
