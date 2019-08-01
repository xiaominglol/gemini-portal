package com.gemini.portal.risk.console.sMenu;

import com.baomidou.mybatisplus.annotation.TableName;
import com.uepay.corebusiness.risk.base.po.BasePo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 菜单表
 * @author wenge.cai
 */
@Data
@TableName("f_sys_menu")
public class SMenuPo extends BasePo {

    /**
     * 主表id（UUID）如果为null，则为顶级
     */
    private Long pid;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 菜单类型id
     */
    private Long menuTypeId;

    /**
     * 菜单类型编码
     */
    private String menuTypeCode;

    /**
     * 菜单类型名称
     */
    private String menuTypeName;

    /**
     * 打开方式id
     */
    private Long targetId;

    /**
     * 打开方式编码
     */
    private String targetCode;

    /**
     * 打开方式名称
     */
    private String targetName;

    /**
     * 权限id
     */
    private Long permissionId;

    /**
     * 权限编码
     */
    private String permissionCode;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态id
     */
    private Long stateId;

    /**
     * 状态编码（Enable：启用，Disable：禁用）
     */
    private String stateCode;

    /**
     * 状态名称
     */
    private String stateName;

    /**
     * 修改人id
     */
    private Long modifyId;

    /**
     * 修改人名称
     */
    private String modifyName;

    /**
     * 修改时间(YYYY-MM-DD HH:MM:SS)
     */
    private String modifyTime;

    /**
     * 主表id（UUID）如果为null，则为顶级
     */
    private Long pid;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 菜单类型id
     */
    private Long menuTypeId;

    /**
     * 菜单类型编码
     */
    private String menuTypeCode;

    /**
     * 菜单类型名称
     */
    private String menuTypeName;

    /**
     * 打开方式id
     */
    private Long targetId;

    /**
     * 打开方式编码
     */
    private String targetCode;

    /**
     * 打开方式名称
     */
    private String targetName;

    /**
     * 权限id
     */
    private Long permissionId;

    /**
     * 权限编码
     */
    private String permissionCode;

    /**
     * 权限名称
     */
    private String permissionName;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态id
     */
    private Long stateId;

    /**
     * 状态编码（Enable：启用，Disable：禁用）
     */
    private String stateCode;

    /**
     * 状态名称
     */
    private String stateName;

    /**
     * 修改人id
     */
    private Long modifyId;

    /**
     * 修改人名称
     */
    private String modifyName;

    /**
     * 修改时间(YYYY-MM-DD HH:MM:SS)
     */
    private String modifyTime;
}