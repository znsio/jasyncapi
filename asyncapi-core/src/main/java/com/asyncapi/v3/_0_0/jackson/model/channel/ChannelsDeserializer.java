package com.asyncapi.v3._0_0.jackson.model.channel;

import com.asyncapi.v3.Reference;
import com.asyncapi.v3._0_0.model.channel.Channel;
import com.asyncapi.v3.jackson.MapOfReferencesOrObjectsDeserializer;

/**
 * Serializes component channels map.
 *
 * @author Pavel Bodiachevskii
 */
public class ChannelsDeserializer extends MapOfReferencesOrObjectsDeserializer<Channel> {

    @Override
    public Class<Channel> objectTypeClass() {
        return Channel.class;
    }

    @Override
    public Class<?> referenceClass() {
        return Reference.class;
    }

}
