import java.util.Scanner;
class Ques
{
	int quesNo;
	String question;
	String opt1,opt2,opt3,opt4;
	int optNo1,optNo2,optNo3,optNo4;
	int ans,userAns;
}

class Quiz
{
	Ques que[];
	int quesCount;
	Quiz()
	{
	    que = new Ques[5];
	    quesCount = -1;
	    getQuestions();
	}

    public void result()
    {
        int r=0,w=0,na=0;
        for(int i=0;i<=quesCount;i++)
        {
        	if(que[i].userAns==0)
        		na++;
        	if(que[i].ans==que[i].userAns)
        		r++;
        	else 
        		w++;
        } 
        System.out.println("Right Answer: "+r+", Wrong Answer: "+w+", Not Attempt: "+na);
    }
    public void getQuestions()
    {
    	/*1------------------------------------*/
    	Ques q = new Ques();
    	q.quesNo = 1;
    	q.question = "Full form of OOPs?";
    	q.opt1 = "Object Operational Program";
    	q.opt2 = "Optional Object Program";
    	q.opt3 = "Object Oriented Program";
    	q.opt4 = "Oriented Object Program";
    	q.ans = 3;
    	que[++quesCount] = q;
    	/*2------------------------------------*/
    	q = new Ques();
    	q.quesNo = 2;
    	q.question = "How many primitive data types in java?";
    	q.opt1 = "8";
    	q.opt2 = "9";
    	q.opt3 = "10";
    	q.opt4 = "6";
    	q.ans = 1;
    	que[++quesCount] = q;
    	/*3------------------------------------*/
    	q = new Ques();
    	q.quesNo = 3;
    	q.question = "Which inheritance type is not supported by java?";
    	q.opt1 = "Multilevel";
    	q.opt2 = "Single";
    	q.opt3 = "Multiple";
    	q.opt4 = "both 1 & 2";
    	q.ans = 3;
    	que[++quesCount] = q;
    	/*4------------------------------------*/
    	q = new Ques();
    	q.quesNo = 4;
    	q.question = "Which member is not visible in child class in java?";
    	q.opt1 = "public";
    	q.opt2 = "private";
    	q.opt3 = "protected";
    	q.opt4 = "both 1 & 2";
    	q.ans = 2;
    	que[++quesCount] = q;
    	/*5------------------------------------*/
    	q = new Ques();
    	q.quesNo = 5;
    	q.question = "Unused keyword in java?";
    	q.opt1 = "this";
    	q.opt2 = "super";
    	q.opt3 = "goto";
    	q.opt4 = "null";
    	q.ans = 3;
    	que[++quesCount] = q;

    }
    public void showQuestion()
    {
    	int quesNo=0;
    	char ch;
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		int i;
    		System.out.println(que[quesNo].quesNo+": "+que[quesNo].question);
    		System.out.println("1-> "+que[quesNo].opt1);
    		System.out.println("2-> "+que[quesNo].opt2);
    		System.out.println("3-> "+que[quesNo].opt3);
    		System.out.println("4-> "+que[quesNo].opt4);
    		if(que[quesNo].userAns!=0)
    			System.out.println("Your Ans: "+que[quesNo].userAns);
    		System.out.println("Enter your option choice");
    		try{
    			i = sc.nextInt();
    			que[quesNo].userAns = i;
    		}
    		catch(Exception e){}

    		System.out.println("\nFor previous Press (P),For Next Press (N),For Submission press (s)");

    		ch = sc.next().charAt(0);

    		if(ch=='p' || ch=='P')
    		{
    			if(quesNo!=0)
    				quesNo--;
    		}
    		else if(ch=='n' || ch=='N')
    		{
    			if(quesNo!=quesCount)
    				quesNo++;
    		}
    		else if(ch=='s' || ch=='S')
    		{
    			result();
    			break;
    		}
    	}
    }
}

class Test
{
	public static void main(String [] args)
	{
		Quiz q = new Quiz();
		q.showQuestion();
	}
}