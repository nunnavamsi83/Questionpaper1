package quizeApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Exam e= new Exam();
		e.online();
	}

}


class Exam{
	Scanner scanner = new Scanner(System.in);
	private int correctQns,countQns,wrongQns;
	
	public void online() {
		
		QuestionPaper qs1 = new QuestionPaper("  A sum of Rs 7500 amounts to Rs 9075 at 10% p.a in a certain time, when the interest is compounding annually.\r   What is the amount in (Rs) of the sum at the same sum at the same rate for  th of the earlier time.",
				"a. 9412","b. 9438","c. 9680","d. 9580");//b
		QuestionPaper qs2 = new QuestionPaper("  Select the option that gives the most appropriate meaning of the underlined word The prophetic qualities of the sooth sayer’s speeches earned them a great position in the Roman empire"
				,"a. Speculative","b. preventive","c. punitive","d. predictive");//d
		QuestionPaper qs3= new QuestionPaper("  Select the most appropriate Antonym of the given word: \n 	Compassionate" ,"a. peerless","b. virulent","c. Antipooginisit","d. Ruthless");//d
		QuestionPaper qs4= new QuestionPaper("  Select the most appropriate Antonym for the given word below. \n      Auspicious" ,"a. Felicitous","b. Ominous","c. Pompous","d. Vicious");//b
		QuestionPaper qs5= new QuestionPaper("  Lower taxes will be an incentive to work harder","a. motivation","b. Occupation","c. Asset","d. Privilege");//a
		
		Map<QuestionPaper,Character> store= new HashMap();
		store.put(qs1,'b');
		store.put(qs2,'d');
		store.put(qs3,'d');
		store.put(qs4,'b');
		store.put(qs5,'a');
		
		for(Entry<QuestionPaper, Character> map:store.entrySet())
		{
			
			System.out.println((++countQns)+")"+map.getKey().getQuestion());
			System.out.println(map.getKey().getOption1());
			System.out.println(map.getKey().getOption2());
			System.out.println(map.getKey().getOption3());
			System.out.println(map.getKey().getOption4());
			System.out.println("\r");
			System.out.print("choose your option :");
			
			Character c = scanner.next().charAt(0);
			
			int equals=Character.compare(c,map.getValue());
			
			/*enter value - given value
			 * a-a=0
			 * a-s=number
			 * 
			 */
			
			if(equals==0) {
				
				System.out.println("\r* * * Write answer * * *\n");
				correctQns++;
			}
			else {
				System.err.println(" wrong Answer ");
				System.out.println("Correct option is : "+map.getValue()+"\r");
				wrongQns++;
			}
			
		}
		
		System.out.println("No.of Question : "+store.size());
		System.out.println("correct Ans  : "+correctQns
						    +" \n"+"wrong Ans    : "+wrongQns+"\r"
						    + "percentage : "+correctQns*100/store.size()+"%");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
