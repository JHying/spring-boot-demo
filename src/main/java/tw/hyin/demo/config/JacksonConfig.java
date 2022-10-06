package tw.hyin.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import tw.hyin.java.utils.JsonUtil;
import tw.hyin.java.utils.Log;


/**
 * JSON 轉換全域設定
 * @author H-yin
 *
 */
@Configuration
public class JacksonConfig {

	@Bean
	public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();

		// Include.NON_EMPTY 屬性為空（""）或者為 NULL 都不序列化，則返回的json是沒有這個欄位的。這樣對移動端會更省流量
//		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
		// 忽略不存在的屬性
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		// Include.NON_NULL 屬性為 NULL 時不序列化
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		// 允許出現單引號
		objectMapper.configure(Feature.ALLOW_SINGLE_QUOTES, true);
		// 序列化時欄位保留，將null值轉為""
//		objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
//			@Override
//			public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
//				try {
//					jsonGenerator.writeString("");
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		});
		Log.info("Initialized JacksonConfig complete.");
		//修改常用工具的 mapper 設定
		JsonUtil.setMapper(objectMapper);
		return objectMapper;
	}
}
