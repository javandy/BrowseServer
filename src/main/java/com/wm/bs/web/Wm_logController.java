package com.wm.bs.web;

import com.wm.bs.domain.Wm_log;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/wm_logs")
@Controller
@RooWebScaffold(path = "wm_logs", formBackingObject = Wm_log.class)
@RooWebJson(jsonObject = Wm_log.class)
public class Wm_logController {
}
