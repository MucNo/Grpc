package com.example.myapplication;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


import static com.squareup.okhttp.internal.Internal.logger;

public class HelloWorldClient {

    private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());




    public static void main (String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5001).usePlaintext().build();

        //stub-
        //Greeter //ko goi duoc
    }
}
