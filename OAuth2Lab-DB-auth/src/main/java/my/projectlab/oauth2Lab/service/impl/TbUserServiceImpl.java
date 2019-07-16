package my.projectlab.oauth2Lab.service.impl;

import my.projectlab.oauth2Lab.dao.TbUserMapper;
import my.projectlab.oauth2Lab.entity.oauth2.TbUser;
import my.projectlab.oauth2Lab.service.TbUserService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;

/**
 * @author Jack Cui
 * created at 2019 年 07 月 15 日 11:14
 */
@Service
public class TbUserServiceImpl implements TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
