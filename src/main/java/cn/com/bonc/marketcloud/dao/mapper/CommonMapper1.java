package cn.com.bonc.marketcloud.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommonMapper1 {

    @Select("SELECT topic_name FROM epm_kafka_topics ")
    List<String> getTopic();
}
