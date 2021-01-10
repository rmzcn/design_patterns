package Structural.Decorator;

public class FaceRecognitionAIDecorator extends AIDecorator {
    private String faceTrainData;
    public FaceRecognitionAIDecorator(IArtificialIntelligence AI, String faceTrainData) {
        super(AI);
        this.faceTrainData = faceTrainData;
    }

    @Override
    public void train() {
        super.train();
        System.out.println("The model is training with : "+ faceTrainData);
    }

    @Override
    public void recognizeObject() {
        super.recognizeObject();
        System.out.println("Person recognized from the picture");
    }
}
