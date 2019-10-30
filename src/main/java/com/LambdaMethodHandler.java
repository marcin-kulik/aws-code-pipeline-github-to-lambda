package com;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

    public class LambdaMethodHandler implements RequestHandler<Request, Response> {
        public Response handleRequest(Request request, Context context) {
            String greetingString = String.format("Hello  %s %s.", request.firstName, request.lastName);
            System.out.println("Hello World");
            return new Response(greetingString);
        }
    }