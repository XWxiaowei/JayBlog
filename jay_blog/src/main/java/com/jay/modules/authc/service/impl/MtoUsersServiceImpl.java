package com.jay.modules.authc.service.impl;

import com.jay.modules.authc.entity.MtoUsers;
import com.jay.modules.authc.dao.MtoUsersMapper;
import com.jay.modules.authc.service.MtoUsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jay.modules.authc.vo.AccountProfile;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jay.xiang
 * @since 2018-10-13
 */
@Service
public class MtoUsersServiceImpl extends ServiceImpl<MtoUsersMapper, MtoUsers> implements MtoUsersService {

    @Override
    public AccountProfile login(String username, String password) {
        return null;
    }
}
