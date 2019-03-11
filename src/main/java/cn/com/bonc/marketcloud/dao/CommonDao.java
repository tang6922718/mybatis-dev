package cn.com.bonc.marketcloud.dao;

import cn.com.bonc.marketcloud.dao.mapper.CommonMapper1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Vloader
 * @Auther: 管理员
 * @Date: 2019/3/8 16:31
 * @Description:
 */
@Repository
public class CommonDao {


    @Autowired
    private CommonMapper1 mapper;

    public List<String> getTopic() {
        return mapper.getTopic();
    }

    public String getContactorName(){
        return null;
    }

}
