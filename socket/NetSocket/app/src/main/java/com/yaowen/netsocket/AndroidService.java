package com.yaowen.netsocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by HelloWorld on 2015/11/7.
 */
public class AndroidService {
    public static void main(String[] args) throws IOException {
        ServerSocket serivce = new ServerSocket(30000);
        while (true) {
            //等待客户端连接
            Socket socket = serivce.accept();
            new Thread(new AndroidRunable(socket)).start();
        }
    }
}
