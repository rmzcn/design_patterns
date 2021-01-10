package Structural.Decorator;

public class SimpleTextRecognizerAI implements IArtificialIntelligence {
    private String trainData;

    public SimpleTextRecognizerAI(String trainData) {
        this.trainData = trainData;
    }

    @Override
    public void train() {
        System.out.println("The model is training with : "+ trainData);
    }

    @Override
    public void recognizeObject() {
        System.out.println("'Ramazan' recognized from the picture");
    }
}
