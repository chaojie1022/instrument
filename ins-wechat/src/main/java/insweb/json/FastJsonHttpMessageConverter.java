package insweb.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * @author xinjiang
 * @date 2015/12/7 0007 15:48
 */
public class FastJsonHttpMessageConverter extends MappingJackson2HttpMessageConverter {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    private Charset charset;
    private SerializerFeature[] features;

    public FastJsonHttpMessageConverter() {
        this.charset = UTF8;
        this.features = new SerializerFeature[0];
    }

    protected boolean supports(Class<?> clazz) {
        return true;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public SerializerFeature[] getFeatures() {
        return this.features;
    }

    public void setFeatures(SerializerFeature... features) {
        this.features = features;
    }
    @Override
    protected Object readInternal(Class<? extends Object> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        InputStream in = inputMessage.getBody();
        byte[] buf = new byte[1024];

        while(true) {
            int bytes = in.read(buf);
            if(bytes == -1) {
                byte[] bytes1 = baos.toByteArray();
                return JSON.parseObject(bytes1, 0, bytes1.length, this.charset.newDecoder(), clazz, new Feature[0]);
            }

            if(bytes > 0) {
                baos.write(buf, 0, bytes);
            }
        }
    }
    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream out = outputMessage.getBody();
        String text = JSON.toJSONString(obj, this.features);
        byte[] bytes = text.getBytes(this.charset);
        out.write(bytes);
    }
}