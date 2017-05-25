package com.clinicalresearch.dao;

import java.util.ArrayList;
import java.util.List;

import com.clinicalresearch.dao.entity.ModelInf;
import com.clinicalresearch.dao.entity.Models;
import com.clinicalresearch.dao.entity.SaveModel;
import com.google.gson.Gson;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TeteSaveModel {

	
	public static void main(String[] args) {
		Gson gson = new Gson();
		SaveModel saveModel = new SaveModel();
		saveModel.setStudyid("000001");
		saveModel.setVariablenames("头疼；难受");
		saveModel.setModelnames("所有模型名字");
		Models models = new Models();
		models.setModelid("000001");
		
		ModelInf modelInf = new ModelInf();
		modelInf.setConfLevel("0.88");
		modelInf.setGroupids("1421535521243");
		modelInf.setQuery("[{\"测试1\":\"aa\",\"测试2\":\"bb\"},{\"测试3\":\"aa\",\"测试4\":\"bb\"}]");
		List<ModelInf> inf = new ArrayList<ModelInf>();
		inf.add(modelInf);
		models.setModelinf(inf);
		
		List<Models> dels = new ArrayList<Models>();
		dels.add(models);
		saveModel.setModels(dels);
		System.out.println(gson.toJson(saveModel));
		
		/*String s = "{\"studyid\":\"001131\",\"variablenames\":\"年龄\",\"modelnames\":\"独立样本T检验\",\"models\":{\"modelid\":\"000010\",\"modelinf\":[{\"confLevel\":0.95,\"groupids\":\"1490271564833,1490271564990\",\"query\":\"{'field':'病历_基本信息_年龄','exp':'','flag':'or','unit':'','values':['']}\"}]}}";
		JSONObject fromObject = JSONObject.fromObject(s);
		System.out.println(fromObject.toString());
		SaveModel ss = gson.fromJson(fromObject.toString(), SaveModel.class);*/
		
		/*List<Models> models2 = ss.getModels();
		ModelInf modelInf2 = models2.get(0).getModelinf().get(0);
		String query = modelInf2.getQuery();
		JSONArray fromObject = JSONArray.fromObject(query);
		for (int i = 0; i < fromObject.size(); i++) {
			
			System.out.println(fromObject.get(i));
		}
		System.out.println(fromObject);*/
	}
}
