package com.weikun.L;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9091);
        try {
            Socket client = server.accept();
            try {
                BufferedReader input =
                        new BufferedReader(new InputStreamReader(client.getInputStream()));
                boolean flag = true;               

                while (flag) {
                    String line = input.readLine();
                  
                    
                    if (line.equals("exit")) {
                        flag = false;
                        System.out.println("客户端不想玩了！");
                    } else {
                        System.out.println("客户端说："  + line);
                    }

                }
            } finally {
                client.close();
            }
            
        } finally {
            server.close();
        }
    }
}
