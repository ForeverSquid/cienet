package com.weikun.Q;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

public class BlockTcpServer {
	 
    public void init() throws IOException {
        /**try block-with-resource*/
        try (ServerSocketChannel ssc = ServerSocketChannel.open();) {
            ssc.configureBlocking(true);
 
            /** setting the ops，当然你不设置，这里就是默认的操作，和NIO1一样 */
            ssc.setOption(StandardSocketOptions.SO_RCVBUF, 4 * 1024);
            ssc.setOption(StandardSocketOptions.SO_REUSEADDR, true);
 
            /** iterator the ops in ssc */
            Set<SocketOption<?>> options = ssc.supportedOptions();
            for (SocketOption<?> option : options)
                System.out.println(option);
            /** jdk1.6的时候，ServerSocketChannel是不恩bind的，必须让SocketChannel去bind */
            ssc.bind(new InetSocketAddress(2181));
 
            SocketChannel channel = ssc.accept();
            System.out.println("accept:" + channel.getRemoteAddress());
 
            ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
            while (channel.read(buffer) != -1) {
                buffer.flip();
                channel.write(buffer);
                if (buffer.hasRemaining()) {
                    buffer.compact();
                } else {
                    buffer.clear();
                }
            }
 
            /** since 1.7 */
            channel.shutdownInput();
            channel.shutdownOutput();
 
            ssc.close();
            channel.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
 
    }
 
    public static void main(String[] args) throws IOException {
        BlockTcpServer bts = new BlockTcpServer();
        bts.init();
    }
}