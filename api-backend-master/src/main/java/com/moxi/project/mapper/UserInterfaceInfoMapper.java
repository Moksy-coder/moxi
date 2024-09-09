package com.moxi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.moxi.apicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




