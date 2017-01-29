package com.alu.ipprd.iac.integeration.common.exception;

public class RCAException extends Exception {
	/**
	 * AC-Logger class
	 */
	private static final long serialVersionUID = 1247255613805984353L;

	public RCAException(String msg) {
		// avoid duplicate printing which causes confusion. log.error(msg);
		super(msg);
	}

	public RCAException(Throwable msg) {
		super(msg);
	}

	public RCAException(String msg, Throwable t) {
		super(msg, t);
	}
}
