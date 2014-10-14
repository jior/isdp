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
package com.glaf.base.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaScriptTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException,
			ScriptException, Exception {
		ScriptEngine engine = new ScriptEngineManager()
				.getEngineByName("javascript");
		Bindings bind = engine.createBindings();
		bind.put("factor", 2); // 这里绑定一个factor的值为2.
		engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int first = input.nextInt();
			int sec = input.nextInt();
			System.out.println("输入的参数为：" + first + " , " + sec);
			engine.eval(new FileReader("./cal.js"));
			if (engine instanceof Invocable) {
				Invocable in = (Invocable) engine;
				Double result = (Double) in.invokeFunction("cal", first, sec);
				System.out.println("运算结果为：" + result.intValue());
			}
		}
	}

}
