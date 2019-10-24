package com.example.activiti6demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

/**
 * 任务完成监听
 *
 * @author dingjian
 * @version V1.0.1
 * @create 2019-10-23-18:48
 */
@Component
@Slf4j
public class CompleteTaskListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        log.info("{}==》完成了{}任务", delegateTask.getAssignee(), delegateTask.getName());

    }
}
