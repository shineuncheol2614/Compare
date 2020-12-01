package com.deu.compare.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.compare.dao.exchangeMapper;
import com.deu.compare.domain.apiVO;
import com.deu.compare.util.PubMap;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

//public class openapiServicempl{
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
public class openapiServicempl implements openapiService {
	private exchangeMapper mapper;

	@Override
	public void setAPI() {
		BufferedReader br = null;

		String krw = " ";
		apiVO api = new apiVO();
		Date now = new Date();
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
			api.setUpdateTime(now);
			//mapper.deleteData();
			mapper.apiInsert(api);
			
			}
		catch (Exception e) {
		}
	}
	
	@Override
	public List<PubMap> getAPI() {
		return mapper.apiSelect();
	}
}
