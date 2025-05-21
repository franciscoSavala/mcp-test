package com.fran.mcptest;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class QrMcpGeneration {
  @Tool(description = "Create a QR code from a given url")
  public String generateQrCode(String url) {
    String link = String.format("https://qrtag.net/api/qr_300.png?url=%s", url);
    return "You can get the QR code from this link " + link;
  }
}
