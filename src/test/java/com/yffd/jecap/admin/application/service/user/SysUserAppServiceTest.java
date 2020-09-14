package com.yffd.jecap.admin.application.service.user;

import com.alibaba.fastjson.JSON;
import com.yffd.jecap.admin.AdminBaseTest;
import com.yffd.jecap.admin.domain.sys.user.entity.SysUser;
import com.yffd.jecap.common.base.result.RtnResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysUserAppServiceTest extends AdminBaseTest {
    @Autowired
    private SysUserAppService sysUserAppService;

    @Test
    public void addTest() {
        SysUser entity = new SysUser();
        entity.setUserName("王五");
        this.sysUserAppService.add(entity);
    }

    @Test
    public void getListTest() {
        SysUser entity = new SysUser();
        entity.setUserName("李四");
        RtnResult<SysUser> result = this.sysUserAppService.getPage(entity, 0, 10);
        System.out.println(JSON.toJSONString(result));
    }
}
