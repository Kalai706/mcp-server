# mcp-server
MCP-server for Employee details. Created to demonstrate the usage of MCP-server with claude desktop.

Steps to connect mcp server to claude desktop:
1. Build the mcp-server project and run it.
2. Open claude desktop -> settings -> developer-> edit claude-desktop-config.json.
3. Add the following entry in the "mcpServers" array:
```json
 "mcpServers": {
    "my-server": {
      "command": "C:\\Program Files\\Java\\jdk-25.0.2\\bin\\java.exe", // Java executable path
      "args": [
        "-jar",
        "D:\\Projects\\Workshops\\mcpserver\\target\\mcpserver-0.0.1-SNAPSHOT.jar" // jar file path of the application
      ]
    }
  } 
  ```
4. Save the file and restart claude desktop. Make sure claude app terminated fully from task manager before restarting.
5. After restart claude desktop, you can see the newly connected mcp under + icon  -> connectors.
6. This mean your claude desktop is connected to mcp-server. You can now use the mcp-server for employee details.