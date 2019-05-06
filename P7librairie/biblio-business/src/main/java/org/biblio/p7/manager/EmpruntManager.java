package org.biblio.p7.manager;

import org.biblio.p7.bean.Emprunt;

import java.util.List;

public interface EmpruntManager {
    public List<Emprunt> afficherlesemprunts();

    public void ajouterunemprunt(Emprunt emprunt);

    public Emprunt supprimerEmprunt(Integer iD);

    public void modifierEmprunt(Emprunt emprunt);

    public Emprunt rechercherEmpruntparId(Integer iD);

    public List<Emprunt> afficherlesempruntsparsituation(Integer iD);

    public List<Emprunt> afficherlesempruntsenretard();

    public List<Emprunt> afficherlesempruntsparLecteur(Integer iD);

    public List<Emprunt> afficherleslivresdisponible();

    public List<Emprunt> afficherlesempruntbyexmemplaire(Integer iD);

    public Emprunt rechercherEmpruntparexp(Integer iD);

    public List<Emprunt> rechercherEmpruntparisbn(String isbn);

    public List<Emprunt> afficherlesempruntsparLecteurencours(Integer iD);

    public Emprunt addemprunt(Emprunt emprunt);
}
