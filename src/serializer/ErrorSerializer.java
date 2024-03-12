package serializer;

import record.ErrorRecord;

import java.text.ParseException;

public class ErrorSerializer extends Serializer{
    @Override
    public String serialize(Object object) throws ParseException {

        if(object instanceof ErrorRecord errorRecord){
            return "-"+errorRecord.type()+" "+errorRecord.message()+"\r\n";
        }

        throw new ParseException("Object is not of type ErrorRecord( type:String, message:String )", 0);

    }
}
