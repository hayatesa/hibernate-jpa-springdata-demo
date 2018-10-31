package top.rsmzjp.main.controller;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import top.rsmzjp.main.util.ResultMap;

@RestController
@RequestMapping("/api")
@Api("RestDemo api")
public class RestDemoController {

    private static final Logger logger= LoggerFactory.getLogger(RestDemoController.class);

    @ApiOperation(value="get 请求", notes="测试get请求")
    @ApiImplicitParam(name="param", value="参数")
    @GetMapping("getDemo")
    public ResultMap doGet(Integer param) {
        logger.info("getDemo: " + param);
        return ResultMap.success();
    }

    @ApiOperation(value="post 请求", notes="测试post请求")
    @ApiImplicitParams({
          @ApiImplicitParam(name="param1", value="参数1"),
          @ApiImplicitParam(name="param2", value="参数2")
    })
    @PostMapping("postDemo")
    public ResultMap doPost(@RequestParam Integer param1,
                            @RequestParam Integer param2) {
        logger.info("getDemo: " + param1 + " " + param2);
        return ResultMap.success();
    }

    @ApiIgnore
    @GetMapping("ingnore")
    public ResultMap doIgnore() {
        return ResultMap.success();
    }
}
