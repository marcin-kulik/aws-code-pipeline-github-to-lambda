package com;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

    public class LambdaMethodHandler implements RequestHandler<Request, Response> {
        public Response handleRequest(Request request, Context context) {
            String greetingString = String.format("Hello Mr/Mrs/Miss  %s %s.", request.firstName, request.lastName);
            return new Response(greetingString);
        }
    }