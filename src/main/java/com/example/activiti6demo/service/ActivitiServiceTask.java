package com.example.activiti6demo.service;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author dingjian
 * @version V1.0.1
 * @create 2019-10-23-18:42
 */
@Service
@Slf4j
public class ActivitiServiceTask {


    public void doNotify(DelegateExecution execution) {
        Map<String, Object> variables = execution.getVariables();

        log.info("亲爱的{}恭喜你的请假申请已通过，请享受你的{}天假期吧！", variables.get("name"),
                variables.get("days"));
    }
}
