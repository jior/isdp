package com.glaf.isdp.util;

public class RequestThreadLocal {

	static ThreadLocal<Integer> requestCounterThreadLocal = new ThreadLocal<Integer>();

	public static Integer getRequestCounter() {
		return requestCounterThreadLocal.get();
	}

	public static void removeRequestCounter() {
		requestCounterThreadLocal.remove();
	}

	public static void setRequestCounter(Integer requestCounter) {
		requestCounterThreadLocal.set(requestCounter);
	}

	private RequestThreadLocal() {

	}

}
