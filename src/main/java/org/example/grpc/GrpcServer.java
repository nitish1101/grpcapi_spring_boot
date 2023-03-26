package org.example.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.grpc.server.HelloServiceImpl;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
    }
}