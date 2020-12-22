package com.example.frameworkstudy.util.serializer.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**将long型转换为string
 * @author wb
 * @date 2020-10-16-14:02
 */
public class JsonLongSerializer extends JsonSerializer<Long> {
    @Override
    public void serialize(Long mlong, JsonGenerator jsonGenerator, SerializerProvider serialzerProvider)
            throws IOException, JsonProcessingException {
        jsonGenerator.writeString(Long.toString(mlong));
    }
}
