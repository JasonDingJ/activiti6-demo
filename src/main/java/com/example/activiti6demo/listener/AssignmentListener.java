package com.example.activiti6demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

/**
 * 审批人员分配监听
 *
 * @author dingjian
 * @version V1.0.1
 * @create 2019-10-23-18:45
 */
@Component
@Slf4j
public class AssignmentListener implements TaskListener {


    @Override
    public void notify(DelegateTask delegateTask) {
        String name = delegateTask.getTaskDefinitionKey();
        if ("leaderApprove".equals(name)) {
            delegateTask.setAssignee("涛哥");
        } else if ("managerApprove".equals(name)) {
            delegateTask.setAssignee("老大");
        }

    }
}
