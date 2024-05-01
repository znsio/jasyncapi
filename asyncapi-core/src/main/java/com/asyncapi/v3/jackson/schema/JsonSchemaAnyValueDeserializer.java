package com.asyncapi.v3.jackson.schema;

import com.asyncapi.schemas.JsonSchema;

/**
 * Json Schema any value deserializer
 *
 * @author Pavel Bodiachevskii
 */
public class JsonSchemaAnyValueDeserializer extends SchemaAnyValueDeserializer<JsonSchema> {

    @Override
    public Class<JsonSchema> schemaClass() {
        return JsonSchema.class;
    }

}
