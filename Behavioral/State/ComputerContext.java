package Behavioral.State;

public class ComputerContext {
    private IComputerState pcState;
    public ComputerContext() {
        setComputerState(new ComputerPowerOffState());
    }
    public void powerOn(){
        pcState.powerOn();
        if (pcState instanceof ComputerPowerOffState){
            setComputerState(new ComputerPowerOnState());
            System.out.println("Computer state is changed");
        }
    }
    public void powerOff(){
        pcState.powerOff();
        if (pcState instanceof ComputerPowerOnState){
            setComputerState(new ComputerPowerOffState());
            System.out.println("Computer state is changed");
        }
    }
    public void setComputerState(IComputerState state){
        this.pcState = state;
    }
    public IComputerState getComputerState(){
        return this.pcState;
    }
}
