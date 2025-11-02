public class Question {
    private String questionText;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;
    private int marks;

    public Question(String questionText, String opt1, String opt2, String opt3, String opt4, String answer, int marks) {
        this.questionText = questionText;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
        this.marks = marks;
    }

    

	public String getQuestionText() {
		return questionText;
	}



	public String getOpt1() {
		return opt1;
	}



	public String getOpt2() {
		return opt2;
	}



	public String getOpt3() {
		return opt3;
	}



	public String getOpt4() {
		return opt4;
	}



	public String getAnswer() {
		return answer;
	}



	public int getMarks() {
		return marks;
	}



	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String toString() {
		return "Question [questionText=" + questionText + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
				+ ", opt4=" + opt4 + ", answer=" + answer + ", marks=" + marks + "]";
	}
    
    
    
    
}    