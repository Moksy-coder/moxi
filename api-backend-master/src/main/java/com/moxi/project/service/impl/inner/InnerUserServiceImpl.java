package com.moxi.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moxi.project.common.ErrorCode;
import com.moxi.project.exception.BusinessException;
import com.moxi.project.mapper.UserMapper;
import com.moxi.apicommon.model.entity.User;
import com.moxi.apicommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部用户服务实现类
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    // [编程知识星球](https://moxi.icu) 零基础快速入门编程，不走弯路！30+ 原创学习路线和专栏、1000+ 编程精华文章、500+ 编程学习指南、20T+ 编程资源汇总

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
