import java.util.Arrays;

public class Test {
    private int testId;
    private String testName;
    private String doTest;
    
     Question[] questions;
     int questionCount;

    public Test(int testId, String testName, String doTest, int maxQuestions) {
        this.testId = testId;
        this.testName = testName;
        this.doTest = doTest;
        this.questions = new Question[maxQuestions];
        this.questionCount = 0;
    }
    
    public int getTestId() {
		return testId;
	}


	public String getTestName() {
		return testName;
	}


	public String getDoTest() {
		return doTest;
	}


	public Question[] getQuestions() {
		return questions;
	}


	public int getQuestionCount() {
		return questionCount;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public void setDoTest(String doTest) {
		this.doTest = doTest;
	}


	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}


	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}


	public void addQuestion(Question q) {
        if (questionCount < questions.length) {
            this.questions[questionCount] = q;
            questionCount++;
        } else {
            System.out.println("Error: Cannot add more questions. Test capacity is full.");
        }
    }

 
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", doTest=" + doTest + ", questions="
				+ Arrays.toString(questions) + ", questionCount=" + questionCount + "]";
	}
    
    
    
}