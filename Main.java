public class Main{
    public static void main(String[] args){
        
        QuestionsService quest = new QuestionsService();  

        quest.playQuiz();
        quest.printScore();
    }
}