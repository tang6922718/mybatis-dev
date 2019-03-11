package cn.com.bonc.marketcloud.service;

import cn.com.bonc.marketcloud.dao.mapper.ActivityMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: Vloader
 * @Auther: 管理员
 * @Date: 2019/3/8 17:07
 * @Description:
 */
@Service
public class ActivityService {


    @Autowired
    ActivityMapper activityMapper;


    public List< Map > selectActivityInfoList(Integer pageNum,Integer pageSize,String keyWord) {
        PageHelper.startPage(pageNum,pageSize);
        return activityMapper.selectActivityInfoList(keyWord);
    }

}
