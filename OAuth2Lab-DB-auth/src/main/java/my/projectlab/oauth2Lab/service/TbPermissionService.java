package my.projectlab.oauth2Lab.service;

import my.projectlab.oauth2Lab.entity.oauth2.TbPermission;

import java.util.List;

public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long userId);
}
