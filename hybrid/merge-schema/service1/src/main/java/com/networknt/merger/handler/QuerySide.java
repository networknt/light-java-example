
package com.networknt.merger.handler;

import com.networknt.utility.NioUtils;
import com.networknt.rpc.Handler;
import com.networknt.rpc.router.ServiceHandler;
import java.nio.ByteBuffer;
import io.undertow.server.HttpServerExchange;

@ServiceHandler(id="lightapi.net/service1/query/0.1.0")
public class QuerySide implements Handler {
    @Override
    public ByteBuffer handle(HttpServerExchange exchange, Object input)  {
        return NioUtils.toByteBuffer("{\"message\":\"Hello Query!\"}");
    }
}
