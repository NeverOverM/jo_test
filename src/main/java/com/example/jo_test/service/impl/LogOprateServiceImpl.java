package com.example.jo_test.service.impl;

import com.example.jo_test.entity.LogOprate;
import com.example.jo_test.dao.LogOprateDao;
import com.example.jo_test.service.LogOprateService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (LogOprate)表服务实现类
 *
 * @author makejava
 * @since 2025-04-02 22:36:09
 */
@Service("logOprateService")
public class LogOprateServiceImpl implements LogOprateService {
    @Resource
    private LogOprateDao logOprateDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LogOprate queryById(Integer id) {
        return this.logOprateDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param logOprate   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<LogOprate> queryByPage(LogOprate logOprate, PageRequest pageRequest) {
        long total = this.logOprateDao.count(logOprate);
        return new PageImpl<>(this.logOprateDao.queryAllByLimit(logOprate, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param logOprate 实例对象
     * @return 实例对象
     */
    @Override
    public LogOprate insert(LogOprate logOprate) {
        this.logOprateDao.insert(logOprate);
        return logOprate;
    }

    /**
     * 修改数据
     *
     * @param logOprate 实例对象
     * @return 实例对象
     */
    @Override
    public LogOprate update(LogOprate logOprate) {
        this.logOprateDao.update(logOprate);
        return this.queryById(logOprate.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.logOprateDao.deleteById(id) > 0;
    }
}
