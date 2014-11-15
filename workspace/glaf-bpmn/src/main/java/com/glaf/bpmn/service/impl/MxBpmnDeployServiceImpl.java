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
package com.glaf.bpmn.service.impl;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.zip.ZipInputStream;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.bpmn.parse.BpmnXmlReader;
import com.glaf.bpmn.service.BpmnDeployService;
import com.glaf.bpmn.service.BpmnProcessDefService;
import com.glaf.core.util.ZipUtils;

@Service("bpmnDeployService")
@Transactional
public class MxBpmnDeployServiceImpl implements BpmnDeployService {

	protected BpmnProcessDefService bpmnProcessDefService;

	@Transactional
	public FlowProcessDefEntity addZipInputStream(ZipInputStream zipInputStream) {
		Map<String, byte[]> zipMap = ZipUtils.getZipBytesMap(zipInputStream);
		if (zipMap != null && zipMap.size() == 2) {
			Set<Entry<String, byte[]>> entrySet = zipMap.entrySet();
			for (Entry<String, byte[]> entry : entrySet) {
				String name = entry.getKey();
				byte[] bytes = entry.getValue();
				if (name.endsWith(".bpmn20.xml")) {
					BpmnXmlReader reader = new BpmnXmlReader();
					FlowProcessDefEntity flowProcessDefEntity = reader
							.read(bytes);
					String picName = flowProcessDefEntity.getName() + ".jpg";
					byte[] image = zipMap.get(picName);
					if (image == null) {
						picName = flowProcessDefEntity.getName() + ".gif";
						image = zipMap.get(picName);
					}
					flowProcessDefEntity.setPicfile(image);
					flowProcessDefEntity.setPicname(picName);
					bpmnProcessDefService.save(flowProcessDefEntity);
					return flowProcessDefEntity;
				}
			}
		}
		return null;
	}

	@javax.annotation.Resource
	public void setBpmnProcessDefService(
			BpmnProcessDefService bpmnProcessDefService) {
		this.bpmnProcessDefService = bpmnProcessDefService;
	}

}
