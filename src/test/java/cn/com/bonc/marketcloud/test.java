package cn.com.bonc.marketcloud;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: Vloader
 * @Auther: 管理员
 * @Date: 2019/3/8 17:13
 * @Description:
 */
public class test {

    volatile  int i =1;

    ExecutorService newCachedThreadPool = Executors.newFixedThreadPool( 5 );


    public static void main( String[] args ) {

    }
}
