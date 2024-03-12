package serializer;

import java.text.ParseException;

public abstract class Serializer {
    public abstract String serialize(Object object) throws ParseException;
}
