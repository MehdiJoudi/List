public class Main {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant(1, "Joudi", "Mehdi");
        Etudiant etudiant2 = new Etudiant(2, "Kouki", "Iheb");

        System.out.println("Test de la classe Etudiant :");
        System.out.println(etudiant1);
        System.out.println(etudiant2);

        University espritVector = new EspritVector();
        espritVector.ajouterEtudiant(etudiant1);
        espritVector.ajouterEtudiant(etudiant2);

        System.out.println("\nTest de la classe EspritVector :");
        espritVector.displayEtudiants();

        University espritArrayList = new EspritArrayList();
        espritArrayList.ajouterEtudiant(etudiant2);
        espritArrayList.ajouterEtudiant(etudiant1);

        System.out.println("\nTest de la classe EspritArrayList :");
        espritArrayList.displayEtudiants();
    }
}
