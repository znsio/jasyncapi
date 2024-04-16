package com.asyncapi.v3.schema.avro.v1._9_0.jackson;

import com.asyncapi.v3.schema.avro.v1._9_0.Avro;
import com.asyncapi.v3.schema.avro.v1._9_0.AvroType;
import com.asyncapi.v3.schema.avro.v1._9_0.AvroUnion;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import java.io.IOException;

public class AvroTypeDeserializer extends JsonDeserializer<Object> {

    @Override
    final public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        ObjectCodec objectCodec = p.getCodec();
        JsonNode node = objectCodec.readTree(p);

        return chooseKnownPojo(node, objectCodec);
    }

    private Object chooseKnownPojo(JsonNode jsonNode, final ObjectCodec objectCodec) throws IOException {
        try (JsonParser jsonParser = jsonNode.traverse(objectCodec)) {
            JsonNodeType nodeType = jsonNode.getNodeType();

            switch (nodeType) {
                case ARRAY:
                    return readAsUnion((ArrayNode) jsonNode, objectCodec);
                case BOOLEAN:
                    return jsonNode.asBoolean();
                case NUMBER:
                    return jsonParser.readValueAs(Number.class);
                case OBJECT:
                    return jsonParser.readValueAs(Avro.class);
                case STRING:
                    return jsonParser.readValueAs(AvroType.class);
                case BINARY:
                case POJO:
                case MISSING:
                case NULL:
                    return null;
            }

            return null;
        }
    }

    private AvroUnion readAsUnion(ArrayNode arrayNode, ObjectCodec objectCodec) throws IOException {
        AvroUnion avroUnion = new AvroUnion();
        for (JsonNode childNode : arrayNode) {
            avroUnion.add(chooseKnownPojo(childNode, objectCodec));
        }

        return avroUnion;
    }

}
