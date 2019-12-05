package com.xishanpo.demo.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BIOServer {

    public static void main(String[] args) throws IOException {
        BIOServer.bio();
    }

    private static void bio() throws IOException {


        ExecutorService  newCachedThreadPool = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务器启动了");

        while (true) {
            System.out.println("等待连接");
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");

            newCachedThreadPool.execute(()->{
                handler(socket);
            });

        }
    }

    private static void handler(Socket socket) {
        System.out.println("当前线程：" + Thread.currentThread().getId() + "，名称为：" + Thread.currentThread().getName());

        byte[] bytes = new byte[1024];

        try {
            InputStream inputStream = socket.getInputStream();


            while (true) {
                System.out.println("当前线程：" + Thread.currentThread().getId() + "，名称为：" + Thread.currentThread().getName());

                System.out.println("read......");
                int read = inputStream.read(bytes);

                if (read != -1) {
                    String string = new String(bytes, 0, read);
                    System.out.println(string);
                    if ("exit".equals(string)) {
                        break;
                    }
                }else {
                    break;
                }
            }

        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭一个连接");
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
