import java.util.*;

public class SocieteArrayList implements IGestion<Employe> {

    private List L = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe e) {
        L.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        Iterator<Employe> iterator = L.iterator();
        while (iterator.hasNext()) {
            Employe e = iterator.next();
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        Iterator<Employe> iterator = L.iterator();
        while (iterator.hasNext()) {
            Employe e = iterator.next();
            if (e.equals(employe)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        if(L.contains(employe))
            L.remove(employe);
        else
            System.out.println("Doesn't exist");
    }

    @Override
    public void displayEmploye() {
        System.out.println(L);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(L);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(L, Comparator.comparing(Employe::getNom)
                .thenComparing(Employe::getNomDepartement)
                .thenComparingInt(Employe::getGrade));
    }
}