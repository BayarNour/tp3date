package tp2v2;

import java.util.Scanner;

public class maintp2 {
	    public static void main(String[] args) {
			MaDate date1 = new MaDate(31, 12, 2023);
			System.out.println("Date 1: " + date1);
			date1.ajouterUnJour();
			System.out.println("apres: " + date1);
			date1.ajouterPlusieursJours(5);
			System.out.println("apres ajout plusieurs jours: " + date1);
			date1.ajouterUnMoi();
			System.out.println("apres ajout mois: " + date1);
			date1.ajouterUnAn();
			System.out.println("Après ajout annee: " + date1);
			MaDate date2 = new MaDate(29, 2, 2024);
			System.out.println("Date 2: " + date2);
			date2.ajouterUnJour();
			System.out.println("apres ajout jour date bissextile: " + date2);
			}

}
