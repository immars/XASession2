package com.xingcloud.xa.session2.ra.expr;

import com.xingcloud.xa.session2.ra.Row;

/**
 * Author: mulisen
 * Date:   2/6/13
 */
public class Multiple extends BinaryExpression  {

	public Multiple(Expression left, Expression right) {
		super(left, right);
	}

	public Object evaluate(Row input) {
		return (Double)left.evaluate(input) * (Double)right.evaluate(input);
	}
}
