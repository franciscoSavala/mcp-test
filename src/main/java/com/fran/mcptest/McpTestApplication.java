package com.fran.mcptest;

import io.modelcontextprotocol.server.McpAsyncServer;
import io.modelcontextprotocol.server.McpServer;
import io.modelcontextprotocol.spec.McpSchema;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class McpTestApplication implements CommandLineRunner{

  public static void main(String[] args) {
    SpringApplication.run(McpTestApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
