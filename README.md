# MultiThreaded Web Server and Client

## Introduction
This project implements a multi-threaded web server and client in Java. The server is capable of handling multiple requests concurrently, and the client can send requests to the server and receive responses.

## Structure
The project directory structure is as follows:

multithreaded/
└── demo
├── pom.xml
├── src
│ ├── main
│ │ └── java
│ │ └── com
│ │ └── example
│ │ ├── HttpRequestHandler.java
│ │ └── WebServer.java
│ └── test
│ └── java
└── target
├── classes
│ └── com
│ └── example
│ ├── HttpRequestHandler.class
│ └── WebServer.class
└── test-classes


## Running the Server
To run the server, navigate to the `demo` directory and execute the following command:

java -cp target/classes com.example.WebServer


The server will start listening for incoming connections on port 8080 by default.

## Running the Client
To run the client, navigate to the `demo` directory and execute the following command:

java -cp target/classes com.example.WebClient

## Sample output

## Project in Action

![Server and Client Screenshot](assets/output.png)

