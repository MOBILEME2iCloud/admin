package com.looker.core.common.extension

infix fun Long.percentBy(denominator: Long?): Int =
	try {
		(toInt() * 100) / (denominator ?: -1L).toInt()
	} catch (e: ArithmeticException) {
		e.printStackTrace()
		-1
	}