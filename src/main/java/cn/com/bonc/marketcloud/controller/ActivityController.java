package cn.com.bonc.marketcloud.controller;

import cn.com.bonc.marketcloud.dao.CommonDao;
import cn.com.bonc.marketcloud.service.ActivityService;
import cn.com.bonc.marketcloud.util.ResultUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.management.snmp.jvmmib.EnumJvmThreadContentionMonitoring;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.List;

/**
 * @Author: Vloader
 * @Auther: 管理员
 * @Date: 2019/3/8 16:33
 * @Description:
 */
@RestController
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @RequestMapping( "/activityInfoList/{pageNum}/{pageSize}" )
    public Object selectActivityInfoList( @PathVariable Integer pageNum, @PathVariable Integer pageSize, @RequestParam(required = false) String keyWord ) {

        List list = activityService.selectActivityInfoList( pageNum, pageSize ,keyWord);
        //pageInfo中有许多分页参数，自行获取
        PageInfo< List > pageInfo = new PageInfo< List >( list );

        return ResultUtil.successTotal( list, pageInfo.getTotal() );
    }

}
