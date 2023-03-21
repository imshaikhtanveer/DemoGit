package com.quiz.examination;
import com.quiz.*;
public class Questions {
private String Questions;
private String Opt_1;
private String Opt_2;
private String Opt_3;
private String Opt_4;
public Questions() {
}
public Questions(String questions, String opt_1, String opt_2, String opt_3, String opt_4) {
	super();
	Questions = questions;
	Opt_1 = opt_1;
	Opt_2 = opt_2;
	Opt_3 = opt_3;
	Opt_4 = opt_4;
}
public String getQuestations() {
	return Questions;
}
public void setQuestions(String questations) {
	Questions = questations;
}
public String getOpt_1() {
	return Opt_1;
}
public void setOpt_1(String opt_1) {
	Opt_1 = opt_1;
}
public String getOpt_2() {
	return Opt_2;
}
public void setOpt_2(String opt_2) {
	Opt_2 = opt_2;
}
public String getOpt_3() {
	return Opt_3;
}
public void setOpt_3(String opt_3) {
	Opt_3 = opt_3;
}
public String getOpt_4() {
	return Opt_4;
}
public void setOpt_4(String opt_4) {
	Opt_4 = opt_4;
}
@Override
public String toString() {
	return "Questions [Questions=" + Questions + ", Opt_1=" + Opt_1 + ", Opt_2=" + Opt_2 + ", Opt_3=" + Opt_3
			+ ", Opt_4=" + Opt_4 + "]";
}
}
