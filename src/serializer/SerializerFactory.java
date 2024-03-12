package serializer;

import enums.SerializerEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SerializerFactory {

    private static final HashMap<SerializerEnum, Supplier<Serializer>>
            SERIALIZER_SUPPLIER_HASH_MAP =
            new HashMap<>(
                    Map.of(SerializerEnum.SIMPLE_STRING, SimpleStringSerializer::new,
                           SerializerEnum.ERROR,ErrorSerializer::new,
                           SerializerEnum.INTEGER,IntegerSerializer::new,
                           SerializerEnum.BULK_STRING,BulkStringSerializer::new,
                           SerializerEnum.ARRAY,ArraySerializer::new
                            )
                    );


    public Serializer getSerializer(SerializerEnum serializerEnum){
        return SERIALIZER_SUPPLIER_HASH_MAP.get(serializerEnum).get();
    }


}
