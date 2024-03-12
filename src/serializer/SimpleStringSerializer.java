package serializer;

import java.text.ParseException;

public class SimpleStringSerializer extends Serializer {
    @Override
    public String serialize(Object object) throws ParseException {

        if( object instanceof String str){
            return "+"+str+"\r\n";
        }

        throw new ParseException("Object is not of type String",0);

    }
}
