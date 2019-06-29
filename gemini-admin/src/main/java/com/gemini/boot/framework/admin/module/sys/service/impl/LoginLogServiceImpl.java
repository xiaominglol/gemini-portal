package com.gemini.boot.framework.admin.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gemini.boot.framework.admin.module.sys.mapper.LoginLogMapper;
import com.gemini.boot.framework.admin.module.sys.model.LoginLog;
import com.gemini.boot.framework.admin.module.sys.service.LoginLogService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author 小明不读书
 * @date 2018-10-18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {

}
