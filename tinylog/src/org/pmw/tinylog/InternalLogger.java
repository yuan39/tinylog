/*
 * Copyright 2013 Martin Winandy
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package org.pmw.tinylog;

import java.text.MessageFormat;

/**
 * Static logger for logging internal problems in tinylog.
 * 
 * Log entries will be always output into the console.
 */
final class InternalLogger {

	private static final String PREFIX = "LOGGING ERROR: ";

	private InternalLogger() {
	}

	/**
	 * Log an internal error.
	 * 
	 * @param message
	 *            Text to log
	 */
	public static void error(final String message) {
		System.err.println(PREFIX + message);
	}

	/**
	 * Log an internal error.
	 * 
	 * @param message
	 *            Formated text to log
	 * @param arguments
	 *            Arguments for the text message
	 * 
	 * @see MessageFormat#format(String, Object...)
	 */
	public static void error(final String message, final Object... arguments) {
		error(MessageFormat.format(message, arguments));
	}

	/**
	 * Log an internal error.
	 * 
	 * @param exception
	 *            Exception to log
	 */
	public static void error(final Throwable exception) {
		String message = exception.getMessage();
		if (message == null || message.length() == 0) {
			error(exception.getClass().getName());
		} else {
			error(message + " (" + exception.getClass().getName() + ")");
		}
	}

	/**
	 * Log an internal error.
	 * 
	 * @param exception
	 *            Exception to log
	 * @param message
	 *            Text to log
	 */
	public static void error(final Throwable exception, final String message) {
		String messageOfThrowable = exception.getMessage();
		if (messageOfThrowable == null || messageOfThrowable.length() == 0) {
			error(message + " (" + exception.getClass().getName() + ")");
		} else {
			error(message + " (" + exception.getClass().getName() + ": " + messageOfThrowable + ")");
		}
	}

	/**
	 * Log an internal error.
	 * 
	 * @param exception
	 *            Exception to log
	 * @param message
	 *            Formated text to log
	 * @param arguments
	 *            Arguments for the text message
	 * 
	 * @see MessageFormat#format(String, Object...)
	 */
	public static void error(final Throwable exception, final String message, final Object... arguments) {
		error(exception, MessageFormat.format(message, arguments));
	}

}