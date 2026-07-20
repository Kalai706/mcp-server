package com.demo.mcpserver;

import org.springframework.ai.mcp.annotation.McpResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class SpringMcpResource {

    @McpResource(uri = "file:///D:\\Projects\\Workshops\\mcp-server\\README.md",
            name = "readme",
            description = "mcp-server Project README content")
    public String getReadme() throws IOException {
        Path path = Paths.get("D:\\Projects\\Workshops\\mcp-server\\README.md");
        return Files.readString(path);
    }
}
