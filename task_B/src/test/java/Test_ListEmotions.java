import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class Test_ListEmotions {

    // A_1 Tests
    @Test
    public void Test_EmptyList_howGivenManyEmotionTypeInListEmotions() {
        System.out.println("Test .... Test_EmptyList_howGivenManyEmotionTypeInListEmotions ... ");
        List lEmotions = new ArrayList<Emotion>();
        ListEmotions le = new ListEmotions(lEmotions);
        int howMany = le.howGivenManyEmotionTypeInListEmotions(EmotionType.Joy);
        System.out.println("How many emotions of type Joy=" + howMany);
        assertEquals(howMany, 0);
    }

    @Test
    public void Test_EmotionNotInList_howGivenManyEmotionTypeInListEmotions() {
        System.out.println("Test .... Test_EmotionNotInList_howGivenManyEmotionTypeInListEmotions ... ");
        List lEmotions = new ArrayList<Emotion>();
        lEmotions.add(new Emotion("disgust", EmotionType.Disgust));
        lEmotions.add(new Emotion("anger", EmotionType.Anger));
        lEmotions.add(new Emotion("anger", EmotionType.Anger));
        lEmotions.add(new Emotion("fear", EmotionType.Fear));
        lEmotions.add(new Emotion("fear", EmotionType.Fear));

        ListEmotions le = new ListEmotions(lEmotions);

        int howMany = le.howGivenManyEmotionTypeInListEmotions(EmotionType.Joy);
        System.out.println("How many emotions of type Joy=" + howMany);
        assertEquals(howMany, 0);
    }

    @Test
    public void Test_OnlyOne_howGivenManyEmotionTypeInListEmotions() {
        System.out.println("Test .... Test_OnlyOne_howGivenManyEmotionTypeInListEmotions ... ");
        List lEmotions = new ArrayList<Emotion>();
        lEmotions.add(new Emotion("disgust", EmotionType.Disgust));

        ListEmotions le = new ListEmotions(lEmotions);

        int howMany = le.howGivenManyEmotionTypeInListEmotions(EmotionType.Disgust);
        System.out.println("How many emotions of type Disgust=" + howMany);
        assertEquals(howMany, 1);
    }

    @Test
    public void Test_EmotionInList_howGivenManyEmotionTypeInListEmotions() {
        System.out.println("Test .... Test_EmotionInList_howGivenManyEmotionTypeInListEmotions ... ");
        List lEmotions = new ArrayList<Emotion>();
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("disgust", EmotionType.Disgust));
        lEmotions.add(new Emotion("anger", EmotionType.Anger));
        lEmotions.add(new Emotion("anger", EmotionType.Anger));
        lEmotions.add(new Emotion("fear", EmotionType.Fear));
        lEmotions.add(new Emotion("fear", EmotionType.Fear));

        ListEmotions le = new ListEmotions(lEmotions);

        int howMany = le.howGivenManyEmotionTypeInListEmotions(EmotionType.Joy);
        System.out.println("How many emotions of type Joy=" + howMany);
        assertEquals(howMany, 2);
    }

    @Test
    public void Test_All_howGivenManyEmotionTypeInListEmotions() {
        System.out.println("Test .... Test_All_howGivenManyEmotionTypeInListEmotions ... ");
        List lEmotions = new ArrayList<Emotion>();
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));
        lEmotions.add(new Emotion("joy", EmotionType.Joy));

        ListEmotions le = new ListEmotions(lEmotions);

        int howMany = le.howGivenManyEmotionTypeInListEmotions(EmotionType.Joy);
        System.out.println("How many emotions of type Joy=" + howMany);
        assertEquals(howMany, 6);
    }


    // A_2 Tests

    // Sample test case for the functionality "predominantEmotion"
    @Test
    public void Test_PredominantJoy_predominantEmotion() {
        System.out.println("Test .... Test_PredominantJoy_predominantEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        ListEmotions le = new ListEmotions(lEmotions);

        List<Emotion> lstPE = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + lstPE.size());
        assertEquals(lstPE.size(), 0);
    }

    @Test
    public void Test_PredominantAll_predominantEmotion() {
        System.out.println("Test .... Test_PredominantAll_predominantEmotion ... ");
        List<Emotion> emotionList = new ArrayList<>();
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("anger", EmotionType.Anger));
        emotionList.add(new Emotion("anger", EmotionType.Anger));
        emotionList.add(new Emotion("fear", EmotionType.Fear));
        emotionList.add(new Emotion("fear", EmotionType.Fear));
        emotionList.add(new Emotion("disgust", EmotionType.Disgust));
        emotionList.add(new Emotion("disgust", EmotionType.Disgust));
        emotionList.add(new Emotion("sadness", EmotionType.Sadness));
        emotionList.add(new Emotion("sadness", EmotionType.Sadness));
        ListEmotions le = new ListEmotions(emotionList);
        List<Emotion> resultList = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + resultList.size());
        assertEquals(resultList.size(), 10);
    }

    @Test
    public void Test_PredominantAllBoundary_predominantEmotion() {
        System.out.println("Test .... Test_PredominantAll_predominantEmotion ... ");
        List<Emotion> emotionList = new ArrayList<>();
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("anger", EmotionType.Anger));
        emotionList.add(new Emotion("fear", EmotionType.Fear));
        emotionList.add(new Emotion("disgust", EmotionType.Disgust));
        emotionList.add(new Emotion("sadness", EmotionType.Sadness));
        ListEmotions le = new ListEmotions(emotionList);
        List<Emotion> resultList = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + resultList.size());
        assertEquals(resultList.size(), 5);
    }

    @Test
    public void Test_PredominantNone_predominantEmotion() {
        System.out.println("Test .... Test_PredominantNone_predominantEmotion ... ");
        List<Emotion> emotionList = new ArrayList<>();
        ListEmotions le = new ListEmotions(emotionList);
        List<Emotion> resultList = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + resultList.size());
        assertEquals(resultList.size(), 0);
    }

    @Test
    public void Test_PredominantOne_predominantEmotion() {
        System.out.println("Test .... Test_PredominantOne_predominantEmotion ... ");
        List<Emotion> emotionList = new ArrayList<>();
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("anger", EmotionType.Anger));
        emotionList.add(new Emotion("anger", EmotionType.Anger));
        emotionList.add(new Emotion("fear", EmotionType.Fear));
        emotionList.add(new Emotion("fear", EmotionType.Fear));
        emotionList.add(new Emotion("disgust", EmotionType.Disgust));
        emotionList.add(new Emotion("disgust", EmotionType.Disgust));
        emotionList.add(new Emotion("sadness", EmotionType.Sadness));
        emotionList.add(new Emotion("sadness", EmotionType.Sadness));
        ListEmotions le = new ListEmotions(emotionList);
        List<Emotion> resultList = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + resultList.size());
        assertEquals(resultList.size(), 3);
    }

    @Test
    public void Test_PredominantOnlyOne_predominantEmotion() {
        System.out.println("Test .... Test_PredominantOne_predominantEmotion ... ");
        List<Emotion> emotionList = new ArrayList<>();
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        emotionList.add(new Emotion("joy", EmotionType.Joy));
        ListEmotions le = new ListEmotions(emotionList);
        List<Emotion> resultList = le.predominantEmotion();
        System.out.println("Number of Predominant Emotions=" + resultList.size());
        assertEquals(resultList.size(), 3);
    }


    // A_3 Tests
    
    @Test
    public void Test_EliminateOne_eliminateAllProvidedEmotion() {
        System.out.println("Test .... Test_EliminateOne_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eD = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);

        ListEmotions le = new ListEmotions(lEmotions);
        System.out.println("Number of  Emotions=" + le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }

    @Test
    public void Test_EliminateAll_eliminateAllProvidedEmotion() {
        System.out.println("Test .... Test_EliminateAll_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eJ2 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ2);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eJ3 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ3);
        Emotion eD = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        System.out.println("Number of  Emotions=" + le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        System.out.println("Number of Emotions after elimination=" + le.getNumberOfEmotions());
        assertEquals(le.getNumberOfEmotions(), 4);
    }

    @Test
    public void Test_EliminateAllElements_eliminateAllProvidedEmotion() {
        System.out.println("Test .... Test_EliminateAllElements_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eJ2 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ2);
        Emotion eJ3 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ3);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        System.out.println("Number of  Emotions=" + le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 0);
    }

    @Test
    public void Test_EliminateZeroElements_eliminateAllProvidedEmotion() {
        System.out.println("Test .... Test_EliminateZeroElements_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eD = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);

        ListEmotions le = new ListEmotions(lEmotions);
        System.out.println("Number of  Emotions=" + le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }

    @Test
    public void Test_EliminateFirstLast_eliminateAllProvidedEmotion() {
        System.out.println("Test .... Test_EliminateFirstLast_eliminateAllProvidedEmotion ... ");
        List<Emotion> testLstEmotions = new ArrayList<Emotion>();
        List lEmotions = new ArrayList<Emotion>();
        Emotion eJ = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ);
        Emotion eA = new Emotion("Anger", EmotionType.Anger);
        lEmotions.add(eA);
        Emotion eS = new Emotion("Sadness", EmotionType.Sadness);
        lEmotions.add(eS);
        Emotion eD = new Emotion("Disgust", EmotionType.Disgust);
        lEmotions.add(eD);
        Emotion eF = new Emotion("Fear", EmotionType.Fear);
        lEmotions.add(eF);
        Emotion eJ4 = new Emotion("Joy", EmotionType.Joy);
        lEmotions.add(eJ4);

        ListEmotions le = new ListEmotions(lEmotions);
        System.out.println("Number of  Emotions=" + le.getNumberOfEmotions());
        le.eliminateAllProvidedEmotion(EmotionType.Joy);
        assertEquals(le.getNumberOfEmotions(), 4);
    }
}
