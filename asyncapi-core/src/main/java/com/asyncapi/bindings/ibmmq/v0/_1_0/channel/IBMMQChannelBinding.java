package com.asyncapi.bindings.ibmmq.v0._1_0.channel;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

/**
 * Describes IBM MQ channel binding.
 * <p>
 * This object contains information about the channel representation in IBM MQ. Each channel corresponds to a Queue or Topic within IBM MQ.
 *
 * @see <a href="https://github.com/asyncapi/bindings/tree/master/ibmmq#channel-binding-object">IBM MQ channel binding</a>
 * @see <a href="https://www.ibm.com/products/mq">IBM MQ</a>
 * @author Pavel Bodiachevskii
 * @version 0.1.0
 * @since 1.0.0-RC2
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonClassDescription("Describes IBM MQ channel binding.")
public class IBMMQChannelBinding extends com.asyncapi.bindings.ibmmq.IBMMQChannelBinding {

    /**
     * Defines the type of AsyncAPI channel.
     * <p>
     * MUST be either topic or queue. For type topic, the AsyncAPI channel name MUST be assumed for the IBM MQ topic string unless overridden.
     */
    @Nullable
    @Builder.Default
    @JsonProperty(value = "destinationType", defaultValue = "topic")
    @JsonPropertyDescription("Defines the type of AsyncAPI channel.")
    private IBMMQChannelDestinationType destinationType = IBMMQChannelDestinationType.TOPIC;

    /**
     * REQUIRED if destinationType = queue
     * <p>
     * queue and topic fields MUST NOT coexist within a channel binding
     */
    @Nullable
    @JsonProperty("queue")
    @JsonPropertyDescription("Defines the properties of a queue.")
    private IBMMQChannelQueueProperties queue;

    /**
     * Defines the properties of a topic.
     * <p>
     * OPTIONAL if destinationType = topic
     * <p>
     * queue and topic fields MUST NOT coexist within a channel binding.
     */
    @Nullable
    @JsonProperty("topic")
    @JsonPropertyDescription("Defines the properties of a topic.")
    private IBMMQChannelTopicProperties topic;

    /**
     * The maximum length of the physical message (in bytes) accepted by the Topic or Queue. Messages produced that are
     * greater in size than this value may fail to be delivered. More information on the maximum message length can be
     * found on this <a href="https://www.ibm.com/support/knowledgecenter/SSFKSJ_latest/com.ibm.mq.ref.adm.doc/q085520_.html#q085520___maxmsgl"></a>page in the IBM MQ Knowledge Center.
     * <p>
     * MUST be 0-104,857,600 bytes (100 MB).
     */
    @Nullable
    @jakarta.validation.constraints.Min(
            value = 0,
            message = "Maximum length of the physical message (in bytes) must be greater or equals to 0"
    )
    @jakarta.validation.constraints.Max(
            value = 104857600,
            message = "Maximum length of the physical message (in bytes) must be lower or equals to 104857600"
    )
    @JsonProperty("maxMsgLength")
    @JsonPropertyDescription("The maximum length of the physical message (in bytes) accepted by the Topic or Queue. Messages produced that are greater in size than this value may fail to be delivered. More information on the maximum message length can be found on this [page](https://www.ibm.com/support/knowledgecenter/SSFKSJ_latest/com.ibm.mq.ref.dev.doc/q097520_.html) in the IBM MQ Knowledge Center.")
    private Integer maxMsgLength;

    @Override
    public String getBindingVersion() {
        return "0.1.0";
    }

    @Override
    public void setBindingVersion(@Nullable String bindingVersion) {
        super.setBindingVersion("0.1.0");
    }

}
