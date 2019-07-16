package my.projectlab.oauth2Lab.service;


import my.projectlab.oauth2Lab.entity.oauth2.TbUser;

public interface TbUserService {
    TbUser getByUsername(String username);
}
