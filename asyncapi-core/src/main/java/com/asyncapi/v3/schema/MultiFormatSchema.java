package com.asyncapi.v3.schema;

import com.asyncapi.v3.ExtendableObject;
import lombok.*;
import org.jetbrains.annotations.NotNull;

/**
 * The Multi Format Schema Object represents a schema definition. It differs from the Schema Object in that it supports
 * multiple schema formats or languages (e.g., JSON Schema, Avro, etc.).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MultiFormatSchema extends ExtendableObject {

    /**
     * Required.
     * <p>
     * A string containing the name of the schema format that is used to define the information. If schemaFormat is missing,
     * it MUST default to application/vnd.aai.asyncapi+json;version={{asyncapi}} where {{asyncapi}} matches the AsyncAPI Version String.
     * In such a case, this would make the Multi Format Schema Object equivalent to the Schema Object. When using Reference Object
     * within the schema, the schemaFormat of the resource being referenced MUST match the schemaFormat of the schema that contains the
     * initial reference.
     * For example, if you reference Avro schema, then schemaFormat of referencing resource and the resource being reference MUST match.
     * <p>
     * Check out the supported schema formats table for more information. Custom values are allowed but their implementation is OPTIONAL.
     * A custom value MUST NOT refer to one of the schema formats listed in the table.
     * <p>
     * When using Reference Objects within the schema, the schemaFormat of the referenced resource MUST match the schemaFormat
     * of the schema containing the reference.
     */
    @NotNull
    private String schemaFormat;

    /**
     * Required.
     * <p>
     * Definition of the message payload.
     * <p>
     * It can be of any type but defaults to Schema Object.
     * <p>
     * It MUST match the schema format defined in schemaFormat, including the encoding type. E.g., Avro should be
     * inlined as either a YAML or JSON object instead of as a string to be parsed as YAML or JSON. Non-JSON-based
     * schemas (e.g., Protobuf or XSD) MUST be inlined as a string.
     */
    @NotNull
    private Object schema;

}
