package serializer;

import java.text.ParseException;
import java.util.Arrays;


public class ArraySerializer extends Serializer{
    @Override
    public String serialize(Object object) throws ParseException {


        if(object instanceof String[] strings) {

            String result =  Arrays.stream(strings).reduce("",(total, curr)->total+curr);
            return "*"+strings.length+"\r\n"+result;

        }

        throw new ParseException("Object is not of type List<String>", 0);

    }
}
