package Behavioral.Chain_of_Responsibility;

public class AcceptanceConcreteHandler extends DocumentHandler {
    @Override
    public void Document(DocumentTypes documentType) {
        if(DocumentTypes.ACCEPTANCE == documentType){
            System.out.println("Document Type: " + documentType.toString());
        }
        else{
            if(NextHandler != null){
                NextHandler.Document(documentType);
            }
        }
    }
}
