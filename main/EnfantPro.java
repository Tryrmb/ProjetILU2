// Projet EnfantPro+ : Refactorisation pour compilation correcte

// Package : main
package main;

import InterfaceUtilisateur.BoundaryMenuPrincipal;

public class EnfantPro {
    public static void main(String[] args) {
        BoundaryMenuPrincipal menu = new BoundaryMenuPrincipal();
        menu.afficherMenuPrincipal();
    }
}