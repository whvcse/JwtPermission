package org.wf.jwtp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置属性
 * Created by wangfan on 2018-12-29 下午 2:13.
 */
@ConfigurationProperties(prefix = "jwtp")
public class JwtPermissionProperties {
    /**
     * token存储方式，0 redis存储，1 数据库存储
     */
    private Integer storeType = 0;

    /**
     * 拦截路径，多个路径用逗号分隔
     */
    private String[] path = new String[]{"/**"};

    /**
     * 排除拦截路径，多个路径用逗号分隔
     */
    private String[] excludePath = new String[]{};

    /**
     * 单个用户最大的token数量
     */
    private Integer maxToken = -1;

    /**
     * 自定义查询用户角色的sql
     */
    String findRolesSql;

    /**
     * 自定义查询用户权限的sql
     */
    String findPermissionsSql;

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public String[] getPath() {
        return path;
    }

    public void setPath(String[] path) {
        this.path = path;
    }

    public String[] getExcludePath() {
        return excludePath;
    }

    public void setExcludePath(String[] excludePath) {
        this.excludePath = excludePath;
    }

    public Integer getMaxToken() {
        return maxToken;
    }

    public void setMaxToken(Integer maxToken) {
        this.maxToken = maxToken;
    }

    public String getFindRolesSql() {
        return findRolesSql;
    }

    public void setFindRolesSql(String findRolesSql) {
        this.findRolesSql = findRolesSql;
    }

    public String getFindPermissionsSql() {
        return findPermissionsSql;
    }

    public void setFindPermissionsSql(String findPermissionsSql) {
        this.findPermissionsSql = findPermissionsSql;
    }

}
