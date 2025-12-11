import java.util.Scanner;

public class QuestionsService {
    
Question[] questions = new Question[5];
String userAnswere[] = new String[5];

public QuestionsService(){
    
        questions[0] = new Question(
            0,
            "What is the largest planet in our solar system?",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Jupiter"
            );

            questions[1] = new Question(
                1,
                "Who wrote the play 'Romeo and Juliet'?",
                "William Shakespeare",
                "Charles Dickens",
                "Mark Twain",
                "Leo Tolstoy",
                "William Shakespeare"
            );

            questions[2] = new Question(
                2,
                "What is the fastest land animal?",
                "Cheetah",
                "Lion",
                "Horse",
                "Leopard",
                "Cheetah"
            );

            questions[3] = new Question(
                3,
                "Which country is known as the Land of the Rising Sun?",
                "China",
                "Japan",
                "South Korea",
                "Thailand",
                "Japan"
            );

            questions[4] = new Question(
                4,
                "What gas do plants absorb from the atmosphere?",
                "Oxygen",
                "Nitrogen",
                "Carbon dioxide",
                "Helium",
                "Carbon dioxide"
            );

}

public void playQuiz(){
    int i = 0;
    for(Question q : questions){
        System.out.println("Questtion number "+q.getId());
        System.out.println(q.getQuestion());

        System.err.println(q.getOption1());
        System.err.println(q.getOption2());
        System.err.println(q.getOption3());
        System.err.println(q.getOption4());

        Scanner sc = new Scanner(System.in);
        userAnswere[i] = sc.nextLine();
        i++;
    }
}

public void printScore(){
    int score = 0;
    
    for(int i =0; i<questions.length ; i++){
        
        Question que = questions[i];
        String answ = que.getAnswere();

        String userAnsw = userAnswere[i];

        if(answ.equals(userAnsw)){
            score++;
        }
    }
    System.out.println("Your socre is " + score);
}

}
