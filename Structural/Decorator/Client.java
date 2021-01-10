package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        String textData = "simple_ai_text_data.csv";
        String faceTrainData = "face_recognizer_ai_image_data.csv";
        String carImageData = "car_recognizer_ai_image_data.csv";
        IArtificialIntelligence simpleModel = new SimpleTextRecognizerAI(textData);
        IArtificialIntelligence faceRecognizerModel = new FaceRecognitionAIDecorator(simpleModel,faceTrainData);
        IArtificialIntelligence carRecognizerModel = new CarRecognitionAIDecorator(faceRecognizerModel,carImageData);

        //training final model
        carRecognizerModel.train();
        //predict
        carRecognizerModel.recognizeObject();
    }
}
