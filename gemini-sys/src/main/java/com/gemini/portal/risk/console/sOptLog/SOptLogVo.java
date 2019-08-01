package com.gemini.portal.risk.console.sOptLog;

import com.uepay.corebusiness.risk.base.dict.Dicts;
import com.uepay.corebusiness.risk.base.vo.BaseVo;
import com.uepay.framework.normalize.Dict;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 操作日志表
 * @author wenge.cai
 */
@Data
public class SOptLogVo extends BaseVo {

    /**
     * 逻辑主键（UUID）
     */
    private Long id;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 
     */
    private Long optTypeId;

    /**
     * 操作类型（1=查询，2=添加，3=修改，4=删除，5=用户登陆）
     */
    private String optTypeCode;

    /**
     * 
     */
    private String optTypeName;

    /**
     * 操作描述
     */
    private String description;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 请求方法名称
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 返回结果
     */
    private String result;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 耗时（ms）
     */
    private Long time;

    /**
     * 操作时间
     */
    private Date createDatetime;

    /**
     * 逻辑主键（UUID）
     */
    private Long id;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 
     */
    private Long optTypeId;

    /**
     * 操作类型（1=查询，2=添加，3=修改，4=删除，5=用户登陆）
     */
    private String optTypeCode;

    /**
     * 
     */
    private String optTypeName;

    /**
     * 操作描述
     */
    private String description;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 请求方法名称
     */
    private String method;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 返回结果
     */
    private String result;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 耗时（ms）
     */
    private Long time;

    /**
     * 操作时间
     */
    private Date createDatetime;
}