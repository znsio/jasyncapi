package com.asyncapi.v3.schema.avro.v1._9_0;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * Avro Record.
 *
 * @author Pavel Bodiachevskii
 * @version 3.0.0
 * @see <a href="https://avro.apache.org/docs/1.9.0/spec.html#schema_record">Avro Record</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AvroRecord extends Avro {

    public AvroRecord() {
        super(AvroType.RECORD);
    }

    public AvroRecord(
            @Nullable String type,
            @NotNull  String name,
            @Nullable String namespace,
            @Nullable String doc,
            @Nullable List<@NotNull String> aliases,
            @NotNull  List<@NotNull AvroRecordField> fields
    ) {
        super(AvroType.RECORD);

        if (AvroType.ERROR.equals(type)) {
            super.setType(AvroType.RECORD);
        }

        this.name      = name;
        this.namespace = namespace;
        this.doc       = doc;
        this.aliases   = aliases;
        this.fields    = fields;
    }

    public AvroRecord(@NotNull Builder builder) {
        super(AvroType.RECORD);

        if (AvroType.ERROR.equals(builder.type)) {
            super.setType(AvroType.RECORD);
        }

        this.name      = builder.name;
        this.namespace = builder.namespace;
        this.doc       = builder.doc;
        this.aliases   = builder.aliases;
        this.fields    = builder.fields;
    }

    /**
     * A JSON string providing the name of the record (required).
     */
    @NotNull
    private String name = "";

    /**
     * A JSON string that qualifies the name.
     */
    @Nullable
    private String namespace;

    /**
     * A JSON string providing documentation to the user of this schema (optional).
     */
    @Nullable
    private String doc;

    /**
     * A JSON array of strings, providing alternate names for this record (optional).
     */
    @Nullable
    private List<@NotNull String> aliases;

    /**
     * A JSON array, listing fields (required).
     */
    @NotNull
    private List<@NotNull AvroRecordField> fields = Collections.emptyList();

    @NotNull
    @Override
    public String getType() {
        return AvroType.RECORD;
    }

    public void setType(@NotNull String type) {
        super.setType(AvroType.RECORD);
    }

    @NotNull
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Avro.Builder<Avro, Builder> {

        @NotNull
        private String name = "";

        @Nullable
        private String namespace;

        @Nullable
        private String doc;

        @NotNull
        private List<@NotNull String> symbols = Collections.emptyList();

        @Nullable
        private List<@NotNull String> aliases;

        @NotNull
        private List<@NotNull AvroRecordField> fields = Collections.emptyList();

        @NotNull
        public Builder name(@NotNull String name) {
            this.name = name;
            return this;
        }

        @NotNull
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        @NotNull
        public Builder doc(@Nullable String doc) {
            this.doc = doc;
            return this;
        }

        @NotNull
        public Builder symbols(@NotNull List<@NotNull String> symbols) {
            this.symbols = symbols;
            return this;
        }

        @NotNull
        public Builder aliases(@NotNull List<@NotNull String> aliases) {
            this.aliases = aliases;
            return this;
        }

        @NotNull
        public Builder fields(@NotNull List<@NotNull AvroRecordField> fields) {
            this.fields = fields;
            return this;
        }

        @NotNull
        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        public @NotNull AvroRecord build() {
            return new AvroRecord(this);
        }

    }

}
