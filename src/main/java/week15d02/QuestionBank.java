package week15d02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class QuestionBank {

    private List<Answer> quizQuestAndAns = new ArrayList<>();


    public List<Answer> getQuizQuestAndAns() {
        return new ArrayList<>(quizQuestAndAns);
    }

    public List<String> getQuestionsByTheme(String theme){
        List<String> result = new ArrayList<>();
        for (Answer actual: quizQuestAndAns){
            if(actual.getTheme().equals(theme)){
                result.add(actual.getQuestion());
            }
        }return result;
    }

    public Answer getRandomQuestion(List<Answer> list){
        Random random= new Random();
        int i = random.nextInt(list.size());
        System.out.println(i);
        return list.get(i);
    }

    public List<Answer> orderedByTheme(List<Answer> list){
        List<Answer> result = new ArrayList<>(list);
        Collections.sort(result);
        return result;
    }



    public static void main(String[] args) throws IOException {
        QuestionBank questionBank = new QuestionBank();
        Path file = Path.of("kerdesek.txt");
        List<Answer> quizQuestAndAns = new ArrayList<>();
        List<String> fullText = Files.readAllLines(file);
        for(int i= 0; i< fullText.size();i+=2){
            String question = fullText.get(i);
            String[] fullAnswer = fullText.get(i+1).split(" ");
            String answer = fullAnswer[0];
            int point = Integer.parseInt(fullAnswer[1]);
            String theme = fullAnswer[2];
            quizQuestAndAns.add(new Answer(question,answer,point,theme));
        }
        System.out.println(questionBank.getQuestionsByTheme("matematika"));
        System.out.println(questionBank.getRandomQuestion(quizQuestAndAns));
        System.out.println(questionBank.orderedByTheme(quizQuestAndAns));
    }
}
