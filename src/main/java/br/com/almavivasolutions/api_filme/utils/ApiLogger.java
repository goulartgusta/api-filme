package br.com.almavivasolutions.api_filme.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiLogger {
	private static final Logger logger = LoggerFactory.getLogger(ApiLogger.class);

	public static void logInfo(String request) {
		logger.info(request);
	}

	public static void logWarn(String request) {
		logger.warn(request);
	}

	public static void logError(String errors) {
		logger.error(errors);
	}
}