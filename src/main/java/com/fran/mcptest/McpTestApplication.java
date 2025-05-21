package com.fran.mcptest;

import io.modelcontextprotocol.server.McpAsyncServer;
import io.modelcontextprotocol.server.McpServer;
import io.modelcontextprotocol.spec.McpSchema;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpTestApplication{

  public static void main(String[] args) {
    SpringApplication.run(McpTestApplication.class, args);
  }

  @Bean
  public ToolCallbackProvider qrTool(QrMcpGeneration qrMcpGeneration) {
    return MethodToolCallbackProvider.builder().toolObjects(qrMcpGeneration).build();
  }
}
