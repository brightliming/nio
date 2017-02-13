package com.practise;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * Created by bright on 17-2-13.
 */
public class FileChannelTest {
    public static void main(String[] args) throws Exception{
        RandomAccessFile fromFile = new RandomAccessFile("/home/bright/bc_and_yt/jtss.xlsx","rw");
        RandomAccessFile toFile = new RandomAccessFile("/home/bright/bc_and_yt/jtss_bak.xlsx","rw");

        FileChannel fromFileChannel = fromFile.getChannel();


        FileChannel toFileChannel = toFile.getChannel();

        long position = 0;
        long count = fromFileChannel.size();


        fromFileChannel.transferTo(position,count,toFileChannel);

    }
}
