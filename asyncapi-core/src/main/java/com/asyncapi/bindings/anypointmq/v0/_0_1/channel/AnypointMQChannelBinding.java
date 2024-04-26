package com.asyncapi.bindings.anypointmq.v0._0_1.channel;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.*;
import org.jetbrains.annotations.Nullable;

/**
 * Describes Anypoint MQ channel binding.
 *
 * @version 0.0.1
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/anypointmq/README.md#channel-binding-object">Anypoint MQ channel binding</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonClassDescription("Describes Anypoint MQ channel binding.")
public class AnypointMQChannelBinding extends com.asyncapi.bindings.anypointmq.AnypointMQChannelBinding {

    /**
     * OPTIONAL, defaults to the channel name.
     * <p>
     * The destination (queue or exchange) name for this channel. SHOULD only be specified if the channel name differs
     * from the actual destination name, such as when the channel name is not a valid destination name in Anypoint MQ.
     */
    @Nullable
    @JsonProperty("destination")
    @JsonPropertyDescription("The destination (queue or exchange) name for this channel. SHOULD only be specified if the channel name differs from the actual destination name, such as when the channel name is not a valid destination name in Anypoint MQ.")
    private String destination;

    /**
     * OPTIONAL, defaults to queue.
     * <p>
     * The type of destination, which MUST be either exchange or queue or fifo-queue.
     * SHOULD be specified to document the messaging model (publish/subscribe, point-to-point, strict message ordering)
     * supported by this channel.
     */
    @Nullable
    @Builder.Default
    @JsonProperty(value = "destinationType", defaultValue = "queue")
    @JsonPropertyDescription("The type of destination, which MUST be either exchange or queue or fifo-queue. SHOULD be specified to document the messaging model (publish/subscribe, point-to-point, strict message ordering) supported by this channel.")
    private AnypointMQChannelDestinationType destinationType = AnypointMQChannelDestinationType.QUEUE;

    @Override
    public String getBindingVersion() {
        return "0.0.1";
    }

    @Override
    public void setBindingVersion(@Nullable String bindingVersion) {
        super.setBindingVersion("0.0.1");
    }

}
