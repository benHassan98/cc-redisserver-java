package serializer;

import java.text.ParseException;

public class IntegerSerializer extends Serializer{
    @Override
    public String serialize(Object object) throws ParseException {

        if(object instanceof Integer integer){
            return ":"+ integer+"\r\n";
        }

        throw new ParseException("Object is not of type Integer", 0);

    }
}
