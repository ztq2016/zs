package org.clinicalresearch.utils;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonMapper extends ObjectMapper {

	    private static final long serialVersionUID = 1L;

	    public JsonMapper() { 
	        // 这个只对对象中的空值进行过滤，不能过滤map和list中的空值
	        this.setSerializationInclusion(Include.NON_NULL);

	        // 这个可以对map中的空值做过滤，不能对list中的空值做过滤
	        // 从对象到字符串 
	        this.configure( SerializationFeature.WRITE_NULL_MAP_VALUES, false);
	        
	        // 从 字符串到对象
	        this.configure( DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

	        this.getSerializerProvider().setNullKeySerializer(new JsonSerializer<Object>() {

	            @Override
	            public void serialize(Object value, JsonGenerator jgen,
	                    SerializerProvider provider) throws IOException,
	                    JsonProcessingException {
	                // ignore Null Key
	                // 如果出现空键，
	                jgen.writeFieldName("null");
	            }
	        }); 
	    }

}
