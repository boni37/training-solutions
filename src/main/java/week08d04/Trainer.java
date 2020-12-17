package week08d04;

public class Trainer {

    CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    int giveMark(){
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer(new GoodMood());
        System.out.println(trainer.giveMark());

        Trainer anotherTrainer = new Trainer(new BadMood());
        System.out.println(anotherTrainer.giveMark());
    }
}
