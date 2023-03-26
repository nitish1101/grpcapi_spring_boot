package org.example.grpc.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.example.grpcapi.HelloRequest;
import org.example.grpcapi.HelloResponse;
import org.example.grpcapi.HelloServiceGrpc;


public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
                = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Nitish")
                .setLastName("Gupta")
                .build());

        System.out.println(helloResponse.toString());

        channel.shutdown();
    }
}