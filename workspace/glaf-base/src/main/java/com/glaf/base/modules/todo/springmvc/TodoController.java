/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.todo.springmvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.core.todo.Todo;
import com.glaf.core.util.RequestUtils;

import com.glaf.base.modules.todo.service.TodoService;

@Controller("/user/todo")
@RequestMapping("/user/todo")
public class TodoController {

	protected static final Log logger = LogFactory.getLog(TodoController.class);

	private TodoService todoService;

	/**
	 * ��ʾTODO�б�
	 * 
	 * @return
	 */
	@RequestMapping("/indexList")
	public ModelAndView indexList(ModelMap modelMap, HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		List<Todo> rows = todoService.getAllTodoList();
		request.setAttribute("rows", rows);
		return new ModelAndView("/modules/sys/todo/indexList", modelMap);
	}

	/**
	 * ��ʾTODO�б�
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView list(ModelMap modelMap, HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		List<Todo> rows = todoService.getAllTodoList();
		request.setAttribute("rows", rows);
		return new ModelAndView("/modules/sys/todo/list", modelMap);
	}

	@javax.annotation.Resource
	public void setTodoService(TodoService todoService) {
		this.todoService = todoService;
	}

	/**
	 * ��ʾTODO�б�
	 * 
	 * @return
	 */
	@RequestMapping("/taskList")
	public ModelAndView taskList(ModelMap modelMap, HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		List<Todo> rows = todoService.getAllTodoList();
		request.setAttribute("rows", rows);
		return new ModelAndView("/modules/sys/todo/taskList", modelMap);
	}

}