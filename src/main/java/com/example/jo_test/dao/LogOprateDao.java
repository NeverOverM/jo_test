package com.example.jo_test.dao;

import com.example.jo_test.entity.LogOprate;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (LogOprate)表数据库访问层
 *
 * @author makejava
 * @since 2025-04-02 22:36:09
 */
public interface LogOprateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LogOprate queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param logOprate 查询条件
     * @param pageable  分页对象
     * @return 对象列表
     */
    List<LogOprate> queryAllByLimit(LogOprate logOprate, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param logOprate 查询条件
     * @return 总行数
     */
    long count(LogOprate logOprate);

    /**
     * 新增数据
     *
     * @param logOprate 实例对象
     * @return 影响行数
     */
    int insert(LogOprate logOprate);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LogOprate> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LogOprate> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LogOprate> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<LogOprate> entities);

    /**
     * 修改数据
     *
     * @param logOprate 实例对象
     * @return 影响行数
     */
    int update(LogOprate logOprate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

