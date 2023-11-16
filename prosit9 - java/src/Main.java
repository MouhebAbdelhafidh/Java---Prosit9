public class Main {
    public static void main(String[] args) {

        Employe employe1 = new Employe(1, "Mouheb", "Abd", "Dep1", 10);
        Employe employe2 = new Employe(2, "Amen", "Abd", "Dep2", 11);


        SocieteArrayList societe = new SocieteArrayList();


        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);


        System.out.println("List of Employes:");
        societe.displayEmploye();


        String searchName = "Mohamed";
        boolean employeFound = societe.rechercherEmploye(searchName);
        if (employeFound) {
            System.out.println("Employe with name " + searchName + " found.");
        } else {
            System.out.println("Employe with name " + searchName + " not found.");
        }


        societe.trierEmployeParId();


        System.out.println("\nList of Employes after sorting by ID:");
        societe.displayEmploye();

        //societe.trierEmployeParNomDepartementEtGrade();

        System.out.println("\nList of Employes after sorting by Name, Department, and Grade:");
        societe.displayEmploye();
    }
}

