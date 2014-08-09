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

package com.glaf.base.modules.sys.model;

import java.util.*;

public class ObjectEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	protected String stringValue;
	protected int intValue;
	protected long longValue;
	protected double doubleValue;
	protected Date dateValue;
	protected Collection<Integer> intList = new HashSet<Integer>();
	protected Collection<Long> longList = new HashSet<Long>();
	protected Collection<Double> doubleList = new HashSet<Double>();
	protected Collection<Date> dateList = new HashSet<Date>();
	protected Collection<String> stringList = new HashSet<String>();

	public ObjectEntity() {

	}

	public Collection<Date> getDateList() {
		return dateList;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public Collection<Double> getDoubleList() {
		return doubleList;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public Collection<Integer> getIntList() {
		return intList;
	}

	public int getIntValue() {
		return intValue;
	}

	public Collection<Long> getLongList() {
		return longList;
	}

	public long getLongValue() {
		return longValue;
	}

	public Collection<String> getStringList() {
		return stringList;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setDateList(Collection<Date> dateList) {
		this.dateList = dateList;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public void setDoubleList(Collection<Double> doubleList) {
		this.doubleList = doubleList;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public void setIntList(Collection<Integer> intList) {
		this.intList = intList;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public void setLongList(Collection<Long> longList) {
		this.longList = longList;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public void setStringList(Collection<String> stringList) {
		this.stringList = stringList;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

}
