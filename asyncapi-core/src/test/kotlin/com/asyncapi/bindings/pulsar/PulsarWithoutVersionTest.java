package com.asyncapi.bindings.pulsar;

import com.asyncapi.bindings.BindingTest;
import com.asyncapi.bindings.pulsar.v0._1_0.channel.PulsarChannelBinding;
import com.asyncapi.bindings.pulsar.v0._1_0.message.PulsarMessageBinding;
import com.asyncapi.bindings.pulsar.v0._1_0.operation.PulsarOperationBinding;
import com.asyncapi.bindings.pulsar.v0._1_0.server.PulsarServerBinding;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

@DisplayName("without version")
public class PulsarWithoutVersionTest {

    @Nested
    @DisplayName("channel")
    class ChannelTest extends BindingTest<PulsarChannelBinding> {{
        super.binding                          = PulsarV0_1_0Test.channelBinding();
        super.bindingTypeClass                 = PulsarChannelBinding.class;
        super.pathToBindingJson                = "/bindings/pulsar/without version/channel/binding.json";
        super.pathToExtendedBindingJson        = "/bindings/pulsar/without version/channel/binding - extended.json";
        super.pathToWronglyExtendedBindingJson = "/bindings/pulsar/without version/channel/binding - wrongly extended.json";
    }}

    @Nested
    @DisplayName("message")
    class Message extends BindingTest<PulsarMessageBinding> {{
        super.binding                          = PulsarV0_1_0Test.messageBinding();
        super.bindingTypeClass                 = PulsarMessageBinding.class;
        super.pathToBindingJson                = "/bindings/pulsar/without version/message/binding.json";
        super.pathToExtendedBindingJson        = "/bindings/pulsar/without version/message/binding - extended.json";
        super.pathToWronglyExtendedBindingJson = "/bindings/pulsar/without version/message/binding - wrongly extended.json";
    }}

    @Nested
    @DisplayName("operation")
    class Operation extends BindingTest<PulsarOperationBinding> {{
        super.binding                          = PulsarV0_1_0Test.operationBinding();
        super.bindingTypeClass                 = PulsarOperationBinding.class;
        super.pathToBindingJson                = "/bindings/pulsar/without version/operation/binding.json";
        super.pathToExtendedBindingJson        = "/bindings/pulsar/without version/operation/binding - extended.json";
        super.pathToWronglyExtendedBindingJson = "/bindings/pulsar/without version/operation/binding - wrongly extended.json";
    }}

    @Nested
    @DisplayName("server")
    class Server extends BindingTest<PulsarServerBinding> {{
        super.binding                          = PulsarV0_1_0Test.serverBinding();
        super.bindingTypeClass                 = PulsarServerBinding.class;
        super.pathToBindingJson                = "/bindings/pulsar/without version/server/binding.json";
        super.pathToExtendedBindingJson        = "/bindings/pulsar/without version/server/binding - extended.json";
        super.pathToWronglyExtendedBindingJson = "/bindings/pulsar/without version/server/binding - wrongly extended.json";
    }}

}
