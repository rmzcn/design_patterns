package Structural.Decorator;

public class AIDecorator implements IArtificialIntelligence{
    IArtificialIntelligence AI;

    public AIDecorator(IArtificialIntelligence AI) {
        this.AI = AI;
    }

    @Override
    public void train() {
        AI.train();
    }

    @Override
    public void recognizeObject() {
        AI.recognizeObject();
    }
}
