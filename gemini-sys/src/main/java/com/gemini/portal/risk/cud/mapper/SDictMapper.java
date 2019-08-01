package com.gemini.portal.risk.cud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uepay.corebusiness.risk.cud.service.po.SDictPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典表
 * @author wenge.cai
 */
@Mapper
public interface SDictMapper extends BaseMapper<SDictPo> {
}