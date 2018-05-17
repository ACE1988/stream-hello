package com.stream.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * Modification History
 * <p>
 * Date        Name                    Reason for Change
 * ----------  ----------------------  ------------------
 * 2018/5/17    刘节                 Created
 */
@EnableBinding(Sink.class)
public class SinkReceive {

    private static Logger logger= LoggerFactory.getLogger(SinkReceive.class);

    @StreamListener(Sink.INPUT)
    public void receive(Object payload){
        logger.info("Received :",payload);
    }


}
