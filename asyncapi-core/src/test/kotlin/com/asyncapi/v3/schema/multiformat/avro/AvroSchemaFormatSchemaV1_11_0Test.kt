package com.asyncapi.v3.schema.multiformat.avro

import com.asyncapi.v3.schema.avro.AvroSchemasProvider
import com.asyncapi.v3.schema.multiformat.AvroFormatSchema
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

abstract class AvroFormatSchemaV1_11_0Test: AvroFormatSchemaTest() {

    @ArgumentsSource(JsonFormat::class)
    @ParameterizedTest(name = "Read: {0}")
    override fun parseJson(
        avroFormatSchemaToCompareWithFilePath: String,
        avroFormatSchema: AvroFormatSchema
    ) {
        compareSchemas(avroFormatSchemaToCompareWithFilePath, avroFormatSchema)
    }

    @ArgumentsSource(YamlFormat::class)
    @ParameterizedTest(name = "Read: {0}")
    override fun parseYaml(
        avroFormatSchemaToCompareWithFilePath: String,
        avroFormatSchema: AvroFormatSchema
    ) {
        compareSchemas(avroFormatSchemaToCompareWithFilePath, avroFormatSchema)
    }

    class JsonFormat: ArgumentsProvider {

        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return Stream.of(
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/ApplicationEvent.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().applicationEventTest())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/DocumentInfo.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().documentInfo())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/foo.Bar.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().fooBar())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/full_record_v1.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().fullRecordV1())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/full_record_v2.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().fullRecordV2())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/logical-uuid.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().logicalUUID())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/logical_types_with_multiple_fields.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().logicalTypesWithMultipleFields())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/MyResponse.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().myResponse())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/regression_error_field_in_record.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().regressionErrorFieldInRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/schema-location.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().schemaLocation())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/schema-location-read.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().schemaLocationRead())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/schema-location-write.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().schemaLocationWrite())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/SchemaBuilder.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().schemaBuilder())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/simple_record.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().simpleRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/TestRecordWithLogicalTypes.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().testRecordWithLogicalTypes())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/TestRecordWithMapsAndArrays.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().testRecordWithMapsAndArrays())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/TestUnionRecord.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().testUnionRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+json/union_and_fixed_fields.json",
                    AvroFormatSchema("application/vnd.apache.avro+json;version=1.11.0", AvroSchemasProvider().unionAndFixedFields())
                ),

                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/ApplicationEvent.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().applicationEventTest())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/DocumentInfo.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().documentInfo())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/foo.Bar.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fooBar())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/full_record_v1.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fullRecordV1())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/full_record_v2.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fullRecordV2())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/logical-uuid.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().logicalUUID())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/logical_types_with_multiple_fields.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().logicalTypesWithMultipleFields())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/MyResponse.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().myResponse())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/regression_error_field_in_record.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().regressionErrorFieldInRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocation())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location-read.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocationRead())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location-write.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocationWrite())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/SchemaBuilder.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaBuilder())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/simple_record.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().simpleRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestRecordWithLogicalTypes.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testRecordWithLogicalTypes())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestRecordWithMapsAndArrays.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testRecordWithMapsAndArrays())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestUnionRecord.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testUnionRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/union_and_fixed_fields.json",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().unionAndFixedFields())
                ),
            )
        }

    }

    class YamlFormat: ArgumentsProvider {

        override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
            return Stream.of(
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/ApplicationEvent.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().applicationEventTest())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/DocumentInfo.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().documentInfo())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/foo.Bar.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().fooBar())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/full_record_v1.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().fullRecordV1())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/full_record_v2.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().fullRecordV2())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/logical-uuid.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().logicalUUID())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/logical_types_with_multiple_fields.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().logicalTypesWithMultipleFields())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/MyResponse.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().myResponse())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/regression_error_field_in_record.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().regressionErrorFieldInRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/schema-location.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().schemaLocation())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/schema-location-read.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().schemaLocationRead())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/schema-location-write.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().schemaLocationWrite())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/SchemaBuilder.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().schemaBuilder())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/simple_record.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().simpleRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/TestRecordWithLogicalTypes.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().testRecordWithLogicalTypes())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/TestRecordWithMapsAndArrays.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().testRecordWithMapsAndArrays())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/TestUnionRecord.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().testUnionRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro+yaml/union_and_fixed_fields.yaml",
                    AvroFormatSchema("application/vnd.apache.avro+yaml;version=1.11.0", AvroSchemasProvider().unionAndFixedFields())
                ),

                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/ApplicationEvent.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().applicationEventTest())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/DocumentInfo.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().documentInfo())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/foo.Bar.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fooBar())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/full_record_v1.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fullRecordV1())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/full_record_v2.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().fullRecordV2())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/logical-uuid.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().logicalUUID())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/logical_types_with_multiple_fields.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().logicalTypesWithMultipleFields())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/MyResponse.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().myResponse())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/regression_error_field_in_record.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().regressionErrorFieldInRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocation())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location-read.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocationRead())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/schema-location-write.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaLocationWrite())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/SchemaBuilder.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().schemaBuilder())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/simple_record.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().simpleRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestRecordWithLogicalTypes.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testRecordWithLogicalTypes())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestRecordWithMapsAndArrays.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testRecordWithMapsAndArrays())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/TestUnionRecord.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().testUnionRecord())
                ),
                Arguments.of(
                    "/json/v3/schema/multiformat/avro/1.11.0/vnd.apache.avro/union_and_fixed_fields.yaml",
                    AvroFormatSchema("application/vnd.apache.avro;version=1.11.0", AvroSchemasProvider().unionAndFixedFields())
                ),
            )
        }

    }

}