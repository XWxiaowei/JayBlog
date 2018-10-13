package com.jay.modules.authc.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户角色表
 * </p>
 *
 * @author jay.xiang
 * @since 2018-10-13
 */
@TableName("shiro_user_role")
public class ShiroUserRole extends Model<ShiroUserRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long roleId;
    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "ShiroUserRole{" +
        ", roleId=" + roleId +
        ", userId=" + userId +
        "}";
    }
}
