package top.rsmzjp.main.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.rsmzjp.main.service.IDemoService;
import top.rsmzjp.main.util.Constant;
import top.rsmzjp.main.util.ResultMap;

@RestController
@RequestMapping("/api/demoEntity")
@Api("JPA Demo api")
public class DemoController {

    @Autowired
    private IDemoService demoService;

    public void setDemoService(IDemoService demoService) {
        this.demoService = demoService;
    }

    @ApiOperation(value="根据名称查找实体", notes="根据名称查找实体")
    @ApiImplicitParam(name="name", value="名称")
    @GetMapping("findByName")
    public ResultMap findByName(@RequestParam("name") String name) {
        return ResultMap.success().putData(demoService.findByName(name));
    }

    @ApiOperation(value="添加实体", notes="添加实体")
    @ApiImplicitParam(name="name", value="名称")
    @GetMapping("add")
    public ResultMap add() {
        return ResultMap.success();
    }

    @ApiOperation(value="保存实体", notes="保存实体")
    @ApiImplicitParam(name="name", value="名称")
    @GetMapping("save")
    public ResultMap save() {
        return ResultMap.success();
    }

}
