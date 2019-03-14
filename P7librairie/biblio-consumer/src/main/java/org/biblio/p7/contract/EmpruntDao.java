package org.biblio.p7.contract;

import org.biblio.p7.bean.Emprunt;
import org.biblio.p7.bean.SituationDemprunt;

import java.util.List;

public interface EmpruntDao {
    public List<Emprunt> afficherlesemprunts();

    public void ajouterunemprunt(Emprunt emprunt);

    public Emprunt supprimerEmprunt(Integer iD);

    public void modifierEmprunt(Emprunt emprunt);

    public Emprunt rechercherEmpruntparId(Integer iD);

    public List<Emprunt> afficherlesempruntsparsituation(Integer iD);

    public List<Emprunt> afficherlesempruntsenretard();

    public List<Emprunt> afficherlesempruntsparLecteur(Integer iD);

    public List<Emprunt> afficherleslivresdisponible();

    public SituationDemprunt recherchersituationdemprunt(int id);


}
