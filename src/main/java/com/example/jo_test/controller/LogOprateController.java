package com.example.jo_test.controller;

import com.example.jo_test.entity.LogOprate;
import com.example.jo_test.service.LogOprateService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LogOprate)表控制层
 *
 * @author makejava
 * @since 2025-04-02 22:36:09
 */
@RestController
@RequestMapping("logOprate")
@Api(tags = "")
public class LogOprateController {
    /**
     * 服务对象
     */
    @Resource
    private LogOprateService logOprateService;

    /**
     * 分页查询
     *
     * @param logOprate   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    @ApiOperation(value = "分页查询")
    public ResponseEntity<Page<LogOprate>> queryByPage(LogOprate logOprate, PageRequest pageRequest) {
        return ResponseEntity.ok(this.logOprateService.queryByPage(logOprate, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    @ApiOperation(value = "通过主键查询单条数据")
    public ResponseEntity<LogOprate> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.logOprateService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param logOprate 实体
     * @return 新增结果
     */
    @PostMapping
    @ApiOperation(value = "新增数据")
    public ResponseEntity<LogOprate> add(LogOprate logOprate) {
        return ResponseEntity.ok(this.logOprateService.insert(logOprate));
    }

    /**
     * 编辑数据
     *
     * @param logOprate 实体
     * @return 编辑结果
     */
    @PutMapping
    @ApiOperation(value = "编辑数据")
    public ResponseEntity<LogOprate> edit(LogOprate logOprate) {
        return ResponseEntity.ok(this.logOprateService.update(logOprate));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    @ApiOperation(value = "删除数据")
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.logOprateService.deleteById(id));
    }

}

