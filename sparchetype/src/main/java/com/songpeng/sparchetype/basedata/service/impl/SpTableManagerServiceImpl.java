package com.songpeng.sparchetype.basedata.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.songpeng.sparchetype.basedata.entity.SpTableManager;
import com.songpeng.sparchetype.basedata.entity.SpTableManagerItem;
import com.songpeng.sparchetype.basedata.mapper.SpTableManagerMapper;
import com.songpeng.sparchetype.basedata.service.ISpTableManagerService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author WangZiYang
 * @since 2020-03-06
 */
@Service
public class SpTableManagerServiceImpl extends ServiceImpl<SpTableManagerMapper, SpTableManager> implements ISpTableManagerService {
    /**
     * 基础管理表mapper
     */
    @Autowired
    private SpTableManagerMapper spTableManagerMapper;

    /**
     * 查询表对应的字段
     *
     * @param req 表信息
     * @return 字段信息
     */
    @Override
    public List<SpTableManagerItem> queryTableFieldByName(SpTableManager req) throws Exception {
        List<SpTableManagerItem> spTableManagerItems = spTableManagerMapper.queryTableFieldByName(req);
        if (CollectionUtil.isEmpty(spTableManagerItems)) {
            throw new Exception("表不存在数据库中。请核对");
        }
        return spTableManagerItems;
    }


}