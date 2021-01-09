package Behavioral.Chain_of_Responsibility;

public abstract class DocumentHandler {
    public DocumentHandler NextHandler;
    public abstract void Document(DocumentTypes documentType);
}
