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
package com.glaf.dms.bean;

public class DisplayField {

	private String name;

	private String type;

	private String title;

	private String systemFlag;

	private String listShowFlag;

	private int sortNo;

	public DisplayField() {

	}

	public String getListShowFlag() {
		return listShowFlag;
	}

	public String getName() {
		return name;
	}

	public int getSortNo() {
		return sortNo;
	}

	public String getSystemFlag() {
		return systemFlag;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public void setListShowFlag(String listShowFlag) {
		this.listShowFlag = listShowFlag;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public void setSystemFlag(String systemFlag) {
		this.systemFlag = systemFlag;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

}
