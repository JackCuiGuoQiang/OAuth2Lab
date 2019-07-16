package my.projectlab.oauth2Lab.service.impl;

import my.projectlab.oauth2Lab.dao.TbPermissionMapper;
import my.projectlab.oauth2Lab.entity.oauth2.TbPermission;
import my.projectlab.oauth2Lab.service.TbPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jack Cui
 * created at 2019 年 07 月 15 日 11:25
 */
@Service
public class TbPermissionServiceImpl implements TbPermissionService {
    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }

}
