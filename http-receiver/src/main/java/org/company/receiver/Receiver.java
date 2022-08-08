package org.company.receiver;

import org.company.receiver.config.ContextConfig;

import java.util.Arrays;

public class Receiver {

    public static void main(String... args) throws InterruptedException {

//        Arrays.stream(args).forEach(System.out::println);
////        System.out.println(args);
//        String value = System.getProperty("KAFKA_ADDRESS");
//
//        while (true){
//            Arrays.stream(args).forEach(System.out::println);
//            System.out.println("=========KAFKA ADDRESS================"+System.getenv("KAFKA_ADDRESS"));
//            System.getenv().forEach((k,v)->System.out.println("k="+k+" v="+v));
//            Thread.sleep(100L);
//        }
        ContextConfig.build().start();
    }

}

