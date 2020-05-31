import java.util.*;
import java.util.stream.Collectors;

public class ListEmotions {

    private List<Emotion> lstEmotions;

    public ListEmotions(List<Emotion> newLstEmotions) {
        this.lstEmotions = newLstEmotions;
    }

    public int getNumberOfEmotions() {
        return lstEmotions.size();
    }

    // Task A_1
    // return the number of emotion of the given EmotionType et
    // Remark: No test cases are going to be created.
    public int howGivenManyEmotionTypeInListEmotions(EmotionType et) {
        int nJE = 0;
        for (Emotion emotion : this.lstEmotions) {
            if (emotion.getEmotionType() == et) {
                nJE++;
            }
        }
        return nJE;
    }

    // Task A_2
    // return the list of predominant emotions
    // Remark: Create a set of test cases to assess the correctness of your code.
    //         Create a class to test this method, several test cases are needed.
    //         One sample test case is provided in cladd Test_ListEmotions.
    public List<Emotion> predominantEmotion() {
        List<Emotion> lstEPredominant = new ArrayList<Emotion>();
        Map<EmotionType, Long> emotionsOccur = this.lstEmotions.stream()
                .collect(Collectors.groupingBy(Emotion::getEmotionType,
                        TreeMap::new,
                        Collectors.counting()));
        if(emotionsOccur.values().isEmpty()){
            return lstEPredominant;
        }
        Long maxOccur = Collections.max(emotionsOccur.values());
        emotionsOccur.forEach((key, value) -> {
            if (value.equals(maxOccur)) {
                this.lstEmotions
                        .forEach(xx -> {
                            if (xx.getEmotionType().equals(key)) {
                                lstEPredominant.add(xx);
                            }
                        });
            }
        });

        return lstEPredominant;
    }

    // Task A_3
    // Eliminate the emotions that are of given type EmotionType et
    // Remark: A set of test cases to assess the correctness of your code is provided.
    //         A class to test this method was created, several test cases were added.
    //         Use the test cases to check for your code.
    public void eliminateAllProvidedEmotion(EmotionType et) {
        this.lstEmotions = this.lstEmotions
                .stream()
                .filter(x -> !x.getEmotionType().equals(et))
                .collect(Collectors.toList());
    }
}
