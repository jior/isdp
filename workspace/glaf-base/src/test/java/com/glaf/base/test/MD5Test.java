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

import org.mindrot.jbcrypt.BCrypt;

public class MD5Test {

	public static String hash(final String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt(16));
	}

	public static boolean check(final String password, final String hashPassword) {
		return BCrypt.checkpw(password, hashPassword);
	}

	public static void main(String[] args) {
		System.out.println(org.apache.commons.codec.digest.DigestUtils
				.md5Hex("admin"));
		System.out.println(org.apache.commons.codec.digest.DigestUtils
				.md5Hex("111111"));
		System.out.println(hash("111111"));
		String pwd = "$2a$16$7eGceHTfuBjNGxtpQL6ttOTwkXFL04W/UlDFoDFFM3e89uFZYCIQ6";
		System.out.println(check("111111", pwd));
	}

}
