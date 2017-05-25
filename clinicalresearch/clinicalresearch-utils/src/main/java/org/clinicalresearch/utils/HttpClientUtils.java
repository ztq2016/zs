package org.clinicalresearch.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils {
	
	private static String baseUrl;
	private static String charSet;
	static {
		PropertiesUtil.setPropertiesName("ES.properties");
		baseUrl = PropertiesUtil.getValue("url");
		charSet = PropertiesUtil.getValue("charset");
		System.out.println(baseUrl+charSet);
	}
	
	public static String getByPatientsCount() {
		String request = baseUrl + "/query/mrallnum.json";
		String byUrl = get(request);
		return byUrl;
	}
	
	public static String getByPatients(String expression) {
		String request = baseUrl + "/advanced/query/patients.json";
		String byUrl = getByUrl(request, expression);
		return byUrl;
	}
	
	public static String getByGroup(String groupList) {
		String request = baseUrl + "/advanced/group.json"; 
		String byUrl = getByUrl(request, groupList);
		return byUrl;
	}
	
	public static String getByAllGroup(String groupList) {
		String request = baseUrl + "/advanced/allGroup.json"; 
		String byUrl = getByUrl(request, groupList);
		return byUrl;
	}
	
	public static String getByVariable(String variables) {
		String request = baseUrl + "/advanced/variable.json"; 
		String byUrl = getByUrl(request, variables);
		return byUrl;
	}
	
	public static String getByStating(String groupList) {
		String request = baseUrl + "/advanced/stating.json"; 
		String byUrl = getByUrl(request, groupList);
		return byUrl;
	}
	
	public static String gettimeOffset(String groupList) {
		String request = baseUrl + "/advanced/timeOffset.json"; 
		String byUrl = getByUrl(request, groupList);
		return byUrl;
	}
	
	public static String getByAllVariable(String variables) {
		String request = baseUrl + "/advanced/allVariable.json"; 
		String byUrl = getByUrl(request, variables);
		return byUrl;
	}
	
	private static String getByUrl(String Url,String expression) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(Url);
		CloseableHttpResponse response = null;
		
		StringEntity entity = new StringEntity(expression,"UTF-8");
		entity.setContentEncoding("UTF-8");
		entity.setContentType("application/json");
		httpPost.setEntity(entity);
		httpPost.setHeader("content-Type", "application/json;charset=UTF-8");
			try {
				response = httpClient.execute(httpPost);
				String string = EntityUtils.toString(response.getEntity(),"UTF-8");
				return string;
			} catch (ClientProtocolException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
		return null;
	}
	
	public static String get(String requestUrl ){
		StringBuffer sb = new StringBuffer("");
		try {	
			HttpClient client = new DefaultHttpClient();
			HttpGet httpget = new HttpGet(requestUrl);  
			HttpResponse response = client.execute(httpget);
			BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(),"UTF-8"));
			String temp = null;
			while((temp = reader.readLine())!= null){
				sb.append(temp);
			}
			reader.close();
		} catch (Exception e) {
			throw new RuntimeException("httpClient请求异常"+e);
		}
		return sb.toString();
	}
	
	public static byte[] hex2byte(String h) {
	    byte[] ret = new byte[h.length()/2];
	    for(int i=0; i<ret.length; i++){
	        ret[i] = Integer.decode("#"+h.substring(2*i, 2*i+2)).byteValue();
	    }
	    return ret;
	}
	
}
