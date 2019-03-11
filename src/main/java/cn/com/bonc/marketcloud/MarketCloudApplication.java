package cn.com.bonc.marketcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.com.bonc.marketcloud.dao.mapper")
public class MarketCloudApplication {

    public static void main( String[] args ) {
        SpringApplication.run( MarketCloudApplication.class, args );
    }

}
