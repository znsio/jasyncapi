package com.asyncapi.v3._0_0.model.channel;

import com.asyncapi.v3.ExtendableObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Describes a parameter included in a channel address.
 *
 * @version 3.0.0
 * @see <a href="https://www.asyncapi.com/docs/reference/specification/v2.6.0#parameterObject">Parameter</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Parameter extends ExtendableObject {

    /**
     * An optional description for the parameter. CommonMark syntax MAY be used for rich text representation.
     */
    @Nullable
    private String description;

    /**
     * The default value to use for substitution, and to send, if an alternate value is not supplied.
     */
    @Nullable
    @JsonProperty("default")
    private String defaultValue;

    /**
     * An enumeration of string values to be used if the substitution options are from a limited set.
     */
    @Nullable
    @JsonProperty("enum")
    private List<String> enumValues;

    /**
     * An array of examples of the parameter value.
     */
    @Nullable
    private List<String> examples;

    /**
     * A runtime expression that specifies the location of the parameter value.
     */
    @Nullable
    private String location;

}
