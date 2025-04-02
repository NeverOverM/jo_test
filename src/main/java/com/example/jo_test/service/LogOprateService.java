package com.example.jo_test.service;

import com.example.jo_test.entity.LogOprate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (LogOprate)表服务接口
 *
 * @author makejava
 * @since 2025-04-02 22:36:09
 */
public interface LogOprateService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogOprate queryById(Integer id);

    /**
     * 分页查询
     *
     * @param logOprate   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<LogOprate> queryByPage(LogOprate logOprate, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param logOprate 实例对象
     * @return 实例对象
     */
    LogOprate insert(LogOprate logOprate);

    /**
     * 修改数据
     *
     * @param logOprate 实例对象
     * @return 实例对象
     */
    LogOprate update(LogOprate logOprate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
