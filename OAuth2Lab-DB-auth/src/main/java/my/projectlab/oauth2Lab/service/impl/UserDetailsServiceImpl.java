package my.projectlab.oauth2Lab.service.impl;

import my.projectlab.oauth2Lab.entity.oauth2.TbPermission;
import my.projectlab.oauth2Lab.entity.oauth2.TbUser;
import my.projectlab.oauth2Lab.service.TbPermissionService;
import my.projectlab.oauth2Lab.service.TbUserService;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 用户权限信息获取
 *
 * @author Jack Cui
 * created at 2019 年 07 月 15 日 11:22
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private TbUserService tbUserService;

    @Resource
    private TbPermissionService tbPermissionService;

    @Override

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        TbUser tbUser = tbUserService.getByUsername(username);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        if (tbUser != null) {
            //获取用户授权
            List<TbPermission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());


            //声明用户授权
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }
        //由框架完成认证工作
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}
