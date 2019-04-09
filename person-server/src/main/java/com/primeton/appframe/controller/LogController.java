package com.primeton.appframe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.primeton.appframe.common.annotation.Authority;
import com.primeton.appframe.common.annotation.ControllerLog;
import com.primeton.appframe.model.ILog;
import com.primeton.appframe.service.LogService;

/**
 * 日志Controller ClassName: LogController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年10月17日 下午1:24:45 <br/>
 *
 * @author Jin.He (mailto:hejin@primeton.com)
 * @version
 */
@Controller
@RequestMapping("/admin/log/")
public class LogController extends BaseController {

	@Autowired
	private LogService logService;

	@Authority(opCode = "0301", opName = "日志管理界面")
	@RequestMapping("mainPage")
	public String mainPage() {
		return "log/main";
	}

	@ControllerLog("查询日志列表")
	@RequestMapping("queryPage")
	@ResponseBody
	@Authority(opCode = "0301", opName = "查询日志列表")
	public List<ILog> queryPage(ILog log) {
		return logService.queryPage(log);
	}
}
