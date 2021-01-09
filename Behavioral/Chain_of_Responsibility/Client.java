package Behavioral.Chain_of_Responsibility;

public class Client {
    public static void main(String[] args) {
        DocumentHandler resignation = new ResignationConcreteHandler();
        DocumentHandler acceptance = new AcceptanceConcreteHandler();
        DocumentHandler certification = new CertificationConcreteHandler();

        resignation.NextHandler = acceptance;
        acceptance.NextHandler = certification;
        certification.NextHandler = resignation;

        resignation.Document(DocumentTypes.CERTIFICATION);
    }
}
