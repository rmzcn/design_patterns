package Structural.Decorator;

public class CarRecognitionAIDecorator extends AIDecorator {
    private String carImageData;
    public CarRecognitionAIDecorator(IArtificialIntelligence AI, String carImageData) {
        super(AI);
        this.carImageData = carImageData;
    }

    @Override
    public void train() {
        super.train();
        System.out.println("The model is training with : "+ carImageData);
    }

    @Override
    public void recognizeObject() {
        super.recognizeObject();
        System.out.println("The Car recognized from the picture");
    }
}
