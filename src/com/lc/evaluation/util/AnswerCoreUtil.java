package com.lc.evaluation.util;

import java.util.List;

public class AnswerCoreUtil {

	static float A = 9.9f;
	static float B = 8.5f;
	static float C = 6.5f;
	static float D = 4.5f;
	
	static public float getCore(String answer){
		switch(answer.toLowerCase()){
		case "a":
			return A;
		case "b":
			return B;
		case "c":
			return C;
		case "d":
			return D;
		}
		return 0;
	}
	
	static public float getCore(List<String> answers){
		float sum = 0f;
		for (String string : answers) {
			sum += getCore(string);
		}
		return sum;
	}
}
