import java.util.*;

class dictionary{

	/*Positive statements get value +1*/;
	String[] good = {"good","vergood","kind","helpful","powerful","absolutely","accomplish","action","adorable","affluent","amazing","approve","awesome","accepted","accomplishment","active","adventure","agree","angelic","aptitude","acclaimed","achivement","admire","affirmative","agreeable","appealing","attractive","awesome","beaming","beautiful","believe","beneficial","bliss","bountiful","bounty","brave","bravo","brilliant","bubbly","calm","champy","cheery","classical","composed","cool","cute","celebrated","champion","choice","clean","congratulation","courageous","certain","charming","classic","commend","constant","creative","dazzling","delight","distinguished","divine","delightful","earnest","effective","effortless","enhancing","energetic","enthusiastic","ethical","exquisite","easy","effevescent","electrifying","encouraging","enegized","essential","excellent","ecstatic","efficient","elegant","endorsed","engaging","esteemed","exciting","fabulous","famous","fetching","flourishing","fresh","funny","fair","fantastic","fine","fortunate","friendly","familiar","favorable","fitting","free","fun","generous","genius","genuine","giving","glamourous","glowing","gorgeous","graceful","great","green","growing","grin","handsome","happy","healing","healthy","heavenly","honest","honored","hug","harmonious","hearty","honorable","idea","imagine","innovate","instantaneous","intelligent","ideal","impressive","innovative","instinctive","intuitive","imaginative","independent","instant","intellectual","inventive","jjovial","joy","jubliant","keen","kind","knowing","knowledgeable","laugh","light","lucid","learned","lively","lucky","legendary","lovely","luminous","marvelous","masterful","merit","meritorious","motivating","moving","meaningful","miraculous","natural","now","nice","nurturing","novel","nutritious","okay","open","one","optimistic","one-hundred percent","paradise","pleasant","poised","positive","pretty","progress","proud","perfect","pleasurable","polished","powerful","principled","prominent","phenomenal","plentiful","popular","prepared","productive","protected","quality","quick","quiet","ready","refreshing","remarkable","restored","right","reassuring","rejoice","resounding","reward","robust","refined","reliable","respected","rewarding","safe","seemly","skillful","satisfactory","simple","skilled","smile","secure","soulful","sparkling","special","spirited","spiritual","stirring","stunning","stupendous","sucess","sucessfull","sunny","super","superb","supporting","surprising","terrific","thorough","thrilling","thriving","tops","tranquil","transformative","transforming","trusting","truthful","unreal","unwavering","up","upbeat","upright","upstanding","valued","vibrant","victorious","victory","vigorous","virtuous","vital","vivacious","wealthy","welcome","well","whole","wholesome","willing","wonderful","wondrous","worthy","wow","yes","yummy","zeal","zealous"};

	/*Negative statements get value -1*/;
	String[] bad = {"bad","verybad","cruel","unhelpful","nopower","abysmal","angry","apathy","awful","adverse","annoy","appalling","alarming","anxious","atrocious","bad","belligerent","boring","banal","bemoan","broken","barbed","beneath","callous","can't","coarse","cold","collapse","confused","contrary","corrosive","crazy","creepy","cruel","cry","clumsy","cold-hearted","contradictory","corrupt","corrupt","criminal","cutting","damage","dead","deny","deprived","dirty","disheveled","dismal","dreadful","damaging","decaying","deplorable","despicable","disease","dishonest","distress","dreary","dastardly","deformed","depressed","detrimental","disgusting","dishonarable","don't","enraged","eroding","evil","fail","feeble","foul","faulty","fight","frighten","fear","filthy","frightful","gawky","ghastly","greed","grim","gross","grotesque","guilty","grave","grimance","gruesome","haggard","hard","harmful","hate","homley","horeendous","hurt","hostile","hard-hearted","hideous","horrible","hurtful","icky","ill","impossible","infernal","insane","ignorant","immature","inane","injure","insidious","ignore","imperfect","inelegant","injurious","insipid","jealous","junky","lose","lousy","lumpy","malicious","mean","messy","misshapen","misunderstood","moan","monstrous","menacing","missing","moldy","naive","nasty","negate","negative","no","nobody","nonsense","not","naughty","never","nondescript","noxious","objectionable","odious","old","oppressive","offensive","pain","perturb","petty","plain","poor","prejudice","pessimistic","poisonus","questionable","quirly","quit","reject","reptillian","revenge","rotten","renege","repugnant","revolting","rude","repellant","repulsive","rocky","ruthless","sad","savage","scary","shocking","sickening","scream","shoddy","sinister","smelly","sobbing","spiteful","sticky","stormy","stressful","stupid","substandard","suspicious","tense","terrible","threatning","terrifying","ugly","undermine","unfavorable","unhappy","unjust","unlucky","unsatisfactory","unsightly","unwanted","unwelcome","unwieldy","unwise","unfair","unhealthy","unpleasant","untoward","unwholesome","upset","vice","villainous","vicious","vindictive","vile","wary","weary","woeful","worthless","wickled","wound","yell","yucky","zero","dosent","null","bad","verybad","cruel","unhelpful","nopower","abysmal","angry","apathy","awful","adverse","annoy","appalling","alarming","anxious","atrocious","bad","belligerent","boring","banal","bemoan","broken","barbed","beneath","callous","can't","coarse","bad","verybad","cruel","unhelpful","nopower","abysmal","angry","apathy","awful","adverse","annoy","appalling","alarming","anxious","atrocious","bad","belligerent","boring","banal","bemoan","broken"};

	void dictionary(){

	}

	void check(String k){
		
		String j = k;
		int counter = 0;
		int found = 0;
		String[] j1 = j.split(" ");

		for(int i=0;i<j1.length;i++){
			for(int l=0;l<bad.length;l++){
				if(j1[i].equals(good[l])){
					counter++;
					found++;
				}
				else if(j1[i].equals(bad[l])){
					counter--;
					found++;
				}
				else{
					counter = counter;	
				}
			}
		}

			if(found == 0){
				found = 1;
			}
		
			 double percentage = (counter/found)*100;
		
		

		if(counter>0){
			System.out.println("Positive statement Given and positivity percentage is : "+ percentage+ "%");
		}
		else if(counter<0){
			System.out.println("Negative statement Given and Negativity percentage is : "+ percentage+ "%");
		}
		else if(counter == 0){
			System.out.println("Neutral statement Given");
		}

	}
}

class comment{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a statement to check it's positive or negative :\n");
		String s = sc.nextLine();
		dictionary s1 = new dictionary();
		s1.check(s);		



	}
}
