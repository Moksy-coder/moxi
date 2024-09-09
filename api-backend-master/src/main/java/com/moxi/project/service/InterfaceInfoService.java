package com.moxi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moxi.apicommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 * @author <a href="https://github.com/moxi">墨兮</a>
 * 
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
