package com.example.activiti6demo;

import lombok.extern.slf4j.Slf4j;
import org.activiti.engine.ManagementService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import javax.naming.Name;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
class Activiti6DemoApplicationTests {

	@Autowired
	private TaskService taskService;

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private RepositoryService repositoryService;

	@Autowired
	private ManagementService managerService;



	@Test

	public void testApplicationForLeave(){
		Map variables = new HashMap();
		variables.put("name","丁建");
		variables.put("days","3");
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("myActivitiDemoProcess", variables);
		log.info("流程启动成功，流程id为:{}", pi.getId());
		Task task1 = taskService.createTaskQuery().taskAssignee("涛哥").singleResult();
		if (null!= task1){
			taskService.complete(task1.getId());
		}
		Task task2 = taskService.createTaskQuery().taskAssignee("老大").singleResult();
		if (null!= task2){
			taskService.complete(task2.getId());
		}

	}

}
