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
package com.glaf.bpmn.parse;

import java.io.ByteArrayInputStream;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.domain.FlowForwardDefEntity;
import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.core.util.IOUtils;

public class BpmnXmlReader {

	public FlowProcessDefEntity read(byte[] bytes) {
		java.io.InputStream inputStream = null;
		try {
			inputStream = new ByteArrayInputStream(bytes);
			return this.read(inputStream);
		} finally {
			IOUtils.closeStream(inputStream);
		}
	}

	public FlowProcessDefEntity read(java.io.InputStream inputStream) {
		FlowProcessDefEntity flowProcessDef = new FlowProcessDefEntity();
		SAXReader xmlReader = new SAXReader();
		try {
			Document doc = xmlReader.read(inputStream);
			Element root = doc.getRootElement();
			Element definitionsElement = root.element("definitions");
			if (definitionsElement != null) {
				Element processElement = definitionsElement.element("process");
				flowProcessDef.setId(processElement.attributeValue("id"));
				flowProcessDef.setName(processElement.attributeValue("name"));
				Element startEventElement = processElement
						.element("startEvent");
				FlowActivityDefEntity startActivity = new FlowActivityDefEntity();
				startActivity.setId(flowProcessDef.getId() + "_"
						+ startEventElement.attributeValue("id"));
				startActivity.setProcessId(flowProcessDef.getId());
				startActivity.setName(startEventElement.attributeValue("name"));
				startActivity.setTypeofact("1");
				flowProcessDef.addActivity(startActivity);

				List<?> endEventElements = processElement.elements("endEvent");
				if (endEventElements != null && !endEventElements.isEmpty()) {
					Iterator<?> iterator = endEventElements.iterator();
					while (iterator.hasNext()) {
						Element endEventElement = (Element) iterator.next();
						FlowActivityDefEntity endActivity = new FlowActivityDefEntity();
						endActivity.setId(flowProcessDef.getId() + "_"
								+ endEventElement.attributeValue("id"));
						endActivity.setProcessId(flowProcessDef.getId());
						endActivity.setName(endEventElement
								.attributeValue("name"));
						endActivity.setTypeofact("2");
						flowProcessDef.addActivity(endActivity);
					}
				}

				List<?> userTaskElements = processElement.elements("userTask");
				if (userTaskElements != null && !userTaskElements.isEmpty()) {
					int listno = 1;
					Iterator<?> iterator = userTaskElements.iterator();
					while (iterator.hasNext()) {
						Element userTaskElement = (Element) iterator.next();
						FlowActivityDefEntity userTaskActivity = new FlowActivityDefEntity();
						userTaskActivity.setId(flowProcessDef.getId() + "_"
								+ userTaskElement.attributeValue("id"));
						userTaskActivity.setProcessId(flowProcessDef.getId());
						userTaskActivity.setName(userTaskElement
								.attributeValue("name"));
						userTaskActivity.setTypeofact("0");
						userTaskActivity.setListno(listno++);
						Element potentialOwnerElement = userTaskElement
								.element("potentialOwner");
						if (potentialOwnerElement != null) {
							Element resourceAssignmentExpressionElement = potentialOwnerElement
									.element("resourceAssignmentExpression");
							if (resourceAssignmentExpressionElement != null) {
								String roleCode = resourceAssignmentExpressionElement
										.elementTextTrim("formalExpression");
								userTaskActivity.setNetrolecode(roleCode);
							}
						}
						flowProcessDef.addActivity(userTaskActivity);
					}
				}

				List<?> sequenceFlowElements = processElement
						.elements("sequenceFlow");
				if (sequenceFlowElements != null
						&& !sequenceFlowElements.isEmpty()) {
					Iterator<?> iterator = sequenceFlowElements.iterator();
					while (iterator.hasNext()) {
						Element userTaskElement = (Element) iterator.next();
						FlowForwardDefEntity flowForwardDef = new FlowForwardDefEntity();
						flowForwardDef.setId(flowProcessDef.getId() + "_"
								+ userTaskElement.attributeValue("id"));
						flowForwardDef.setProcessId(flowProcessDef.getId());
						flowForwardDef.setActivPre(flowProcessDef.getId() + "_"
								+ userTaskElement.attributeValue("sourceRef"));
						flowForwardDef.setActivNext(flowProcessDef.getId()
								+ "_"
								+ userTaskElement.attributeValue("targetRef"));
						flowForwardDef.setName(userTaskElement
								.attributeValue("name"));
						flowProcessDef.addSequenceFlow(flowForwardDef);
					}
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
		return flowProcessDef;
	}

}
